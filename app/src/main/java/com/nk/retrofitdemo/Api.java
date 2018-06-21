package com.nk.retrofitdemo;

import java.util.Map;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PartMap;

public interface Api {



    @FormUrlEncoded
    @POST("login.php")
    Call<String> doCreateUserWithField(@Field("email") String email);


    @Multipart
    @POST("add_data.php")
    Call<String> addData(@PartMap Map<String, RequestBody> map);
}
