package com.tangdou.observer.observer;

/**
 * 观察者 监听者
 * @author 崔航
 * @date 2021/2/9 11:17
 */
public interface Observer {

    /**
     * 处理监听
     * @param orderNo 订单编号
     */
    void handle(String orderNo);
}
