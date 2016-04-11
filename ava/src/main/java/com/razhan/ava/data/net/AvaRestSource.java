package com.razhan.ava.data.net;

import com.razhan.ava.data.repository.utils.interceptors.HttpLoggingInterceptor;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by ranzh on 4/2/2016.
 */
public class AvaRestSource {

    private OkHttpClient client;
    private int CONNECTION_TIMEOUT = 10 * 1000;

    protected AvaRestSource() {

        client = new OkHttpClient.Builder()
            .connectTimeout(CONNECTION_TIMEOUT, TimeUnit.MILLISECONDS)
            .readTimeout(CONNECTION_TIMEOUT, TimeUnit.MILLISECONDS)
            .build();

        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BASIC);
        client.interceptors().add(loggingInterceptor);
    }

    protected OkHttpClient getClient() {
        return client;
    }

}
