package com.anthony.home.bean;

import com.anthony.common.base.net.model.BaseResponseModel;

import java.util.List;

public class HomeArticleResult extends BaseResponseModel {

    /**
     * data : {"curPage":1,"datas":[{"apkLink":"","author":"xiaoyang","chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>记得曾经有位同学做贴纸应用时，有RT 的需求。<\/p>\r\n<p>默认事件分发为逆序，遍历子 View 为 (childCount ~ 0 ]，有哪些方式可以修改这一策略，比如修改遍历方式为[0,childCount)?<\/p>\r\n<p>3/3<\/p>","envelopePic":"","fresh":true,"id":8852,"link":"https://www.wanandroid.com/wenda/show/8852","niceDate":"21小时前","origin":"","prefix":"","projectLink":"","publishTime":1565529502000,"superChapterId":440,"superChapterName":"问答","tags":[{"name":"问答","url":"/article/list/0?cid=440"}],"title":"每日一问  事件分发机制大家应该都熟记于心，默认事件分发是逆序的，有哪些方法可以修改分发顺序？","type":0,"userId":2,"visible":1,"zan":11},{"apkLink":"","author":"TeaOf","chapterId":100,"chapterName":"RecyclerView","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":true,"id":8910,"link":"https://www.jianshu.com/p/1ae2f2fcff2c","niceDate":"21小时前","origin":"","prefix":"","projectLink":"","publishTime":1565529034000,"superChapterId":55,"superChapterName":"5.+高新技术","tags":[],"title":"抽丝剥茧RecyclerView - 化整为零","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"安卓大叔","chapterId":321,"chapterName":"算法","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":true,"id":8909,"link":"https://www.jianshu.com/p/e136ec79235c","niceDate":"21小时前","origin":"","prefix":"","projectLink":"","publishTime":1565528912000,"superChapterId":245,"superChapterName":"Java深入","tags":[],"title":"30张图带你彻底理解红黑树","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"karlsu","chapterId":302,"chapterName":"ANR","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":true,"id":8908,"link":"https://www.jianshu.com/p/545e5e7bbf94","niceDate":"21小时前","origin":"","prefix":"","projectLink":"","publishTime":1565528889000,"superChapterId":186,"superChapterName":"热门专题","tags":[],"title":"巧妙定位ANR问题","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"yhaolpz","chapterId":382,"chapterName":"音视频&amp;相机","collect":false,"courseId":13,"desc":"Android端强大的音视频编辑App（FFmpeg 命令方式）","envelopePic":"https://wanandroid.com/blogimgs/a7c4a0f6-22e1-4140-b98f-0aecac262447.png","fresh":true,"id":8899,"link":"http://www.wanandroid.com/blog/show/2647","niceDate":"21小时前","origin":"","prefix":"","projectLink":"https://github.com/yhaolpz/FFmpegCmd","publishTime":1565527885000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=382"}],"title":"Android端强大的音视频编辑App","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"5A59","chapterId":363,"chapterName":"创意汇","collect":false,"courseId":13,"desc":"一款 python 实现的 &quot;轻量级&quot; jvm\r\n主要实现部分\r\nclass 文件解析\r\n类加载\r\n运行时数据区\r\n指令解释器\r\n基本指令集 (总共 205 条，实现了估计 190 多条吧)\r\n简易 gc\r\n简易线程\r\n简易 jdk 库\r\n\r\n可用功能\r\n基本运算 (加减乘除与或位移...)\r\n输出\r\n多线程运算 (但是没有加同步)\r\n类加载，继承，多态\r\n数组操作 (只支持一维数组)\r\ngc (模拟 gc)\r\n异常处理","envelopePic":"https://wanandroid.com/resources/image/pc/default_project_img.jpg","fresh":true,"id":8896,"link":"http://www.wanandroid.com/blog/show/2646","niceDate":"21小时前","origin":"","prefix":"","projectLink":"https://github.com/5A59/Zvm","publishTime":1565527802000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=363"}],"title":"一款 python 实现的 &quot;轻量级&quot; jvm","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"asjqkkkk","chapterId":294,"chapterName":"完整项目","collect":false,"courseId":13,"desc":"完全使用Flutter编写的TodoList app，是一个小巧、简洁而又漂亮的app，它可以帮你随手记录日常的各项计划,如果你恰好有写任务计划的习惯，那么它一定非常适合你。\r\n","envelopePic":"https://wanandroid.com/blogimgs/6718c2cd-695c-4eb7-b24a-ccbb10d4dd47.png","fresh":true,"id":8882,"link":"http://www.wanandroid.com/blog/show/2640","niceDate":"21小时前","origin":"","prefix":"","projectLink":"https://github.com/asjqkkkk/flutter-todos","publishTime":1565527536000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=294"}],"title":"一个非常精美的Flutter Todo-List项目","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"lihangleo2","chapterId":380,"chapterName":"ImageView","collect":false,"courseId":13,"desc":"可定制化阴影的万能阴影布局ShadowLayout 2.0 震撼上线。效果赶超CardView。阴影支持x,y轴偏移，支持阴影扩散程度，支持阴影圆角，支持单边或多边不显示阴影；支持随意更改颜色值，支持随意更改颜色值，支持随意更改颜色值。重要的事情说三遍","envelopePic":"https://wanandroid.com/blogimgs/d04d8aeb-61f3-4f75-aa27-666dd5f6ca89.png","fresh":true,"id":8884,"link":"http://www.wanandroid.com/blog/show/2642","niceDate":"21小时前","origin":"","prefix":"","projectLink":"https://github.com/lihangleo2/ShadowLayout","publishTime":1565527094000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=380"}],"title":"可定制化阴影的万能阴影布局ShadowLayout 2.0 震撼上线，效果赶超CardView。（需要阴影地方，被它嵌套即可享受阴影，阴影可定制化）","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"malonecoder","chapterId":294,"chapterName":"完整项目","collect":false,"courseId":13,"desc":"项目采用 Kotlin 语言，自学习项目，使用MVVM架构，RxJava + Retrofit + Glide + LiveDataBus等开源组件，UI漂亮，代码和逻辑简单易懂，适合新手学习Kotlin语言和Jetpack等一系列开发组件","envelopePic":"https://wanandroid.com/blogimgs/f4ab1a6a-6a2c-49be-bae0-f423c24e7d9e.png","fresh":true,"id":8887,"link":"http://www.wanandroid.com/blog/show/2645","niceDate":"21小时前","origin":"","prefix":"","projectLink":"https://github.com/malonecoder/Awesome-Kotlin-WanAndroid","publishTime":1565527028000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=294"}],"title":"WanAndroid-Kotlin 学习项目","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"kukyxs","chapterId":294,"chapterName":"完整项目","collect":false,"courseId":13,"desc":"该项目基于「玩 Android 接口」接口，整体采用 MVVM, Android Jectpack, Retrofit, Kotlin 协程进行编写。 是由 kukyxs 和 Taonce 一起编写完成，目前已完成所有的开发功能，细节有待调整。","envelopePic":"https://wanandroid.com/blogimgs/60462c4c-0d82-41aa-b76d-0406c80fce31.png","fresh":true,"id":8883,"link":"http://www.wanandroid.com/blog/show/2641","niceDate":"21小时前","origin":"","prefix":"","projectLink":"https://github.com/kukyxs/CoroutinesWanAndroid","publishTime":1565526801000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=294"}],"title":"Jetpack + 协程的WanAndroid客户端","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"N0tExpectErr0r","chapterId":484,"chapterName":"okhttp","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":8859,"link":"http://blog.n0texpecterr0r.cn/?p=717","niceDate":"2天前","origin":"","prefix":"","projectLink":"","publishTime":1565432584000,"superChapterId":461,"superChapterName":"常见开源库源码解析","tags":[],"title":"【Android】OkHttp 源码剖析系列（一）&mdash;&mdash;请求的发起及拦截器机制概述","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"leiyun1993","chapterId":402,"chapterName":"跨平台应用","collect":false,"courseId":13,"desc":"GankUniApp是使用Gank.io提供的开放api，和使用uni-app完成的一个跨平台的客户端。每日分享妹子图 和 技术干货，还有供大家中午休息的休闲视频。uni-app的基础组件api基本和微信小程序一样，很易于上手！跨平台是不是一种趋势不好说，但是前端份额越来越高，作为android开发者，多了解和掌握点技术总是好的！","envelopePic":"https://www.wanandroid.com/blogimgs/9a148ca5-8894-46b4-a5cf-d146336f285b.png","fresh":false,"id":8858,"link":"http://www.wanandroid.com/blog/show/2638","niceDate":"2019-08-09","origin":"","prefix":"","projectLink":"https://github.com/leiyun1993/GankUniApp","publishTime":1565281499000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=402"}],"title":"基于GankApi和uni-app框架的跨平台Gank客户端","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"CCY0122","chapterId":402,"chapterName":"跨平台应用","collect":false,"courseId":13,"desc":"- 包含 wanAndroid已开放API的全部功能\r\n- 使用了常规开发模式、流行的BloC模式、官方推荐的Provider模式\r\n- 易用美丽的界面UI\r\n- 主流的NestedScroll + Tab + Scrollable的联动滚动主页面\r\n- 特色！拥有日常打卡、等级排行榜、个性签名等微社交功能","envelopePic":"https://www.wanandroid.com/blogimgs/265f749d-2504-447f-8d24-d0d8a6b57edc.png","fresh":false,"id":8856,"link":"http://www.wanandroid.com/blog/show/2637","niceDate":"2019-08-09","origin":"","prefix":"","projectLink":"https://github.com/CCY0122/WanAndroid_Flutter","publishTime":1565280234000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=402"}],"title":"超完整的Flutter版wanAndroid客户端--《玩儿Android》","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"gdutxiaoxu","chapterId":358,"chapterName":"项目基础功能","collect":false,"courseId":13,"desc":"这个项目介绍 CoordinatorLayout 及 behavior 的使用你，以及怎样实现自定义 behavior，目前实现的效果有仿 UC 主页，仿 QQ 浏览器主页，美团外卖详情页。里面都有相应的博客链接，有兴趣的可以看一下。","envelopePic":"https://www.wanandroid.com/blogimgs/d0e162be-d65a-438b-ab25-fac2bff3bd25.png","fresh":false,"id":8854,"link":"http://www.wanandroid.com/blog/show/2635","niceDate":"2019-08-09","origin":"","prefix":"","projectLink":"https://github.com/gdutxiaoxu/CoordinatorLayoutExample","publishTime":1565280177000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=358"}],"title":"CoordinatorLayout 及 behavior 教程","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"q805699513","chapterId":402,"chapterName":"跨平台应用","collect":false,"courseId":13,"desc":"一款 Flutter 写的小说 App","envelopePic":"https://www.wanandroid.com/blogimgs/5562eaf8-c687-4b57-8e01-ae6e89281632.png","fresh":false,"id":8853,"link":"http://www.wanandroid.com/blog/show/2634","niceDate":"2019-08-09","origin":"","prefix":"","projectLink":"https://github.com/q805699513/flutter_books","publishTime":1565280123000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=402"}],"title":"Flutter 小说阅读 App","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"javaexception","chapterId":294,"chapterName":"完整项目","collect":false,"courseId":13,"desc":"基于 wanandroid.com 开发的 MVP + Retrofit2 + RxJava2 +okhttp3 开发的 Android APP","envelopePic":"https://www.wanandroid.com/blogimgs/c5f6efc1-f77f-4a4b-9cfc-44dd0192b334.png","fresh":false,"id":8855,"link":"http://www.wanandroid.com/blog/show/2636","niceDate":"2019-08-09","origin":"","prefix":"","projectLink":"https://github.com/javaexception/QzsWanAndroid","publishTime":1565280087000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=294"}],"title":"基于 wanandroid.com 开发的 MVP + Retrofit2 + RxJava2 +okhttp3 开发的 Android APP","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"鸿洋","chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":8895,"link":"https://mp.weixin.qq.com/s/JkMJQLOUr3hoFf-eJ-OBDQ","niceDate":"2019-08-09","origin":"","prefix":"","projectLink":"","publishTime":1565280000000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"ConstraintLayout 2.0新特性 MotionLayout制作炫酷动画","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"玉刚说","chapterId":410,"chapterName":"玉刚说","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":8907,"link":"https://mp.weixin.qq.com/s/LBuIZZch_vZXXx5Wc0Yv2A","niceDate":"2019-08-09","origin":"","prefix":"","projectLink":"","publishTime":1565280000000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/410/1"}],"title":"Android 仿微信 QQ 图片裁剪，赶紧收藏起来！","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"xiaoyang","chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<ol>\r\n<li>匿名内部类访问的外部类局部变量为什么要用final 修饰？<\/li>\r\n<li>jdk8为啥不需要了？<\/li>\r\n<\/ol>","envelopePic":"","fresh":false,"id":8836,"link":"https://www.wanandroid.com/wenda/show/8836","niceDate":"2019-08-08","origin":"","prefix":"","projectLink":"","publishTime":1565279495000,"superChapterId":440,"superChapterName":"问答","tags":[{"name":"问答","url":"/article/list/0?cid=440"}],"title":"每日一问 匿名内部类访问的外部类局部变量为什么要用final 修饰，jdk8为啥不需要了？  2/3","type":0,"userId":2,"visible":1,"zan":7},{"apkLink":"","author":"lihangleo2","chapterId":328,"chapterName":"网络&amp;文件下载","collect":false,"courseId":13,"desc":"本项目借鉴okgo和鸿洋okhttputils,但以最浅显的方式展现，github带博客讲解","envelopePic":"https://www.wanandroid.com/resources/image/pc/default_project_img.jpg","fresh":false,"id":8851,"link":"http://www.wanandroid.com/blog/show/2633","niceDate":"2019-08-08","origin":"","prefix":"","projectLink":"https://github.com/lihangleo2/EasyOk","publishTime":1565278896000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=328"}],"title":"EasyOk看的懂的okhttp封装，增强理解","type":0,"userId":-1,"visible":1,"zan":0}],"offset":0,"over":false,"pageCount":346,"size":20,"total":6919}
     */

    private DataBean data;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * curPage : 1
         * datas : [{"apkLink":"","author":"xiaoyang","chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>记得曾经有位同学做贴纸应用时，有RT 的需求。<\/p>\r\n<p>默认事件分发为逆序，遍历子 View 为 (childCount ~ 0 ]，有哪些方式可以修改这一策略，比如修改遍历方式为[0,childCount)?<\/p>\r\n<p>3/3<\/p>","envelopePic":"","fresh":true,"id":8852,"link":"https://www.wanandroid.com/wenda/show/8852","niceDate":"21小时前","origin":"","prefix":"","projectLink":"","publishTime":1565529502000,"superChapterId":440,"superChapterName":"问答","tags":[{"name":"问答","url":"/article/list/0?cid=440"}],"title":"每日一问  事件分发机制大家应该都熟记于心，默认事件分发是逆序的，有哪些方法可以修改分发顺序？","type":0,"userId":2,"visible":1,"zan":11},{"apkLink":"","author":"TeaOf","chapterId":100,"chapterName":"RecyclerView","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":true,"id":8910,"link":"https://www.jianshu.com/p/1ae2f2fcff2c","niceDate":"21小时前","origin":"","prefix":"","projectLink":"","publishTime":1565529034000,"superChapterId":55,"superChapterName":"5.+高新技术","tags":[],"title":"抽丝剥茧RecyclerView - 化整为零","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"安卓大叔","chapterId":321,"chapterName":"算法","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":true,"id":8909,"link":"https://www.jianshu.com/p/e136ec79235c","niceDate":"21小时前","origin":"","prefix":"","projectLink":"","publishTime":1565528912000,"superChapterId":245,"superChapterName":"Java深入","tags":[],"title":"30张图带你彻底理解红黑树","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"karlsu","chapterId":302,"chapterName":"ANR","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":true,"id":8908,"link":"https://www.jianshu.com/p/545e5e7bbf94","niceDate":"21小时前","origin":"","prefix":"","projectLink":"","publishTime":1565528889000,"superChapterId":186,"superChapterName":"热门专题","tags":[],"title":"巧妙定位ANR问题","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"yhaolpz","chapterId":382,"chapterName":"音视频&amp;相机","collect":false,"courseId":13,"desc":"Android端强大的音视频编辑App（FFmpeg 命令方式）","envelopePic":"https://wanandroid.com/blogimgs/a7c4a0f6-22e1-4140-b98f-0aecac262447.png","fresh":true,"id":8899,"link":"http://www.wanandroid.com/blog/show/2647","niceDate":"21小时前","origin":"","prefix":"","projectLink":"https://github.com/yhaolpz/FFmpegCmd","publishTime":1565527885000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=382"}],"title":"Android端强大的音视频编辑App","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"5A59","chapterId":363,"chapterName":"创意汇","collect":false,"courseId":13,"desc":"一款 python 实现的 &quot;轻量级&quot; jvm\r\n主要实现部分\r\nclass 文件解析\r\n类加载\r\n运行时数据区\r\n指令解释器\r\n基本指令集 (总共 205 条，实现了估计 190 多条吧)\r\n简易 gc\r\n简易线程\r\n简易 jdk 库\r\n\r\n可用功能\r\n基本运算 (加减乘除与或位移...)\r\n输出\r\n多线程运算 (但是没有加同步)\r\n类加载，继承，多态\r\n数组操作 (只支持一维数组)\r\ngc (模拟 gc)\r\n异常处理","envelopePic":"https://wanandroid.com/resources/image/pc/default_project_img.jpg","fresh":true,"id":8896,"link":"http://www.wanandroid.com/blog/show/2646","niceDate":"21小时前","origin":"","prefix":"","projectLink":"https://github.com/5A59/Zvm","publishTime":1565527802000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=363"}],"title":"一款 python 实现的 &quot;轻量级&quot; jvm","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"asjqkkkk","chapterId":294,"chapterName":"完整项目","collect":false,"courseId":13,"desc":"完全使用Flutter编写的TodoList app，是一个小巧、简洁而又漂亮的app，它可以帮你随手记录日常的各项计划,如果你恰好有写任务计划的习惯，那么它一定非常适合你。\r\n","envelopePic":"https://wanandroid.com/blogimgs/6718c2cd-695c-4eb7-b24a-ccbb10d4dd47.png","fresh":true,"id":8882,"link":"http://www.wanandroid.com/blog/show/2640","niceDate":"21小时前","origin":"","prefix":"","projectLink":"https://github.com/asjqkkkk/flutter-todos","publishTime":1565527536000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=294"}],"title":"一个非常精美的Flutter Todo-List项目","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"lihangleo2","chapterId":380,"chapterName":"ImageView","collect":false,"courseId":13,"desc":"可定制化阴影的万能阴影布局ShadowLayout 2.0 震撼上线。效果赶超CardView。阴影支持x,y轴偏移，支持阴影扩散程度，支持阴影圆角，支持单边或多边不显示阴影；支持随意更改颜色值，支持随意更改颜色值，支持随意更改颜色值。重要的事情说三遍","envelopePic":"https://wanandroid.com/blogimgs/d04d8aeb-61f3-4f75-aa27-666dd5f6ca89.png","fresh":true,"id":8884,"link":"http://www.wanandroid.com/blog/show/2642","niceDate":"21小时前","origin":"","prefix":"","projectLink":"https://github.com/lihangleo2/ShadowLayout","publishTime":1565527094000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=380"}],"title":"可定制化阴影的万能阴影布局ShadowLayout 2.0 震撼上线，效果赶超CardView。（需要阴影地方，被它嵌套即可享受阴影，阴影可定制化）","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"malonecoder","chapterId":294,"chapterName":"完整项目","collect":false,"courseId":13,"desc":"项目采用 Kotlin 语言，自学习项目，使用MVVM架构，RxJava + Retrofit + Glide + LiveDataBus等开源组件，UI漂亮，代码和逻辑简单易懂，适合新手学习Kotlin语言和Jetpack等一系列开发组件","envelopePic":"https://wanandroid.com/blogimgs/f4ab1a6a-6a2c-49be-bae0-f423c24e7d9e.png","fresh":true,"id":8887,"link":"http://www.wanandroid.com/blog/show/2645","niceDate":"21小时前","origin":"","prefix":"","projectLink":"https://github.com/malonecoder/Awesome-Kotlin-WanAndroid","publishTime":1565527028000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=294"}],"title":"WanAndroid-Kotlin 学习项目","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"kukyxs","chapterId":294,"chapterName":"完整项目","collect":false,"courseId":13,"desc":"该项目基于「玩 Android 接口」接口，整体采用 MVVM, Android Jectpack, Retrofit, Kotlin 协程进行编写。 是由 kukyxs 和 Taonce 一起编写完成，目前已完成所有的开发功能，细节有待调整。","envelopePic":"https://wanandroid.com/blogimgs/60462c4c-0d82-41aa-b76d-0406c80fce31.png","fresh":true,"id":8883,"link":"http://www.wanandroid.com/blog/show/2641","niceDate":"21小时前","origin":"","prefix":"","projectLink":"https://github.com/kukyxs/CoroutinesWanAndroid","publishTime":1565526801000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=294"}],"title":"Jetpack + 协程的WanAndroid客户端","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"N0tExpectErr0r","chapterId":484,"chapterName":"okhttp","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":8859,"link":"http://blog.n0texpecterr0r.cn/?p=717","niceDate":"2天前","origin":"","prefix":"","projectLink":"","publishTime":1565432584000,"superChapterId":461,"superChapterName":"常见开源库源码解析","tags":[],"title":"【Android】OkHttp 源码剖析系列（一）&mdash;&mdash;请求的发起及拦截器机制概述","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"leiyun1993","chapterId":402,"chapterName":"跨平台应用","collect":false,"courseId":13,"desc":"GankUniApp是使用Gank.io提供的开放api，和使用uni-app完成的一个跨平台的客户端。每日分享妹子图 和 技术干货，还有供大家中午休息的休闲视频。uni-app的基础组件api基本和微信小程序一样，很易于上手！跨平台是不是一种趋势不好说，但是前端份额越来越高，作为android开发者，多了解和掌握点技术总是好的！","envelopePic":"https://www.wanandroid.com/blogimgs/9a148ca5-8894-46b4-a5cf-d146336f285b.png","fresh":false,"id":8858,"link":"http://www.wanandroid.com/blog/show/2638","niceDate":"2019-08-09","origin":"","prefix":"","projectLink":"https://github.com/leiyun1993/GankUniApp","publishTime":1565281499000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=402"}],"title":"基于GankApi和uni-app框架的跨平台Gank客户端","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"CCY0122","chapterId":402,"chapterName":"跨平台应用","collect":false,"courseId":13,"desc":"- 包含 wanAndroid已开放API的全部功能\r\n- 使用了常规开发模式、流行的BloC模式、官方推荐的Provider模式\r\n- 易用美丽的界面UI\r\n- 主流的NestedScroll + Tab + Scrollable的联动滚动主页面\r\n- 特色！拥有日常打卡、等级排行榜、个性签名等微社交功能","envelopePic":"https://www.wanandroid.com/blogimgs/265f749d-2504-447f-8d24-d0d8a6b57edc.png","fresh":false,"id":8856,"link":"http://www.wanandroid.com/blog/show/2637","niceDate":"2019-08-09","origin":"","prefix":"","projectLink":"https://github.com/CCY0122/WanAndroid_Flutter","publishTime":1565280234000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=402"}],"title":"超完整的Flutter版wanAndroid客户端--《玩儿Android》","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"gdutxiaoxu","chapterId":358,"chapterName":"项目基础功能","collect":false,"courseId":13,"desc":"这个项目介绍 CoordinatorLayout 及 behavior 的使用你，以及怎样实现自定义 behavior，目前实现的效果有仿 UC 主页，仿 QQ 浏览器主页，美团外卖详情页。里面都有相应的博客链接，有兴趣的可以看一下。","envelopePic":"https://www.wanandroid.com/blogimgs/d0e162be-d65a-438b-ab25-fac2bff3bd25.png","fresh":false,"id":8854,"link":"http://www.wanandroid.com/blog/show/2635","niceDate":"2019-08-09","origin":"","prefix":"","projectLink":"https://github.com/gdutxiaoxu/CoordinatorLayoutExample","publishTime":1565280177000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=358"}],"title":"CoordinatorLayout 及 behavior 教程","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"q805699513","chapterId":402,"chapterName":"跨平台应用","collect":false,"courseId":13,"desc":"一款 Flutter 写的小说 App","envelopePic":"https://www.wanandroid.com/blogimgs/5562eaf8-c687-4b57-8e01-ae6e89281632.png","fresh":false,"id":8853,"link":"http://www.wanandroid.com/blog/show/2634","niceDate":"2019-08-09","origin":"","prefix":"","projectLink":"https://github.com/q805699513/flutter_books","publishTime":1565280123000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=402"}],"title":"Flutter 小说阅读 App","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"javaexception","chapterId":294,"chapterName":"完整项目","collect":false,"courseId":13,"desc":"基于 wanandroid.com 开发的 MVP + Retrofit2 + RxJava2 +okhttp3 开发的 Android APP","envelopePic":"https://www.wanandroid.com/blogimgs/c5f6efc1-f77f-4a4b-9cfc-44dd0192b334.png","fresh":false,"id":8855,"link":"http://www.wanandroid.com/blog/show/2636","niceDate":"2019-08-09","origin":"","prefix":"","projectLink":"https://github.com/javaexception/QzsWanAndroid","publishTime":1565280087000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=294"}],"title":"基于 wanandroid.com 开发的 MVP + Retrofit2 + RxJava2 +okhttp3 开发的 Android APP","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"鸿洋","chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":8895,"link":"https://mp.weixin.qq.com/s/JkMJQLOUr3hoFf-eJ-OBDQ","niceDate":"2019-08-09","origin":"","prefix":"","projectLink":"","publishTime":1565280000000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"ConstraintLayout 2.0新特性 MotionLayout制作炫酷动画","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"玉刚说","chapterId":410,"chapterName":"玉刚说","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":8907,"link":"https://mp.weixin.qq.com/s/LBuIZZch_vZXXx5Wc0Yv2A","niceDate":"2019-08-09","origin":"","prefix":"","projectLink":"","publishTime":1565280000000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/410/1"}],"title":"Android 仿微信 QQ 图片裁剪，赶紧收藏起来！","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"xiaoyang","chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<ol>\r\n<li>匿名内部类访问的外部类局部变量为什么要用final 修饰？<\/li>\r\n<li>jdk8为啥不需要了？<\/li>\r\n<\/ol>","envelopePic":"","fresh":false,"id":8836,"link":"https://www.wanandroid.com/wenda/show/8836","niceDate":"2019-08-08","origin":"","prefix":"","projectLink":"","publishTime":1565279495000,"superChapterId":440,"superChapterName":"问答","tags":[{"name":"问答","url":"/article/list/0?cid=440"}],"title":"每日一问 匿名内部类访问的外部类局部变量为什么要用final 修饰，jdk8为啥不需要了？  2/3","type":0,"userId":2,"visible":1,"zan":7},{"apkLink":"","author":"lihangleo2","chapterId":328,"chapterName":"网络&amp;文件下载","collect":false,"courseId":13,"desc":"本项目借鉴okgo和鸿洋okhttputils,但以最浅显的方式展现，github带博客讲解","envelopePic":"https://www.wanandroid.com/resources/image/pc/default_project_img.jpg","fresh":false,"id":8851,"link":"http://www.wanandroid.com/blog/show/2633","niceDate":"2019-08-08","origin":"","prefix":"","projectLink":"https://github.com/lihangleo2/EasyOk","publishTime":1565278896000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=328"}],"title":"EasyOk看的懂的okhttp封装，增强理解","type":0,"userId":-1,"visible":1,"zan":0}]
         * offset : 0
         * over : false
         * pageCount : 346
         * size : 20
         * total : 6919
         */

        private int curPage;
        private int offset;
        private boolean over;
        private int pageCount;
        private int size;
        private int total;
        private List<DatasBean> datas;

        public int getCurPage() {
            return curPage;
        }

        public void setCurPage(int curPage) {
            this.curPage = curPage;
        }

        public int getOffset() {
            return offset;
        }

        public void setOffset(int offset) {
            this.offset = offset;
        }

        public boolean isOver() {
            return over;
        }

        public void setOver(boolean over) {
            this.over = over;
        }

        public int getPageCount() {
            return pageCount;
        }

        public void setPageCount(int pageCount) {
            this.pageCount = pageCount;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public List<DatasBean> getDatas() {
            return datas;
        }

        public void setDatas(List<DatasBean> datas) {
            this.datas = datas;
        }

        public static class DatasBean {
            /**
             * apkLink :
             * author : xiaoyang
             * chapterId : 440
             * chapterName : 官方
             * collect : false
             * courseId : 13
             * desc : <p>记得曾经有位同学做贴纸应用时，有RT 的需求。</p>
             <p>默认事件分发为逆序，遍历子 View 为 (childCount ~ 0 ]，有哪些方式可以修改这一策略，比如修改遍历方式为[0,childCount)?</p>
             <p>3/3</p>
             * envelopePic :
             * fresh : true
             * id : 8852
             * link : https://www.wanandroid.com/wenda/show/8852
             * niceDate : 21小时前
             * origin :
             * prefix :
             * projectLink :
             * publishTime : 1565529502000
             * superChapterId : 440
             * superChapterName : 问答
             * tags : [{"name":"问答","url":"/article/list/0?cid=440"}]
             * title : 每日一问  事件分发机制大家应该都熟记于心，默认事件分发是逆序的，有哪些方法可以修改分发顺序？
             * type : 0
             * userId : 2
             * visible : 1
             * zan : 11
             */

            private String apkLink;
            private String author;
            private int chapterId;
            private String chapterName;
            private boolean collect;
            private int courseId;
            private String desc;
            private String envelopePic;
            private boolean fresh;
            private int id;
            private String link;
            private String niceDate;
            private String origin;
            private String prefix;
            private String projectLink;
            private long publishTime;
            private int superChapterId;
            private String superChapterName;
            private String title;
            private int type;
            private int userId;
            private int visible;
            private int zan;
            private List<TagsBean> tags;

            public String getApkLink() {
                return apkLink;
            }

            public void setApkLink(String apkLink) {
                this.apkLink = apkLink;
            }

            public String getAuthor() {
                return author;
            }

            public void setAuthor(String author) {
                this.author = author;
            }

            public int getChapterId() {
                return chapterId;
            }

            public void setChapterId(int chapterId) {
                this.chapterId = chapterId;
            }

            public String getChapterName() {
                return chapterName;
            }

            public void setChapterName(String chapterName) {
                this.chapterName = chapterName;
            }

            public boolean isCollect() {
                return collect;
            }

            public void setCollect(boolean collect) {
                this.collect = collect;
            }

            public int getCourseId() {
                return courseId;
            }

            public void setCourseId(int courseId) {
                this.courseId = courseId;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public String getEnvelopePic() {
                return envelopePic;
            }

            public void setEnvelopePic(String envelopePic) {
                this.envelopePic = envelopePic;
            }

            public boolean isFresh() {
                return fresh;
            }

            public void setFresh(boolean fresh) {
                this.fresh = fresh;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getLink() {
                return link;
            }

            public void setLink(String link) {
                this.link = link;
            }

            public String getNiceDate() {
                return niceDate;
            }

            public void setNiceDate(String niceDate) {
                this.niceDate = niceDate;
            }

            public String getOrigin() {
                return origin;
            }

            public void setOrigin(String origin) {
                this.origin = origin;
            }

            public String getPrefix() {
                return prefix;
            }

            public void setPrefix(String prefix) {
                this.prefix = prefix;
            }

            public String getProjectLink() {
                return projectLink;
            }

            public void setProjectLink(String projectLink) {
                this.projectLink = projectLink;
            }

            public long getPublishTime() {
                return publishTime;
            }

            public void setPublishTime(long publishTime) {
                this.publishTime = publishTime;
            }

            public int getSuperChapterId() {
                return superChapterId;
            }

            public void setSuperChapterId(int superChapterId) {
                this.superChapterId = superChapterId;
            }

            public String getSuperChapterName() {
                return superChapterName;
            }

            public void setSuperChapterName(String superChapterName) {
                this.superChapterName = superChapterName;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public int getUserId() {
                return userId;
            }

            public void setUserId(int userId) {
                this.userId = userId;
            }

            public int getVisible() {
                return visible;
            }

            public void setVisible(int visible) {
                this.visible = visible;
            }

            public int getZan() {
                return zan;
            }

            public void setZan(int zan) {
                this.zan = zan;
            }

            public List<TagsBean> getTags() {
                return tags;
            }

            public void setTags(List<TagsBean> tags) {
                this.tags = tags;
            }

            public static class TagsBean {
                /**
                 * name : 问答
                 * url : /article/list/0?cid=440
                 */

                private String name;
                private String url;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }
            }
        }
    }
}
