package com.github.lihang1991.tools.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * jack 数据转换工具类
 * @author lih
 * @date 2020-06-18 上午11:26
 **/
public class JacksonUtil {

    private final static ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    static {
        // 忽略多余的属性
        OBJECT_MAPPER.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        OBJECT_MAPPER.registerModule(new JavaTimeModule());
    }

    public static ObjectMapper getInstance() {
        return OBJECT_MAPPER;
    }

    public static String toJSON(Object obj) {
        String json = null;
        try {
            json = OBJECT_MAPPER.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return json;
    }

    /**
     * 要求:用户传递什么类型,返回什么对象.
     * 方案: 使用泛型对象实现!!!
     * @param json
     * @param targetClass
     * @return
     */
    public static <T> T toObject(String json,Class<T> targetClass) {
        T t = null;
        try {
            t = OBJECT_MAPPER.readValue(json, targetClass);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return t;
    }

    public static <T> List<T> toList(String json, Class<T> targetClass) {
        List<T> list = null;
        try {
            CollectionType listType = OBJECT_MAPPER.getTypeFactory().constructCollectionType(ArrayList.class, targetClass);
            list = OBJECT_MAPPER.readValue(json,listType);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return list;
    }

    /**
     * json对象
     * @param json
     * @return json树型结构
     */
    public static JsonNode resolveJson(String json) {
        JsonNode jsonNode = null;
        try {
            jsonNode = OBJECT_MAPPER.readTree(json);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return jsonNode;
    }
}
