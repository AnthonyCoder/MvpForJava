package com.anthony.home.bean.request;

import com.anthony.common.base.net.model.BaseRequesModel;

/**
 * 创建时间:2019/8/27
 * 创建人：anthony.wang
 * 功能描述：
 */
public class TestLogRequestBean extends BaseRequesModel {
    private String AccessToken;
    private String CultureCode;
    private DeviceKeyModel Device;
    private String AppName;
    public static class DeviceKeyModel {
        /**
         * SystemName : String
         * SystemVersion : String
         * PlatformName : String
         * DeviceUnique : String
         */

        private String SystemName;
        private String SystemVersion;
        private String PlatformName;
        private String DeviceUnique;

        public String getSystemName() {
            return SystemName;
        }

        public void setSystemName(String SystemName) {
            this.SystemName = SystemName;
        }

        public String getSystemVersion() {
            return SystemVersion;
        }

        public void setSystemVersion(String SystemVersion) {
            this.SystemVersion = SystemVersion;
        }

        public String getPlatformName() {
            return PlatformName;
        }

        public void setPlatformName(String PlatformName) {
            this.PlatformName = PlatformName;
        }

        public String getDeviceUnique() {
            return DeviceUnique;
        }

        public void setDeviceUnique(String DeviceUnique) {
            this.DeviceUnique = DeviceUnique;
        }
    }

    public String getAccessToken() {
        return AccessToken;
    }

    public void setAccessToken(String accessToken) {
        AccessToken = accessToken;
    }

    public String getCultureCode() {
        return CultureCode;
    }

    public void setCultureCode(String cultureCode) {
        CultureCode = cultureCode;
    }

    public DeviceKeyModel getDevice() {
        return Device;
    }

    public void setDevice(DeviceKeyModel device) {
        Device = device;
    }

    public String getAppName() {
        return AppName;
    }

    public void setAppName(String appName) {
        AppName = appName;
    }
}
