package com.tangdou.composite;

import lombok.Getter;

/**
 * 链接类型
 * @author 崔航
 * @date 2021/2/2 18:01
 */
@Getter
public enum LinkedType {

    /**
     * 链接类型
     */
    RESULT("结果产物"),
    RULE("规则结点");

    private final String value;

    LinkedType(String value) {
        this.value = value;
    }
}
