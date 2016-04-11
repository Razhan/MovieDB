package com.razhan.moviedb.repository.rest;

import com.razhan.moviedb.domain.model.MoviesWrapper;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Interface representing the MoviesDBService endpoints
 * used by retrofit
 */
public interface MoviesDBService {

    @GET("/movie/popular")
    Observable<MoviesWrapper> getPopularMovies(@Query("api_key") String apiKey);
}
