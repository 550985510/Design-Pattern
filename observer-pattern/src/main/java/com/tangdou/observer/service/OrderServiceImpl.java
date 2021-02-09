package com.tangdou.observer.service;

import com.tangdou.common.utils.AssertUtils;
import com.tangdou.observer.model.Order;
import com.tangdou.observer.model.OrderStatus;
import com.tangdou.observer.observer.ObserverManager;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * 订单服务实现类 模拟数据库
 * @author 崔航
 * @date 2021/2/9 11:10
 */
@Service
public class OrderServiceImpl implements OrderService {

    private final Map<String, Order> ORDER_TABLE = new HashMap<>();

    @Resource
    private ObserverManager observerManager;

    /**
     * 创建订单
     *
     * @param order 订单信息
     */
    @Override
    public void create(Order order) {
        AssertUtils.notNull(order, "订单信息为空");
        AssertUtils.hasText(order.getOrderNo(), "订单号为空");
        ORDER_TABLE.put(order.getOrderNo(), order);
        this.updateStatus(order.getOrderNo(), OrderStatus.CREATED);
    }

    /**
     * 状态变更
     *
     * @param orderNo 订单号
     * @param status  订单状态
     */
    @Override
    public void updateStatus(String orderNo, OrderStatus status) {
        Order order = ORDER_TABLE.get(orderNo);
        order.setOrderStatus(status);
        ORDER_TABLE.put(orderNo, order);
        observerManager.notify(status, orderNo);
    }
}
