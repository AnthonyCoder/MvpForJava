# 使用Java构建的一个模块化的MVP的项目

## 个人项目仅供学习使用，感谢以下开放Api：
- [玩Android](https://www.wanandroid.com/blog/show/2)
- [干货集中营](http://gank.io/api)
- [开眼视频](https://github.com/tonycheng93/Eyepetizer/blob/master/doc/%E5%BC%80%E7%9C%BC%E8%A7%86%E9%A2%91API%E6%96%87%E6%A1%A3.md)
## Demo简介
- 该 Demo 更加详细的封装思路，请点击文章[如何既装逼又优雅的设计一个模块化的MVP架构](https://juejin.im/post/5d8f007e6fb9a04e065d5e46)
- 提供给初中级开发者学习**模块化的项目结构搭建**
- 帮助开发者快速开发，demo很多地方可以灵活配置，可直接clone本项目到本地进行项目创建 
- 本Java版本项目也同时依赖了Kotlin，并仅在view层(Activity/Fragment)内使用了Kotlin编写，方便开发者后期混合编程或者转向Kotlin开发，为此我还同时写了[一个纯Kotlin版本的Demo](https://github.com/AnthonyCoder/MvpForKotlin),感兴趣的朋友可以点击看看
- **希望路过的各位开发好汉，觉得不错的帮忙点个Star，谢谢~~**
## 功能预览：

![](https://github.com/AnthonyCoder/MvpForJava/blob/master/gif/gifhome_320x640_13s.gif)

## 主要开源框架：
- [Rxjava2](https://github.com/ReactiveX/RxJava/tree/2.x)
- [Rxandroid2](https://github.com/ReactiveX/RxAndroid)
- [Retrofit2](https://github.com/square/retrofit)
- [Okhttp3](https://github.com/square/okhttp)
- [Gson](https://github.com/google/gson)
- [Logger](https://github.com/orhanobut/logger)
- [AutoDispose](https://github.com/uber/AutoDispose)
- [Glide](https://github.com/bumptech/glide)
- [Arouter](https://github.com/alibaba/ARouter/blob/master/README_CN.md)
- [Eventbus](https://github.com/greenrobot/EventBus)
- [GreenDao](https://github.com/greenrobot/greenDAO)
- [Andpermission](https://github.com/yanzhenjie/AndPermission)
- [X5webview](https://x5.tencent.com/)
- [FlycoTabLayout](https://github.com/H07000223/FlycoTabLayout)
- [Banner](https://github.com/youth5201314/banner)
- [SmartRefreshLayout](https://github.com/scwang90/SmartRefreshLayout)

## 特点功能
- 项目架构使用了符合绝大部分项目使用的 MVP 架构模式，并使用模块化设计方便多人维护
- 使用了目前最流行的 RxJava2+Retrofit2+Okhttp3 作为网络框架搭建
- 支持多BaseUrl（多服务器地址）访问接口，开发者可自行扩展
- 同时支持表单提交、raw提交,并自动解析提交数据和返还数据
- 支持 header 的动态添加
- 支持请求、响应信息的打印
- 支持自定义网络请求异常信息
- 支持 https 证书的自定义配置
- 使用比 [RxLifecycle](https://github.com/trello/RxLifecycle) 库更加优秀的 [AutoDispose](https://github.com/uber/AutoDispose) 库作为解决在 View 生命周期的变化中造成的内存泄漏问题
- 使用 [Arouter](https://github.com/alibaba/ARouter/blob/master/README_CN.md) 库作为项目路由，作为模块之间的通信桥梁
- 项目中封装了一个带状态的 RecyclerView，如错误页面、空页面状态展示，开发者可以根据项目情况自行扩展使用

## 基础MVP项目架构图
![](https://github.com/AnthonyCoder/MvpForJava/blob/master/gif/mvp_model.png)
## 网络框架UML图
![](https://github.com/AnthonyCoder/MvpForJava/blob/master/gif/base_net_model.png)
## lib依赖关系
![](https://github.com/AnthonyCoder/MvpForJava/blob/master/gif/model_relationship.png)

## 快速集成到新项目中使用
#### 1.clone到本地后，复制config.gradle文件，然后在项目build.gradle中引入config.gradle
```
apply from: "config.gradle"
```
#### 2.复制 common 模块并添加到项目中，然后业务模块依赖common模块
#### 3.创建View层Activity继承BaseActivity，同时绑定Presenter
#### 4.创建Contact接口类，约定View层接口和Presenter层接口
#### 5.创建Presenter实现类，在Presenter实现类里面处理逻辑，通过传递进来的View实例通知View层

## 调用示例
#### 1.普通 Get 请求提交示例:
```java
WanAndroidFormRequestClient.getInstance().executeGet(UrlConstant.GET_BANNER_JSON, null, new AppObserver<BannerResult>(view,true) {
            @Override
            public void onNext(BannerResult bannerResults) {
                view.onBanner(bannerResults.getData());
            }

        });
```
#### 2.普通 Post 请求提交示例:
```java
 HashMap<String,Object> params = new HashMap<>();
 params.put("id",id+"");
 params.put("udid","d2807c895f0348a180148c9dfa6f2feeac0781b5");
 BaobabFormRequestClient.getInstance().executePost(UrlConstant.POST_CATEGORIES_VIDEO_LIST, params, new AppObserver<VideoListResult>(view) {
       @Override
        public void onNext(VideoListResult videoListResult) {
           view.setVideoList(videoListResult.getItemList());
       }
 });
```
#### 3.带 Header 的 Get 请求提交示例(Post 类似):
```java
HashMap<String,String> headers = new HashMap<>();
headers.put("token","hosdbdkasdnfdfl");
WanAndroidFormRequestClient.getInstance().executeGetWithHeader(headers,UrlConstant.GET_BANNER_JSON, null, new AppObserver<BannerResult>(view,true) {
            @Override
            public void onNext(BannerResult bannerResults) {
                view.onBanner(bannerResults.getData());
            }

        });
```
#### 4.若请求不需要绑定 AutoDispose 来干预订阅者的调用的时候，可如下方式使用(传入 AppObserver 的构造函数控制):
```java
WanAndroidFormRequestClient.getInstance().executeGet(UrlConstant.GET_BANNER_JSON, null, new AppObserver<BannerResult>(view,false) {
            @Override
            public void onNext(BannerResult bannerResults) {
                view.onBanner(bannerResults.getData());
            }

        });
```



## 一些问题
#### 1.ARoter报错
先检查一下所有模块是否都在build.gradle文件中添加了
```
apply plugin: 'kotlin-kapt'
kapt {
    arguments {
        arg("AROUTER_MODULE_NAME", project.getName())
    }
}
```
若项目未使用Kotlin则以上代码换做
```
android {
    defaultConfig {
        ...
        javaCompileOptions {
            annotationProcessorOptions {
                arguments = [AROUTER_MODULE_NAME: project.getName()]
            }
        }
    }
}
```
检查如果以上问题不存在的话，再检查**是否每个模块都直接依赖了arouter-compiler**，必须是直接依赖。
依赖代码如下：

java版本
```

 annotationProcessor 'com.alibaba:arouter-compiler:x.x.x'
```
kotlin版本
```
kapt 'com.alibaba:arouter-compiler:x.x.x'
```
若检查还是没有问题却还报错，建议[点击此链接滑动网页到后面查看官方Q&A](https://github.com/alibaba/ARouter/blob/master/README_CN.md)

## 感谢

#### [Android架构中添加AutoDispose解决RxJava内存泄漏](https://blog.csdn.net/mq2553299/article/details/79418068)
#### [WanAndroid](https://www.wanandroid.com/)
#### [SmartRefreshLayout](https://github.com/scwang90/SmartRefreshLayout)
#### [FlycoTabLayout](https://github.com/H07000223/FlycoTabLayout)




