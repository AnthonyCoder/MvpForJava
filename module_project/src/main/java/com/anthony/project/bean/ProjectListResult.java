package com.anthony.project.bean;

import com.anthony.common.base.net.model.BaseResponseModel;

import java.util.List;

/**
 * 创建时间:2019/8/13
 * 创建人：anthony.wang
 * 功能描述：
 */
public class ProjectListResult extends BaseResponseModel {
    /**
     * data : {"curPage":0,"datas":[{"apkLink":"","author":"asjqkkkk","chapterId":294,"chapterName":"完整项目","collect":false,"courseId":13,"desc":"完全使用Flutter编写的TodoList app，是一个小巧、简洁而又漂亮的app，它可以帮你随手记录日常的各项计划,如果你恰好有写任务计划的习惯，那么它一定非常适合你。\r\n","envelopePic":"https://wanandroid.com/blogimgs/6718c2cd-695c-4eb7-b24a-ccbb10d4dd47.png","fresh":false,"id":8882,"link":"http://www.wanandroid.com/blog/show/2640","niceDate":"1天前","origin":"","prefix":"","projectLink":"https://github.com/asjqkkkk/flutter-todos","publishTime":1565527536000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=294"}],"title":"一个非常精美的Flutter Todo-List项目","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"malonecoder","chapterId":294,"chapterName":"完整项目","collect":false,"courseId":13,"desc":"项目采用 Kotlin 语言，自学习项目，使用MVVM架构，RxJava + Retrofit + Glide + LiveDataBus等开源组件，UI漂亮，代码和逻辑简单易懂，适合新手学习Kotlin语言和Jetpack等一系列开发组件","envelopePic":"https://wanandroid.com/blogimgs/f4ab1a6a-6a2c-49be-bae0-f423c24e7d9e.png","fresh":false,"id":8887,"link":"http://www.wanandroid.com/blog/show/2645","niceDate":"1天前","origin":"","prefix":"","projectLink":"https://github.com/malonecoder/Awesome-Kotlin-WanAndroid","publishTime":1565527028000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=294"}],"title":"WanAndroid-Kotlin 学习项目","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"kukyxs","chapterId":294,"chapterName":"完整项目","collect":false,"courseId":13,"desc":"该项目基于「玩 Android 接口」接口，整体采用 MVVM, Android Jectpack, Retrofit, Kotlin 协程进行编写。 是由 kukyxs 和 Taonce 一起编写完成，目前已完成所有的开发功能，细节有待调整。","envelopePic":"https://wanandroid.com/blogimgs/60462c4c-0d82-41aa-b76d-0406c80fce31.png","fresh":false,"id":8883,"link":"http://www.wanandroid.com/blog/show/2641","niceDate":"1天前","origin":"","prefix":"","projectLink":"https://github.com/kukyxs/CoroutinesWanAndroid","publishTime":1565526801000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=294"}],"title":"Jetpack + 协程的WanAndroid客户端","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"javaexception","chapterId":294,"chapterName":"完整项目","collect":false,"courseId":13,"desc":"基于 wanandroid.com 开发的 MVP + Retrofit2 + RxJava2 +okhttp3 开发的 Android APP","envelopePic":"https://www.wanandroid.com/blogimgs/c5f6efc1-f77f-4a4b-9cfc-44dd0192b334.png","fresh":false,"id":8855,"link":"http://www.wanandroid.com/blog/show/2636","niceDate":"2019-08-09","origin":"","prefix":"","projectLink":"https://github.com/javaexception/QzsWanAndroid","publishTime":1565280087000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=294"}],"title":"基于 wanandroid.com 开发的 MVP + Retrofit2 + RxJava2 +okhttp3 开发的 Android APP","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"nieyuwen","chapterId":294,"chapterName":"完整项目","collect":false,"courseId":13,"desc":"mvp+rxjava+retrfit框架练习项目\r\n根据鸿洋大神的WanAndroid网站提供的开放API制作：[玩Android开放API]\r\n\r\n\r\n","envelopePic":"https://www.wanandroid.com/blogimgs/acf7a122-77be-45c4-b175-6b0414acd585.png","fresh":false,"id":8850,"link":"http://www.wanandroid.com/blog/show/2632","niceDate":"2019-08-08","origin":"","prefix":"","projectLink":"https://github.com/nieyuwen/WanAndroid","publishTime":1565278739000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=294"}],"title":"mvp+rxjava+retrofit框架练习WanAndroid项目","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"mCyp","chapterId":294,"chapterName":"完整项目","collect":false,"courseId":13,"desc":"Android Jetpack + MVVM 构建的项目","envelopePic":"https://wanandroid.com/blogimgs/1b695b09-7220-4b68-ad08-3e2009335493.png","fresh":false,"id":8717,"link":"http://www.wanandroid.com/blog/show/2624","niceDate":"2019-07-23","origin":"","prefix":"","projectLink":"https://github.com/mCyp/Hoo","publishTime":1563869830000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=294"}],"title":"项目从零到一，Android Jetpack就够了","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"TzuChiangLi","chapterId":294,"chapterName":"完整项目","collect":false,"courseId":13,"desc":"当时毕业公司安排我学习Android的开发以快速开发项目，所以在公司一直MVC的模式开发，在看了现在的主流及趋势后，发现MVP是进步路上的必修课，所以就参考了很多大神的项目学习MVP的写法和思路。\r\n","envelopePic":"https://wanandroid.com/blogimgs/bf9ed860-3ab1-4bea-9c9a-6de3c75e861b.png","fresh":false,"id":8658,"link":"http://www.wanandroid.com/blog/show/2617","niceDate":"2019-07-01","origin":"","prefix":"","projectLink":"https://github.com/TzuChiangLi/WanAndroid","publishTime":1561983121000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=294"}],"title":"WanAndroid 个人第一个练手项目分享","type":0,"userId":-1,"visible":0,"zan":0},{"apkLink":"","author":"guofudong","chapterId":294,"chapterName":"完整项目","collect":false,"courseId":13,"desc":"Meterail Design风格商城类项目","envelopePic":"https://www.wanandroid.com/blogimgs/5a3eb937-b429-49f4-9a77-d3ff15cf4988.png","fresh":false,"id":8547,"link":"http://www.wanandroid.com/blog/show/2598","niceDate":"2019-06-19","origin":"","prefix":"","projectLink":"https://github.com/guofudong/EShop","publishTime":1560920162000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=294"}],"title":"Meterail Design风格商城类项目","type":0,"userId":-1,"visible":0,"zan":0},{"apkLink":"","author":"jiwenjie","chapterId":294,"chapterName":"完整项目","collect":false,"courseId":13,"desc":"毕设项目，自己搭建的前后台，Android使用 Kotlin + RxJava + Retrofit + MVP 实现。比较好的封装了代码以及多状态界面的切换。后台代码也可以看到，通过 IDEA 使用 SSM 搭建。","envelopePic":"https://www.wanandroid.com/resources/image/pc/default_project_img.jpg","fresh":false,"id":8605,"link":"http://www.wanandroid.com/blog/show/2609","niceDate":"2019-06-12","origin":"","prefix":"","projectLink":"https://github.com/jiwenjie/Graduation_App","publishTime":1560352439000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=294"}],"title":"Meterail Design风格毕设项目","type":0,"userId":-1,"visible":0,"zan":0},{"apkLink":"","author":"xing16","chapterId":294,"chapterName":"完整项目","collect":false,"courseId":13,"desc":"基于 wanandroid.com 和 gank.io API 开发的 MVP + Retrofit + RxJava2 组件化模式开发的 Android APP","envelopePic":"https://www.wanandroid.com/blogimgs/bbb7bedc-84f0-436c-a46a-1122705b6000.png","fresh":false,"id":8544,"link":"http://www.wanandroid.com/blog/show/2595","niceDate":"2019-06-01","origin":"","prefix":"","projectLink":"https://github.com/xing16/WanAndroid","publishTime":1559357087000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=294"}],"title":"MVP 组件化 WanAndroid APP","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"mouxuefei","chapterId":294,"chapterName":"完整项目","collect":false,"courseId":13,"desc":"RN练手项目","envelopePic":"https://wanandroid.com/blogimgs/439ee0a6-cc89-493d-82b7-adad76396ac9.png","fresh":false,"id":8508,"link":"http://www.wanandroid.com/blog/show/2584","niceDate":"2019-05-28","origin":"","prefix":"","projectLink":"https://github.com/mouxuefei/RN-wanAndroid","publishTime":1559045153000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=294"}],"title":"RN-WanAndroid的学习项目","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"goweii","chapterId":294,"chapterName":"完整项目","collect":false,"courseId":13,"desc":"开发初期主要是为了试水一些自己开发的开源框架，但是后面发现本人对这个APP的使用频率还是挺高的，在坐地铁的时候都会拿出来刷一刷文章。所以决定把这个APP做好看，做好用，不至于影响刷文章的心情。\r\n\r\n如果你也觉得好用，欢迎给个star，谢谢。","envelopePic":"https://wanandroid.com/blogimgs/eb948f06-8895-4b67-8bf9-1aa41dea75cb.png","fresh":false,"id":8501,"link":"http://www.wanandroid.com/blog/show/2577","niceDate":"2019-05-28","origin":"","prefix":"","projectLink":"https://github.com/goweii/WanAndroid","publishTime":1559044835000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=294"}],"title":"简洁美观的WanAndroid客户端","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"Taonce","chapterId":294,"chapterName":"完整项目","collect":false,"courseId":13,"desc":"使用Kotlin语言开发的WanAndroid客户端，使用了AndroidX和RxJava、Retrofit、OkHttp等开元技术。","envelopePic":"https://wanandroid.com/blogimgs/a8ee81e1-a24c-431a-8730-9fe9b49f09cb.png","fresh":false,"id":8504,"link":"http://www.wanandroid.com/blog/show/2580","niceDate":"2019-05-28","origin":"","prefix":"","projectLink":"https://github.com/Taonce/WanKotlin","publishTime":1559044791000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=294"}],"title":"WanAndroid ---- Kotlin版","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"ITGungnir","chapterId":294,"chapterName":"完整项目","collect":false,"courseId":13,"desc":"Kotlin + MVVM + 模块化 + 响应式 的WanAndroid客户端，简约优雅。\r\n\r\n## 技术点\r\n* 基于APT和ASM的GRouter路由框架实现模块化通信；\r\n* 参考Redux的原理，实现一套事件总线框架；\r\n* 封装MVVM和UI库，可供其他应用使用；\r\n* 项目整体使用响应式编程风格，简介优雅易读。","envelopePic":"https://www.wanandroid.com/blogimgs/d95d3a13-85ae-4aa7-bec0-ca9f4bba9eae.png","fresh":false,"id":8480,"link":"http://www.wanandroid.com/blog/show/2575","niceDate":"2019-05-26","origin":"","prefix":"","projectLink":"https://github.com/ITGungnir/KotlinWanAndroid","publishTime":1558869577000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=294"}],"title":"WanAndroid模块化响应式客户端 很赞","type":0,"userId":-1,"visible":0,"zan":0},{"apkLink":"","author":"jimmysuncpt","chapterId":294,"chapterName":"完整项目","collect":false,"courseId":13,"desc":"UltraRecyclerView是一个封装多种特性的RecyclerView。主要功能包括：\r\n- 支持横向滑动／纵向滑动\r\n- 支持分页滑动，并且支持对齐方式和距离\r\n- 支持循环滚动\r\n- 支持定时自动滚动，计时器使用Handler实现\r\n- BannerView内置指示器，支持设置底部距离、已选/默认的颜色和宽度、高度和内部距离","envelopePic":"https://www.wanandroid.com/blogimgs/0858c600-1b34-41c1-a2ff-f67cdc376558.png","fresh":false,"id":8467,"link":"http://www.wanandroid.com/blog/show/2574","niceDate":"2019-05-20","origin":"","prefix":"","projectLink":"https://github.com/jimmysuncpt/UltraRecyclerView","publishTime":1558354164000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=294"}],"title":"UltraRecyclerView是一个封装多种特性的RecyclerView","type":0,"userId":-1,"visible":1,"zan":0}],"offset":-15,"over":false,"pageCount":11,"size":15,"total":153}
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
         * curPage : 0
         * datas : [{"apkLink":"","author":"asjqkkkk","chapterId":294,"chapterName":"完整项目","collect":false,"courseId":13,"desc":"完全使用Flutter编写的TodoList app，是一个小巧、简洁而又漂亮的app，它可以帮你随手记录日常的各项计划,如果你恰好有写任务计划的习惯，那么它一定非常适合你。\r\n","envelopePic":"https://wanandroid.com/blogimgs/6718c2cd-695c-4eb7-b24a-ccbb10d4dd47.png","fresh":false,"id":8882,"link":"http://www.wanandroid.com/blog/show/2640","niceDate":"1天前","origin":"","prefix":"","projectLink":"https://github.com/asjqkkkk/flutter-todos","publishTime":1565527536000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=294"}],"title":"一个非常精美的Flutter Todo-List项目","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"malonecoder","chapterId":294,"chapterName":"完整项目","collect":false,"courseId":13,"desc":"项目采用 Kotlin 语言，自学习项目，使用MVVM架构，RxJava + Retrofit + Glide + LiveDataBus等开源组件，UI漂亮，代码和逻辑简单易懂，适合新手学习Kotlin语言和Jetpack等一系列开发组件","envelopePic":"https://wanandroid.com/blogimgs/f4ab1a6a-6a2c-49be-bae0-f423c24e7d9e.png","fresh":false,"id":8887,"link":"http://www.wanandroid.com/blog/show/2645","niceDate":"1天前","origin":"","prefix":"","projectLink":"https://github.com/malonecoder/Awesome-Kotlin-WanAndroid","publishTime":1565527028000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=294"}],"title":"WanAndroid-Kotlin 学习项目","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"kukyxs","chapterId":294,"chapterName":"完整项目","collect":false,"courseId":13,"desc":"该项目基于「玩 Android 接口」接口，整体采用 MVVM, Android Jectpack, Retrofit, Kotlin 协程进行编写。 是由 kukyxs 和 Taonce 一起编写完成，目前已完成所有的开发功能，细节有待调整。","envelopePic":"https://wanandroid.com/blogimgs/60462c4c-0d82-41aa-b76d-0406c80fce31.png","fresh":false,"id":8883,"link":"http://www.wanandroid.com/blog/show/2641","niceDate":"1天前","origin":"","prefix":"","projectLink":"https://github.com/kukyxs/CoroutinesWanAndroid","publishTime":1565526801000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=294"}],"title":"Jetpack + 协程的WanAndroid客户端","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"javaexception","chapterId":294,"chapterName":"完整项目","collect":false,"courseId":13,"desc":"基于 wanandroid.com 开发的 MVP + Retrofit2 + RxJava2 +okhttp3 开发的 Android APP","envelopePic":"https://www.wanandroid.com/blogimgs/c5f6efc1-f77f-4a4b-9cfc-44dd0192b334.png","fresh":false,"id":8855,"link":"http://www.wanandroid.com/blog/show/2636","niceDate":"2019-08-09","origin":"","prefix":"","projectLink":"https://github.com/javaexception/QzsWanAndroid","publishTime":1565280087000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=294"}],"title":"基于 wanandroid.com 开发的 MVP + Retrofit2 + RxJava2 +okhttp3 开发的 Android APP","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"nieyuwen","chapterId":294,"chapterName":"完整项目","collect":false,"courseId":13,"desc":"mvp+rxjava+retrfit框架练习项目\r\n根据鸿洋大神的WanAndroid网站提供的开放API制作：[玩Android开放API]\r\n\r\n\r\n","envelopePic":"https://www.wanandroid.com/blogimgs/acf7a122-77be-45c4-b175-6b0414acd585.png","fresh":false,"id":8850,"link":"http://www.wanandroid.com/blog/show/2632","niceDate":"2019-08-08","origin":"","prefix":"","projectLink":"https://github.com/nieyuwen/WanAndroid","publishTime":1565278739000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=294"}],"title":"mvp+rxjava+retrofit框架练习WanAndroid项目","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"mCyp","chapterId":294,"chapterName":"完整项目","collect":false,"courseId":13,"desc":"Android Jetpack + MVVM 构建的项目","envelopePic":"https://wanandroid.com/blogimgs/1b695b09-7220-4b68-ad08-3e2009335493.png","fresh":false,"id":8717,"link":"http://www.wanandroid.com/blog/show/2624","niceDate":"2019-07-23","origin":"","prefix":"","projectLink":"https://github.com/mCyp/Hoo","publishTime":1563869830000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=294"}],"title":"项目从零到一，Android Jetpack就够了","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"TzuChiangLi","chapterId":294,"chapterName":"完整项目","collect":false,"courseId":13,"desc":"当时毕业公司安排我学习Android的开发以快速开发项目，所以在公司一直MVC的模式开发，在看了现在的主流及趋势后，发现MVP是进步路上的必修课，所以就参考了很多大神的项目学习MVP的写法和思路。\r\n","envelopePic":"https://wanandroid.com/blogimgs/bf9ed860-3ab1-4bea-9c9a-6de3c75e861b.png","fresh":false,"id":8658,"link":"http://www.wanandroid.com/blog/show/2617","niceDate":"2019-07-01","origin":"","prefix":"","projectLink":"https://github.com/TzuChiangLi/WanAndroid","publishTime":1561983121000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=294"}],"title":"WanAndroid 个人第一个练手项目分享","type":0,"userId":-1,"visible":0,"zan":0},{"apkLink":"","author":"guofudong","chapterId":294,"chapterName":"完整项目","collect":false,"courseId":13,"desc":"Meterail Design风格商城类项目","envelopePic":"https://www.wanandroid.com/blogimgs/5a3eb937-b429-49f4-9a77-d3ff15cf4988.png","fresh":false,"id":8547,"link":"http://www.wanandroid.com/blog/show/2598","niceDate":"2019-06-19","origin":"","prefix":"","projectLink":"https://github.com/guofudong/EShop","publishTime":1560920162000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=294"}],"title":"Meterail Design风格商城类项目","type":0,"userId":-1,"visible":0,"zan":0},{"apkLink":"","author":"jiwenjie","chapterId":294,"chapterName":"完整项目","collect":false,"courseId":13,"desc":"毕设项目，自己搭建的前后台，Android使用 Kotlin + RxJava + Retrofit + MVP 实现。比较好的封装了代码以及多状态界面的切换。后台代码也可以看到，通过 IDEA 使用 SSM 搭建。","envelopePic":"https://www.wanandroid.com/resources/image/pc/default_project_img.jpg","fresh":false,"id":8605,"link":"http://www.wanandroid.com/blog/show/2609","niceDate":"2019-06-12","origin":"","prefix":"","projectLink":"https://github.com/jiwenjie/Graduation_App","publishTime":1560352439000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=294"}],"title":"Meterail Design风格毕设项目","type":0,"userId":-1,"visible":0,"zan":0},{"apkLink":"","author":"xing16","chapterId":294,"chapterName":"完整项目","collect":false,"courseId":13,"desc":"基于 wanandroid.com 和 gank.io API 开发的 MVP + Retrofit + RxJava2 组件化模式开发的 Android APP","envelopePic":"https://www.wanandroid.com/blogimgs/bbb7bedc-84f0-436c-a46a-1122705b6000.png","fresh":false,"id":8544,"link":"http://www.wanandroid.com/blog/show/2595","niceDate":"2019-06-01","origin":"","prefix":"","projectLink":"https://github.com/xing16/WanAndroid","publishTime":1559357087000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=294"}],"title":"MVP 组件化 WanAndroid APP","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"mouxuefei","chapterId":294,"chapterName":"完整项目","collect":false,"courseId":13,"desc":"RN练手项目","envelopePic":"https://wanandroid.com/blogimgs/439ee0a6-cc89-493d-82b7-adad76396ac9.png","fresh":false,"id":8508,"link":"http://www.wanandroid.com/blog/show/2584","niceDate":"2019-05-28","origin":"","prefix":"","projectLink":"https://github.com/mouxuefei/RN-wanAndroid","publishTime":1559045153000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=294"}],"title":"RN-WanAndroid的学习项目","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"goweii","chapterId":294,"chapterName":"完整项目","collect":false,"courseId":13,"desc":"开发初期主要是为了试水一些自己开发的开源框架，但是后面发现本人对这个APP的使用频率还是挺高的，在坐地铁的时候都会拿出来刷一刷文章。所以决定把这个APP做好看，做好用，不至于影响刷文章的心情。\r\n\r\n如果你也觉得好用，欢迎给个star，谢谢。","envelopePic":"https://wanandroid.com/blogimgs/eb948f06-8895-4b67-8bf9-1aa41dea75cb.png","fresh":false,"id":8501,"link":"http://www.wanandroid.com/blog/show/2577","niceDate":"2019-05-28","origin":"","prefix":"","projectLink":"https://github.com/goweii/WanAndroid","publishTime":1559044835000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=294"}],"title":"简洁美观的WanAndroid客户端","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"Taonce","chapterId":294,"chapterName":"完整项目","collect":false,"courseId":13,"desc":"使用Kotlin语言开发的WanAndroid客户端，使用了AndroidX和RxJava、Retrofit、OkHttp等开元技术。","envelopePic":"https://wanandroid.com/blogimgs/a8ee81e1-a24c-431a-8730-9fe9b49f09cb.png","fresh":false,"id":8504,"link":"http://www.wanandroid.com/blog/show/2580","niceDate":"2019-05-28","origin":"","prefix":"","projectLink":"https://github.com/Taonce/WanKotlin","publishTime":1559044791000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=294"}],"title":"WanAndroid ---- Kotlin版","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"ITGungnir","chapterId":294,"chapterName":"完整项目","collect":false,"courseId":13,"desc":"Kotlin + MVVM + 模块化 + 响应式 的WanAndroid客户端，简约优雅。\r\n\r\n## 技术点\r\n* 基于APT和ASM的GRouter路由框架实现模块化通信；\r\n* 参考Redux的原理，实现一套事件总线框架；\r\n* 封装MVVM和UI库，可供其他应用使用；\r\n* 项目整体使用响应式编程风格，简介优雅易读。","envelopePic":"https://www.wanandroid.com/blogimgs/d95d3a13-85ae-4aa7-bec0-ca9f4bba9eae.png","fresh":false,"id":8480,"link":"http://www.wanandroid.com/blog/show/2575","niceDate":"2019-05-26","origin":"","prefix":"","projectLink":"https://github.com/ITGungnir/KotlinWanAndroid","publishTime":1558869577000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=294"}],"title":"WanAndroid模块化响应式客户端 很赞","type":0,"userId":-1,"visible":0,"zan":0},{"apkLink":"","author":"jimmysuncpt","chapterId":294,"chapterName":"完整项目","collect":false,"courseId":13,"desc":"UltraRecyclerView是一个封装多种特性的RecyclerView。主要功能包括：\r\n- 支持横向滑动／纵向滑动\r\n- 支持分页滑动，并且支持对齐方式和距离\r\n- 支持循环滚动\r\n- 支持定时自动滚动，计时器使用Handler实现\r\n- BannerView内置指示器，支持设置底部距离、已选/默认的颜色和宽度、高度和内部距离","envelopePic":"https://www.wanandroid.com/blogimgs/0858c600-1b34-41c1-a2ff-f67cdc376558.png","fresh":false,"id":8467,"link":"http://www.wanandroid.com/blog/show/2574","niceDate":"2019-05-20","origin":"","prefix":"","projectLink":"https://github.com/jimmysuncpt/UltraRecyclerView","publishTime":1558354164000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=294"}],"title":"UltraRecyclerView是一个封装多种特性的RecyclerView","type":0,"userId":-1,"visible":1,"zan":0}]
         * offset : -15
         * over : false
         * pageCount : 11
         * size : 15
         * total : 153
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
             * author : asjqkkkk
             * chapterId : 294
             * chapterName : 完整项目
             * collect : false
             * courseId : 13
             * desc : 完全使用Flutter编写的TodoList app，是一个小巧、简洁而又漂亮的app，它可以帮你随手记录日常的各项计划,如果你恰好有写任务计划的习惯，那么它一定非常适合你。
             * envelopePic : https://wanandroid.com/blogimgs/6718c2cd-695c-4eb7-b24a-ccbb10d4dd47.png
             * fresh : false
             * id : 8882
             * link : http://www.wanandroid.com/blog/show/2640
             * niceDate : 1天前
             * origin :
             * prefix :
             * projectLink : https://github.com/asjqkkkk/flutter-todos
             * publishTime : 1565527536000
             * superChapterId : 294
             * superChapterName : 开源项目主Tab
             * tags : [{"name":"项目","url":"/project/list/1?cid=294"}]
             * title : 一个非常精美的Flutter Todo-List项目
             * type : 0
             * userId : -1
             * visible : 1
             * zan : 0
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
                 * name : 项目
                 * url : /project/list/1?cid=294
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
