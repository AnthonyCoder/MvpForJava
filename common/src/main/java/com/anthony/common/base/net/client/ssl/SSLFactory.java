package com.anthony.common.base.net.client.ssl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/**
 * 创建时间:2019/8/6
 * 创建人：anthony.wang
 * 功能描述：写了两种方式 默认是信任任何证书 还有一种是信任指定证书
 */
public class SSLFactory {
    public static synchronized X509TrustManager getX509TrustManager(){
        return new X509TrustManager() {
                    public void checkClientTrusted(X509Certificate[] x509Certificates, String s) {

                    }

                    public void checkServerTrusted(X509Certificate[] x509Certificates, String s) {
                    }

                    public X509Certificate[] getAcceptedIssuers() {
                        return new X509Certificate[0];
                    }
        };
    }
    public static synchronized SSLSocketFactory getDefaultSSLSocketFactory() {//这么用的话，任意证书都会信任，容易被中间人攻击
        try {
            SSLContext sslContext = SSLContext.getInstance("TLS");
            sslContext.init(null,new TrustManager[]{getX509TrustManager()}, null);
            return sslContext.getSocketFactory();
        } catch (GeneralSecurityException e) {
            throw new AssertionError();
        }
    }

    public static synchronized SSLSocketFactory getCoustomSSLSocketFactory() {//以anchor.crt以及它签发的证书作为信任锚点 更加安全
        try {
            // 取到证书的输入流
            InputStream is = new FileInputStream("anchor.crt");

            CertificateFactory cf = CertificateFactory.getInstance("X.509");
            Certificate ca = cf.generateCertificate(is);

            // 创建 Keystore 包含我们的证书
            String keyStoreType = KeyStore.getDefaultType();
            KeyStore keyStore = KeyStore.getInstance(keyStoreType);
            keyStore.load(null);
            keyStore.setCertificateEntry("anchor", ca);

            // 创建一个 TrustManager 仅把 Keystore 中的证书 作为信任的锚点
            String algorithm = TrustManagerFactory.getDefaultAlgorithm();
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(algorithm);
            trustManagerFactory.init(keyStore);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();

            // 用 TrustManager 初始化一个 SSLContext
            SSLContext sslContext = SSLContext.getInstance("TLS");
            sslContext.init(null, trustManagers, null);
            return sslContext.getSocketFactory();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (CertificateException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (KeyStoreException e) {
            e.printStackTrace();
        } catch (KeyManagementException e) {
            e.printStackTrace();
        }
        return null;
    }
}
