package com.tangdou.observer.observer;

import com.tangdou.observer.model.OrderStatus;
import com.tangdou.observer.model.OrderStatusAnnotation;
import org.springframework.stereotype.Service;

/**
 * @author 崔航
 * @date 2021/2/9 12:05
 */
@Service
@OrderStatusAnnotation({OrderStatus.INTERVIEW, OrderStatus.APPROVAL, OrderStatus.LOAN})
public class BusinessManagerObserver implements Observer {

    /**
     * 处理监听
     *
     * @param orderNo 订单编号
     */
    @Override
    public void handle(String orderNo) {
        System.out.println("已通知商务经理跟进订单状态");
    }
}
