package com.razhan.ava.data.repository.datasource;

import com.razhan.ava.data.entity.Identifiable;

/**
 * Mixin data source used to act as a cache. It contains methods to both read and add/update/delete
 * values.
 *
 * @param <K> The class of the key used by this data source.
 * @param <V> The class of the values retrieved from this data source.
 */
public interface CacheDataSource<K, V extends Identifiable<K>>
        extends ReadableDataSource<K, V>, WriteableDataSource<K, V> {
    /**
     * Returns true whether the value stored in this cache is still valid.
     *
     * @param value The value to be checked.
     */
    boolean isValid(V value);
}
