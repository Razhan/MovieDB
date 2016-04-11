package com.razhan.ava.data.exception;

import android.content.Context;

/**
 * Created by ranzh on 3/17/2016.
 */
public interface AvaErrorMessageFactory {

    String create(Context context, Exception exception);
}
