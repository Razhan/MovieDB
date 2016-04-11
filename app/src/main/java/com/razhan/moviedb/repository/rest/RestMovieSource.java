package com.razhan.moviedb.repository.rest;

import com.razhan.ava.data.net.AvaRestSource;
import com.razhan.moviedb.Constants;
import com.razhan.moviedb.domain.model.MoviesWrapper;


import java.util.Map;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;
import rx.schedulers.Schedulers;

/**
 * Created by ranzh on 4/2/2016.
 */
public class RestMovieSource extends AvaRestSource {

    private final MoviesDBService moviesDBService;

    public RestMovieSource() {
        super();

        Retrofit movieRetrofit  = new Retrofit.Builder()
                .baseUrl(Constants.MOVIE_DB_HOST)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(getClient())
                .build();

        moviesDBService = movieRetrofit.create(MoviesDBService.class);
    }

    public Observable<MoviesWrapper> getMovies() {
        return moviesDBService.getPopularMovies(Constants.API_KEY)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread());
    }




}
