package com.tangdou.composite.filter;

import com.tangdou.common.exception.DemoException;

/**
 * 决策器工厂 工厂模式
 * @author 崔航
 * @date 2021/2/2 19:14
 */
public class FilterFactory {

    public static Filter produce(FilterType type) {
        try {
            //只可用于无参构造函数
            return (Filter) type.getType().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        throw new DemoException("生产规则过滤器失败");
    }
}
