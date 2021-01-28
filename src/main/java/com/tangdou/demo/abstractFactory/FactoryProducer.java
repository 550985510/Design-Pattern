package com.tangdou.demo.abstractFactory;

import org.springframework.stereotype.Component;

/**
 * 工厂生产者
 * @author 崔航
 * @date 2021/1/28 17:44
 */
@Component
public class FactoryProducer {

    public Factory produce(FactoryEnum factoryType) {
        try {
            //只可用于无参构造函数
            return (AbstractFactoryMould) factoryType.getType().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
