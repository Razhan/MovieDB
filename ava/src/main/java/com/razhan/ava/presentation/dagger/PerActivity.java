package com.razhan.ava.presentation.dagger;

import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by ranzh on 3/16/2016.
 */
@Scope
@Retention(RUNTIME)
public @interface PerActivity {}
