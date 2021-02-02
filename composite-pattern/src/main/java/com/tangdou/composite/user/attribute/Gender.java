package com.tangdou.composite.user.attribute;

import lombok.Getter;

/**
 * 性别
 * @author 崔航
 * @date 2021/2/2 15:31
 */
@Getter
public enum Gender implements AttributeEnum {

    /**
     * 性别
     */
    FEMALE("女"),
    MALE("男");

    private final String value;

    Gender(String value) {
        this.value = value;
    }
}
