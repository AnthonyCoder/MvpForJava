package com.anthony.common.base.net.common.business;

/**
 * 创建时间:2019/8/9
 * 创建人：anthony.wang
 * 功能描述：
 */
public class BasePresenter<V extends BaseView> {
    protected V view;
    public BasePresenter(V view){
        this.view = view;
    }
    protected String formatUrl(String needFormatUrl,String...params){
        if(needFormatUrl!=null&&params.length>0){
            return String.format(needFormatUrl,params);
        }
        return null;
    }
}
