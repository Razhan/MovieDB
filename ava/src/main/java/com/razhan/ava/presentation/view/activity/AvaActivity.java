package com.razhan.ava.presentation.view.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

/**
 * Created by ranzh on 3/17/2016.
 */
public abstract class AvaActivity extends AppCompatActivity {

    /**
     * Initializes the object graph associated to the activity scope, links presenters to the
     * Activity life cycle and initializes view injection using butter knife.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        int layoutId = getLayoutId();
        setContentView(layoutId);
        ButterKnife.bind(this);
    }

    /**
     * Returns the layout id associated to the layout used in the activity.
     */
    protected abstract int getLayoutId();
}
