package com.anthony.home.bean;

import com.anthony.common.base.net.model.BaseResponseModel;

import java.util.List;

/**
 * 创建时间:2019/8/15
 * 创建人：anthony.wang
 * 功能描述：
 */
public class WxArticleListResult extends BaseResponseModel {
    /**
     * data : {"curPage":0,"datas":[{"apkLink":"","author":"玉刚说","chapterId":410,"chapterName":"玉刚说","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":8907,"link":"https://mp.weixin.qq.com/s/LBuIZZch_vZXXx5Wc0Yv2A","niceDate":"2019-08-09","origin":"","prefix":"","projectLink":"","publishTime":1565280000000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/410/1"}],"title":"Android 仿微信 QQ 图片裁剪，赶紧收藏起来！","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"玉刚说","chapterId":410,"chapterName":"玉刚说","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":8906,"link":"https://mp.weixin.qq.com/s/vbIKAo0whZKyIy_E80FcWw","niceDate":"2019-08-01","origin":"","prefix":"","projectLink":"","publishTime":1564588800000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/410/1"}],"title":"XML中配置网易云歌手详情滑动效果","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"玉刚说","chapterId":410,"chapterName":"玉刚说","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":8905,"link":"https://mp.weixin.qq.com/s/iW9YW6icJTi_8sVNYs_Kfg","niceDate":"2019-07-29","origin":"","prefix":"","projectLink":"","publishTime":1564329600000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/410/1"}],"title":"APP 热修复都懂了，你会 SDK 热修复吗？最全方案在这里！","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"玉刚说","chapterId":410,"chapterName":"玉刚说","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":8800,"link":"https://mp.weixin.qq.com/s/mDwfvV6_f8K7HVSRHXbtWg","niceDate":"2019-07-25","origin":"","prefix":"","projectLink":"","publishTime":1563984000000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/410/1"}],"title":"从各大跨平台技术说起，我们真的需要虚拟 DOM 吗？","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"玉刚说","chapterId":410,"chapterName":"玉刚说","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":8799,"link":"https://mp.weixin.qq.com/s/r5GKM_voDS84TQDXeFT8bA","niceDate":"2019-07-23","origin":"","prefix":"","projectLink":"","publishTime":1563811200000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/410/1"}],"title":"Android 多线程选型最全指南","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"玉刚说","chapterId":410,"chapterName":"玉刚说","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":8798,"link":"https://mp.weixin.qq.com/s/IhNdod3rBmhkYwJ6XuTIYg","niceDate":"2019-07-22","origin":"","prefix":"","projectLink":"","publishTime":1563724800000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/410/1"}],"title":"Android指纹识别，提升APP用户体验，从这里开始","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"玉刚说","chapterId":410,"chapterName":"玉刚说","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":8797,"link":"https://mp.weixin.qq.com/s/p-32JsPzpgW4D3WjNhm9cA","niceDate":"2019-07-18","origin":"","prefix":"","projectLink":"","publishTime":1563379200000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/410/1"}],"title":"ConstraintLayout，看完一篇真的就够了么？","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"玉刚说","chapterId":410,"chapterName":"玉刚说","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":8796,"link":"https://mp.weixin.qq.com/s/l5SznOSB1FTvFIvwCRl1-Q","niceDate":"2019-07-16","origin":"","prefix":"","projectLink":"","publishTime":1563206400000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/410/1"}],"title":"Android 多线程误区，我不信你们都懂！","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"玉刚说","chapterId":410,"chapterName":"玉刚说","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":8795,"link":"https://mp.weixin.qq.com/s/QSqAFz8pJYZGoDY3Wz-OJA","niceDate":"2019-07-11","origin":"","prefix":"","projectLink":"","publishTime":1562774400000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/410/1"}],"title":"你必须要了解的 AndroidStudio 3.x Lint API","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"玉刚说","chapterId":410,"chapterName":"玉刚说","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":8794,"link":"https://mp.weixin.qq.com/s/Ika_qU2f_MePTp281FCEig","niceDate":"2019-07-02","origin":"","prefix":"","projectLink":"","publishTime":1561996800000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/410/1"}],"title":"使用 Flutter 开发 Github 客户端及学习历程的小结","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"玉刚说","chapterId":410,"chapterName":"玉刚说","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":8793,"link":"https://mp.weixin.qq.com/s/fh6lvYONrWmldMEnEdw5yg","niceDate":"2019-06-19","origin":"","prefix":"","projectLink":"","publishTime":1560873600000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/410/1"}],"title":"Flutter 移动端架构实践：Widget-Async-Bloc-Service","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"玉刚说","chapterId":410,"chapterName":"玉刚说","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":8792,"link":"https://mp.weixin.qq.com/s/QXh51i9_bgawVytZCUCNXQ","niceDate":"2019-06-13","origin":"","prefix":"","projectLink":"","publishTime":1560355200000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/410/1"}],"title":"Android 官方架构组件 Paging-Ex：列表状态的响应式管理","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"玉刚说","chapterId":410,"chapterName":"玉刚说","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":8594,"link":"https://mp.weixin.qq.com/s/209BTLs17hf9uue28OCubw","niceDate":"2019-06-05","origin":"","prefix":"","projectLink":"","publishTime":1559664000000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/410/1"}],"title":"Android Shortcuts，让你在系统桌面上为所欲为","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"玉刚说","chapterId":410,"chapterName":"玉刚说","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":8593,"link":"https://mp.weixin.qq.com/s/esClAFOF1eH1cAxNm1W9hA","niceDate":"2019-06-04","origin":"","prefix":"","projectLink":"","publishTime":1559577600000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/410/1"}],"title":"Android Q 适配，看这篇就妥了","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"玉刚说","chapterId":410,"chapterName":"玉刚说","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":8572,"link":"https://mp.weixin.qq.com/s/dJC8z1YxOm_z-jRC2Wvz8A","niceDate":"2019-05-31","origin":"","prefix":"","projectLink":"","publishTime":1559232000000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/410/1"}],"title":"RxHttp：新一代 Android 网络请求神器，一条链发送各种请求","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"玉刚说","chapterId":410,"chapterName":"玉刚说","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":8571,"link":"https://mp.weixin.qq.com/s/917kjluSwqlEZJNxilLLtw","niceDate":"2019-05-30","origin":"","prefix":"","projectLink":"","publishTime":1559145600000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/410/1"}],"title":"探索 Android 平台的 CameraX","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"玉刚说","chapterId":410,"chapterName":"玉刚说","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":8570,"link":"https://mp.weixin.qq.com/s/i_8wnO45dzZ_DtkBLabYuA","niceDate":"2019-05-29","origin":"","prefix":"","projectLink":"","publishTime":1559059200000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/410/1"}],"title":"Android 之 Lottie 实现炫酷动画背后的原理","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"玉刚说","chapterId":410,"chapterName":"玉刚说","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":8518,"link":"https://mp.weixin.qq.com/s/HD_hqi8QCb6co7IaIh6KMg","niceDate":"2019-05-28","origin":"","prefix":"","projectLink":"","publishTime":1558972800000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/410/1"}],"title":"Kotlin：你必须要知道的 inline-noinline-crossinline","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"玉刚说","chapterId":410,"chapterName":"玉刚说","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":8517,"link":"https://mp.weixin.qq.com/s/6PPQBCPdDGXpDZVouEauoQ","niceDate":"2019-05-27","origin":"","prefix":"","projectLink":"","publishTime":1558886400000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/410/1"}],"title":"滴滴开源 Booster：移动APP质量优化框架","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"玉刚说","chapterId":410,"chapterName":"玉刚说","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":8516,"link":"https://mp.weixin.qq.com/s/Xh2MTNC9N0EhXC6k5gWoPQ","niceDate":"2019-05-26","origin":"","prefix":"","projectLink":"","publishTime":1558800000000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/410/1"}],"title":"是时候更新Android Studio 3.5了！不信，你看~","type":0,"userId":-1,"visible":1,"zan":0}],"offset":-20,"over":false,"pageCount":12,"size":20,"total":232}
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
         * datas : [{"apkLink":"","author":"玉刚说","chapterId":410,"chapterName":"玉刚说","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":8907,"link":"https://mp.weixin.qq.com/s/LBuIZZch_vZXXx5Wc0Yv2A","niceDate":"2019-08-09","origin":"","prefix":"","projectLink":"","publishTime":1565280000000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/410/1"}],"title":"Android 仿微信 QQ 图片裁剪，赶紧收藏起来！","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"玉刚说","chapterId":410,"chapterName":"玉刚说","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":8906,"link":"https://mp.weixin.qq.com/s/vbIKAo0whZKyIy_E80FcWw","niceDate":"2019-08-01","origin":"","prefix":"","projectLink":"","publishTime":1564588800000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/410/1"}],"title":"XML中配置网易云歌手详情滑动效果","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"玉刚说","chapterId":410,"chapterName":"玉刚说","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":8905,"link":"https://mp.weixin.qq.com/s/iW9YW6icJTi_8sVNYs_Kfg","niceDate":"2019-07-29","origin":"","prefix":"","projectLink":"","publishTime":1564329600000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/410/1"}],"title":"APP 热修复都懂了，你会 SDK 热修复吗？最全方案在这里！","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"玉刚说","chapterId":410,"chapterName":"玉刚说","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":8800,"link":"https://mp.weixin.qq.com/s/mDwfvV6_f8K7HVSRHXbtWg","niceDate":"2019-07-25","origin":"","prefix":"","projectLink":"","publishTime":1563984000000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/410/1"}],"title":"从各大跨平台技术说起，我们真的需要虚拟 DOM 吗？","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"玉刚说","chapterId":410,"chapterName":"玉刚说","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":8799,"link":"https://mp.weixin.qq.com/s/r5GKM_voDS84TQDXeFT8bA","niceDate":"2019-07-23","origin":"","prefix":"","projectLink":"","publishTime":1563811200000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/410/1"}],"title":"Android 多线程选型最全指南","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"玉刚说","chapterId":410,"chapterName":"玉刚说","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":8798,"link":"https://mp.weixin.qq.com/s/IhNdod3rBmhkYwJ6XuTIYg","niceDate":"2019-07-22","origin":"","prefix":"","projectLink":"","publishTime":1563724800000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/410/1"}],"title":"Android指纹识别，提升APP用户体验，从这里开始","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"玉刚说","chapterId":410,"chapterName":"玉刚说","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":8797,"link":"https://mp.weixin.qq.com/s/p-32JsPzpgW4D3WjNhm9cA","niceDate":"2019-07-18","origin":"","prefix":"","projectLink":"","publishTime":1563379200000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/410/1"}],"title":"ConstraintLayout，看完一篇真的就够了么？","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"玉刚说","chapterId":410,"chapterName":"玉刚说","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":8796,"link":"https://mp.weixin.qq.com/s/l5SznOSB1FTvFIvwCRl1-Q","niceDate":"2019-07-16","origin":"","prefix":"","projectLink":"","publishTime":1563206400000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/410/1"}],"title":"Android 多线程误区，我不信你们都懂！","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"玉刚说","chapterId":410,"chapterName":"玉刚说","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":8795,"link":"https://mp.weixin.qq.com/s/QSqAFz8pJYZGoDY3Wz-OJA","niceDate":"2019-07-11","origin":"","prefix":"","projectLink":"","publishTime":1562774400000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/410/1"}],"title":"你必须要了解的 AndroidStudio 3.x Lint API","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"玉刚说","chapterId":410,"chapterName":"玉刚说","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":8794,"link":"https://mp.weixin.qq.com/s/Ika_qU2f_MePTp281FCEig","niceDate":"2019-07-02","origin":"","prefix":"","projectLink":"","publishTime":1561996800000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/410/1"}],"title":"使用 Flutter 开发 Github 客户端及学习历程的小结","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"玉刚说","chapterId":410,"chapterName":"玉刚说","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":8793,"link":"https://mp.weixin.qq.com/s/fh6lvYONrWmldMEnEdw5yg","niceDate":"2019-06-19","origin":"","prefix":"","projectLink":"","publishTime":1560873600000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/410/1"}],"title":"Flutter 移动端架构实践：Widget-Async-Bloc-Service","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"玉刚说","chapterId":410,"chapterName":"玉刚说","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":8792,"link":"https://mp.weixin.qq.com/s/QXh51i9_bgawVytZCUCNXQ","niceDate":"2019-06-13","origin":"","prefix":"","projectLink":"","publishTime":1560355200000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/410/1"}],"title":"Android 官方架构组件 Paging-Ex：列表状态的响应式管理","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"玉刚说","chapterId":410,"chapterName":"玉刚说","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":8594,"link":"https://mp.weixin.qq.com/s/209BTLs17hf9uue28OCubw","niceDate":"2019-06-05","origin":"","prefix":"","projectLink":"","publishTime":1559664000000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/410/1"}],"title":"Android Shortcuts，让你在系统桌面上为所欲为","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"玉刚说","chapterId":410,"chapterName":"玉刚说","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":8593,"link":"https://mp.weixin.qq.com/s/esClAFOF1eH1cAxNm1W9hA","niceDate":"2019-06-04","origin":"","prefix":"","projectLink":"","publishTime":1559577600000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/410/1"}],"title":"Android Q 适配，看这篇就妥了","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"玉刚说","chapterId":410,"chapterName":"玉刚说","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":8572,"link":"https://mp.weixin.qq.com/s/dJC8z1YxOm_z-jRC2Wvz8A","niceDate":"2019-05-31","origin":"","prefix":"","projectLink":"","publishTime":1559232000000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/410/1"}],"title":"RxHttp：新一代 Android 网络请求神器，一条链发送各种请求","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"玉刚说","chapterId":410,"chapterName":"玉刚说","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":8571,"link":"https://mp.weixin.qq.com/s/917kjluSwqlEZJNxilLLtw","niceDate":"2019-05-30","origin":"","prefix":"","projectLink":"","publishTime":1559145600000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/410/1"}],"title":"探索 Android 平台的 CameraX","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"玉刚说","chapterId":410,"chapterName":"玉刚说","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":8570,"link":"https://mp.weixin.qq.com/s/i_8wnO45dzZ_DtkBLabYuA","niceDate":"2019-05-29","origin":"","prefix":"","projectLink":"","publishTime":1559059200000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/410/1"}],"title":"Android 之 Lottie 实现炫酷动画背后的原理","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"玉刚说","chapterId":410,"chapterName":"玉刚说","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":8518,"link":"https://mp.weixin.qq.com/s/HD_hqi8QCb6co7IaIh6KMg","niceDate":"2019-05-28","origin":"","prefix":"","projectLink":"","publishTime":1558972800000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/410/1"}],"title":"Kotlin：你必须要知道的 inline-noinline-crossinline","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"玉刚说","chapterId":410,"chapterName":"玉刚说","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":8517,"link":"https://mp.weixin.qq.com/s/6PPQBCPdDGXpDZVouEauoQ","niceDate":"2019-05-27","origin":"","prefix":"","projectLink":"","publishTime":1558886400000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/410/1"}],"title":"滴滴开源 Booster：移动APP质量优化框架","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"玉刚说","chapterId":410,"chapterName":"玉刚说","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":8516,"link":"https://mp.weixin.qq.com/s/Xh2MTNC9N0EhXC6k5gWoPQ","niceDate":"2019-05-26","origin":"","prefix":"","projectLink":"","publishTime":1558800000000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/410/1"}],"title":"是时候更新Android Studio 3.5了！不信，你看~","type":0,"userId":-1,"visible":1,"zan":0}]
         * offset : -20
         * over : false
         * pageCount : 12
         * size : 20
         * total : 232
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
             * author : 玉刚说
             * chapterId : 410
             * chapterName : 玉刚说
             * collect : false
             * courseId : 13
             * desc :
             * envelopePic :
             * fresh : false
             * id : 8907
             * link : https://mp.weixin.qq.com/s/LBuIZZch_vZXXx5Wc0Yv2A
             * niceDate : 2019-08-09
             * origin :
             * prefix :
             * projectLink :
             * publishTime : 1565280000000
             * superChapterId : 408
             * superChapterName : 公众号
             * tags : [{"name":"公众号","url":"/wxarticle/list/410/1"}]
             * title : Android 仿微信 QQ 图片裁剪，赶紧收藏起来！
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
                 * name : 公众号
                 * url : /wxarticle/list/410/1
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
