package com.tangdou.factory;

import org.springframework.stereotype.Component;

/**
 * 工厂生产者
 * @author 崔航
 * @date 2021/1/28 17:44
 */
@Component
public class FactoryProducer<P, E> {

    @SuppressWarnings("unchecked")
    public Factory<P, E> produce(FactoryEnum factoryType) {
        try {
            //只可用于无参构造函数
            return (Factory<P, E>) factoryType.getType().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
