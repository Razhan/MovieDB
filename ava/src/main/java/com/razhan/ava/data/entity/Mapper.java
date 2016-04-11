package com.razhan.ava.data.entity;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by ranzh on 3/17/2016.
 */
public abstract class Mapper<T1, T2> {
    public abstract T2 map(T1 value);
    public abstract T1 reverseMap(T2 value);

    public Collection<T2> map(Collection<T1> values) {
        Collection<T2> returnValues = new ArrayList<>();
        for (T1 value : values) {
            returnValues.add(map(value));
        }
        return returnValues;
    }

    public Collection<T1> reverseMap(Collection<T2> values) {
        Collection<T1> returnValues = new ArrayList<>();
        for (T2 value : values) {
            returnValues.add(reverseMap(value));
        }
        return returnValues;
    }
}

