package com.razhan.ava.presentation.view.fragment;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;

/**
 * Created by ranzh on 3/17/2016.
 */
public abstract class AvaFragment extends Fragment {

    /**
     * Injects the Fragment dependencies if this injection wasn't performed previously in other
     * Fragment life cycle event.
     */
    @Override public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    /**
     * Injects the Fragment dependencies if this injection wasn't performed previously in other
     * Fragment life cycle event.
     */
    @Override public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Nullable
    @Override public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                       Bundle savedInstanceState) {
        int layoutId = getLayoutId();
        View view = inflater.inflate(layoutId, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    /**
     * Injects the Fragment views using Butter Knife library.
     */
    @Override public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    /**
     * Returns the layout id associated to the layout used in the activity.
     */
    protected abstract int getLayoutId();

}
