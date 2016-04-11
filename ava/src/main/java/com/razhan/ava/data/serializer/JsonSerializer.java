package com.razhan.ava.data.utils;

import com.google.gson.Gson;

import java.lang.reflect.Type;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Class user as Serializer/Deserializer for user entities.
 */
@Singleton
public class JsonSerializer<T> {

    private final Gson gson = new Gson();

    @Inject
    public JsonSerializer() {}

    /**
     * Serialize an object to Json.
     *
     * @param entity {@link UserEntity} to serialize.
     */
    public String serialize(T entity, Type typeOfEntity) {
        String jsonString = gson.toJson(entity, typeOfEntity);
        return jsonString;
    }

    /**
     * Deserialize a json representation of an object.
     *
     * @param jsonString A json string to deserialize.
     * @return {@link UserEntity}
     */
    public T deserialize(String jsonString, Type typeOfEntity) {
        T entity = gson.fromJson(jsonString, typeOfEntity);
        return entity;
    }
}
