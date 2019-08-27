package com.anthony.home.bean;

import com.anthony.common.base.net.model.BaseResponseModel;

import java.util.List;

public class MessageLogResult extends BaseResponseModel {
    /**
     * IsSuccess : true
     * Data : [{"Id":3,"Title":"Updated tools successfully","Detail":"Go to check the updated tools.","PicUrl":null,"RootType":0,"Type":8,"FriendId":null,"GuidLineId":null,"Readed":false,"CreateTime":"2018-08-03T03:00:34.404Z"},{"Id":2,"Title":"Updated tools successfully","Detail":"Go to check the updated tools.","PicUrl":null,"RootType":0,"Type":8,"FriendId":null,"GuidLineId":null,"Readed":false,"CreateTime":"2018-08-03T02:59:11.829Z"},{"Id":1,"Title":"Updated tools successfully","Detail":"Go to check the updated tools.","PicUrl":null,"RootType":0,"Type":8,"FriendId":null,"GuidLineId":null,"Readed":true,"CreateTime":"2018-08-03T02:58:49.009Z"}]
     */

    private List<DataBean> Data;

    public List<DataBean> getData() {
        return Data;
    }

    public void setData(List<DataBean> Data) {
        this.Data = Data;
    }

    public static class DataBean {
        /**
         * Id : 3
         * Title : Updated tools successfully
         * Detail : Go to check the updated tools.
         * PicUrl : null
         * RootType : 0
         * Type : 8
         * FriendId : null
         * GuidLineId : null
         * Readed : false
         * CreateTime : 2018-08-03T03:00:34.404Z
         */

        private long Id;
        private String Title;
        private String Detail;
        private String PicUrl;
        private int RootType;
        private int Type;
        private String FriendId;
        private String GuidLineId;
        private String ClinicalTrialId;
        private boolean Readed = true;
        private String CreateTime;

        public long getId() {
            return Id;
        }

        public void setId(long Id) {
            this.Id = Id;
        }

        public String getTitle() {
            return Title;
        }

        public void setTitle(String Title) {
            this.Title = Title;
        }

        public String getDetail() {
            return Detail;
        }

        public void setDetail(String Detail) {
            this.Detail = Detail;
        }

        public String getPicUrl() {
            return PicUrl;
        }

        public void setPicUrl(String PicUrl) {
            this.PicUrl = PicUrl;
        }

        public int getRootType() {
            return RootType;
        }

        public void setRootType(int RootType) {
            this.RootType = RootType;
        }

        public int getType() {
            return Type;
        }

        public void setType(int Type) {
            this.Type = Type;
        }

        public String getFriendId() {
            return FriendId;
        }

        public void setFriendId(String FriendId) {
            this.FriendId = FriendId;
        }

        public String getGuidLineId() {
            return GuidLineId;
        }

        public void setGuidLineId(String GuidLineId) {
            this.GuidLineId = GuidLineId;
        }

        public String getClinicalTrialId() {
            return ClinicalTrialId;
        }

        public void setClinicalTrialId(String clinicalTrialId) {
            ClinicalTrialId = clinicalTrialId;
        }

        public boolean isReaded() {
            return Readed;
        }

        public void setReaded(boolean Readed) {
            this.Readed = Readed;
        }

        public String getCreateTime() {
            return CreateTime;
        }

        public void setCreateTime(String CreateTime) {
            this.CreateTime = CreateTime;
        }
    }
}
