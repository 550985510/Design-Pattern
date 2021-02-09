package com.tangdou.observer.observer;

import com.tangdou.observer.model.OrderStatus;
import com.tangdou.observer.model.OrderStatusAnnotation;
import org.springframework.stereotype.Service;

/**
 * @author 崔航
 * @date 2021/2/9 12:00
 */
@Service
@OrderStatusAnnotation(OrderStatus.CREATED)
public class OrderCreatedObserver implements Observer {

    /**
     * 处理监听
     *
     * @param orderNo 订单编号
     */
    @Override
    public void handle(String orderNo) {
        System.out.println("已接收到订单" + orderNo + "创建成功的消息");
    }
}
