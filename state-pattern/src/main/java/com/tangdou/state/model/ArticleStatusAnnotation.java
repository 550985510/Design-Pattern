package com.tangdou.state.model;

import java.lang.annotation.*;

/**
 * @author 崔航
 * @date 2021/2/9 11:55
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ArticleStatusAnnotation {

    /**
     * 订单状态
     */
    ArticleStatus value();
}
