package com.tangdou.factory.shape;

import com.tangdou.factory.AbstractFactoryMould;
import org.springframework.stereotype.Component;

/**
 * 形状工厂 生产形状
 * @author 崔航
 * @date 2021/1/28 15:38
 */
@Component
public class ShapeFactory extends AbstractFactoryMould<Shape, ShapeEnum> {

    public ShapeFactory() {
        super();
    }

    @Override
    public Shape produce(ShapeEnum type) {
        try {
            //只可用于无参构造函数
            return (Shape) type.getType().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void print() {
        System.out.println("我是抽象工厂生产的形状工厂");
    }
}
