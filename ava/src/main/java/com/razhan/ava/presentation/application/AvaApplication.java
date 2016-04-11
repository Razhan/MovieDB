package com.razhan.ava.presentation.application;

import android.app.Application;

import com.razhan.ava.presentation.dagger.components.ApplicationComponent;
import com.razhan.ava.presentation.dagger.components.DaggerApplicationComponent;
import com.razhan.ava.presentation.dagger.modules.ApplicationModule;

/**
 * Created by ranzh on 3/16/2016.
 */
public class AvaApplication extends Application {

    private ApplicationComponent applicationComponent;

    @Override public void onCreate() {
        super.onCreate();
        this.initializeInjector();
        this.initializeLeakDetection();
    }

    private void initializeInjector() {
        this.applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    public ApplicationComponent getApplicationComponent() {
        return this.applicationComponent;
    }

    private void initializeLeakDetection() {
//        if (BuildConfig.DEBUG) {
//            LeakCanary.install(this);
//        }
    }
}
