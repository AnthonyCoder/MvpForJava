package com.anthony.home.bean;

import com.anthony.common.base.net.model.BaseResponseModel;

import java.util.List;

public class BannerResult extends BaseResponseModel {

    private List<DataBean> data;

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * desc : Android架构师成长路线图
         * id : 26
         * imagePath : https://wanandroid.com/blogimgs/4f66c08e-d8b6-470d-9c8c-eeed9dbfb2a3.png
         * isVisible : 1
         * order : 1
         * title : Android架构师成长路线图
         * type : 0
         * url : https://mp.weixin.qq.com/s?__biz=MzU2NTcwMTU0OQ==&amp;mid=2247485212&amp;idx=2&amp;sn=0299811734eea94ec4e186aa21bae175&amp;chksm=fcb6f9decbc170c8b2033db6d3919b0762b0b4c80c80f7afdb39353e228e8df4e2361102ff03&amp;token=1498464891&amp;lang=zh_CN#rd
         */

        private String desc;
        private int id;
        private String imagePath;
        private int isVisible;
        private int order;
        private String title;
        private int type;
        private String url;

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getImagePath() {
            return imagePath;
        }

        public void setImagePath(String imagePath) {
            this.imagePath = imagePath;
        }

        public int getIsVisible() {
            return isVisible;
        }

        public void setIsVisible(int isVisible) {
            this.isVisible = isVisible;
        }

        public int getOrder() {
            return order;
        }

        public void setOrder(int order) {
            this.order = order;
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

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
}
