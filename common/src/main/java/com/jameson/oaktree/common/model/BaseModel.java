package com.jameson.oaktree.common.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.Serializable;

/**
 * @author zhangshu
 * @date 2022-01-17 10:29
 */
public class BaseModel implements Serializable {

    protected static Logger logger = LoggerFactory.getLogger(BaseModel.class);

    private static final ObjectMapper mapper = new ObjectMapper();

    public String toJson() {
        try {
            return mapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            logger.error("to JSON error : {}", e.getMessage());
        }
        return null;
    }

    public static <T> T fromJson(String json, Class<T> type) {
        try {
            return mapper.readValue(json, type);
        } catch (IOException e) {
            logger.error("{} from JSON error : {}", json, e);
            throw new RuntimeException("JSON 格式不正确或字段存在偏差.");
        }
    }

    @Override
    public String toString() {
        return toJson();
    }
}
