package com.tangdou.composite.user.attribute;

import lombok.Getter;

/**
 * 职业
 * @author 崔航
 * @date 2021/2/2 15:38
 */
@Getter
public enum Occupation implements AttributeEnum {

    /**
     * 职业
     */
    PROGRAMMER("程序员"),
    DOCTOR("医生"),
    SINGER("歌手");

    private final String value;

    Occupation(String value) {
        this.value = value;
    }
}
