package com.anthony.common.base.net.api;

import java.util.Map;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.http.FieldMap;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

/**
 * 创建时间:2019/8/6
 * 创建人：anthony.wang
 * 功能描述：
 */
public interface ApiService {
    @GET("{url}")
    Observable<ResponseBody> executeGet(
            @Path(value = "url",encoded = true) String url,
            @QueryMap Map<String, Object> maps);


    @POST("{url}")
    Observable<ResponseBody> executePost(
            @Path(value = "url",encoded = true) String url,
            @FieldMap Map<String, Object> maps);


    @GET("{url}")
    Observable<ResponseBody> executeGetWithHeader(
            @HeaderMap Map<String, String> headers,
            @Path(value = "url",encoded = true) String url,
            @QueryMap Map<String, Object> maps);


    @POST("{url}")
    Observable<ResponseBody> executePostWithHeader(
            @HeaderMap Map<String, String> headers,
            @Path(value = "url",encoded = true) String url,
            @FieldMap Map<String, Object> maps);


}
