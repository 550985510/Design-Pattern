package com.tangdou.demo.factory;

import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationTargetException;

/**
 * 形状工厂 生产形状
 * @author 崔航
 * @date 2021/1/28 15:38
 */
@Component
public class ShapeFactory {

    public Shape produce(ShapeEnum type) {
        try {
            //只可用于无参构造函数
            return (Shape) type.getType().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
