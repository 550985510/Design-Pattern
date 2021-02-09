package com.tangdou.observer.service;

import com.tangdou.observer.model.Order;
import com.tangdou.observer.model.OrderStatus;

/**
 * @author 崔航
 * @date 2021/2/9 11:08
 */
public interface OrderService {

    /**
     * 创建订单
     * @param order 订单信息
     */
    void create(Order order);

    /**
     * 状态变更
     * @param orderNo 订单号
     * @param status 订单状态
     */
    void updateStatus(String orderNo, OrderStatus status);
}
