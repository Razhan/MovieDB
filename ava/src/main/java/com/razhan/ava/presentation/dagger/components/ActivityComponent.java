package com.razhan.ava.presentation.dagger.components;

import android.app.Activity;

import com.razhan.ava.presentation.dagger.PerActivity;
import com.razhan.ava.presentation.dagger.modules.ActivityModule;

import dagger.Component;

/**
 * A base component upon which fragment's components may depend.
 * Activity-level components should extend this component.
 *
 * Subtypes of ActivityComponent should be decorated with annotation:
 * {@link com.fernandocejas.android10.sample.presentation.internal.di.PerActivity}
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {
    //Exposed to sub-graphs.
    Activity activity();
}
