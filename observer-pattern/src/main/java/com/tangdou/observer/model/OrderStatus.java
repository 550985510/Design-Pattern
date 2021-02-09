package com.tangdou.observer.model;

import lombok.Getter;

/**
 * 订单状态
 * @author 崔航
 * @date 2021/2/9 10:45
 */
public enum OrderStatus {

    /**
     * 订单状态
     */
    CREATED("创建"),
    EVALUATION("初评"),
    INTERVIEW("面谈"),
    COLLECTION("采集"),
    REPORT("报卷"),
    APPROVAL("审批"),
    LOAN("放款");

    @Getter
    private final String value;

    OrderStatus(String value) {
        this.value = value;
    }
}
