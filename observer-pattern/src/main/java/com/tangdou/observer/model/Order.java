package com.tangdou.observer.model;

import lombok.Data;

import java.math.BigDecimal;

/**
 * 订单
 * @author 崔航
 * @date 2021/2/9 10:45
 */
@Data
public class Order {

    private String orderNo;

    private BigDecimal loanAmount;

    private OrderStatus orderStatus;

    public Order(String orderNo, BigDecimal loanAmount) {
        this.orderNo = orderNo;
        this.loanAmount = loanAmount;
    }
}
