package com.tangdou.observer.model;

import java.lang.annotation.*;

/**
 * @author 崔航
 * @date 2021/2/9 11:55
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface OrderStatusAnnotation {

    /**
     * 订单状态
     */
    OrderStatus[] value();
}
