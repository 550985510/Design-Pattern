package com.tangdou.builder.demo.enums;

import lombok.Getter;

/**
 * 大小型号
 * @author 崔航
 * @date 2021/1/31 15:15
 */
@Getter
public enum SizeType {

    /**
     * 大小型号
     */
    SMALL("小"),
    MEDIUM("中"),
    LARGE("大");

    private final String value;

    SizeType(String value) {
        this.value = value;
    }
}
