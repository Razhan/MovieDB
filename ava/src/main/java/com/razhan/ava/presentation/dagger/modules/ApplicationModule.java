package com.razhan.ava.presentation.dagger.modules;

import android.app.Application;
import android.content.Context;

import com.razhan.ava.utils.JobExecutor;
import com.razhan.ava.utils.PostExecutionThread;
import com.razhan.ava.utils.ThreadExecutor;
import com.razhan.ava.presentation.view.UIThread;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by ranzh on 3/16/2016.
 */
@Module
public class ApplicationModule {
    private final Application application;

    public ApplicationModule(Application application) {
        this.application = application;
    }

    @Provides
    @Singleton
    Context provideApplicationContext() {
        return this.application;
    }

    @Provides @Singleton
    ThreadExecutor provideThreadExecutor(JobExecutor jobExecutor) {
        return jobExecutor;
    }

    @Provides @Singleton
    PostExecutionThread providePostExecutionThread(UIThread uiThread) {
        return uiThread;
    }
}