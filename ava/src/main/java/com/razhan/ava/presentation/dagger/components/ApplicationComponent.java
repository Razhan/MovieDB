package com.razhan.ava.presentation.dagger.components;

import android.content.Context;

import com.razhan.ava.presentation.dagger.modules.ApplicationModule;
import com.razhan.ava.presentation.view.activity.AvaActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by ranzh on 3/16/2016.
 */
@Singleton // Constraints this component to one-per-application or unscoped bindings.
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
    void inject(AvaActivity avaActivity);

    //Exposed to sub-graphs.
    Context context();
//    ThreadExecutor threadExecutor();
//    PostExecutionThread postExecutionThread();
//    UserRepository userRepository();
}

