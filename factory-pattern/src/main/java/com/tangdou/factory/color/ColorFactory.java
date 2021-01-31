package com.tangdou.factory.color;

import com.tangdou.factory.AbstractFactoryMould;
import org.springframework.stereotype.Component;

/**
 * 形状工厂 生产形状
 * @author 崔航
 * @date 2021/1/28 15:38
 */
@Component
public class ColorFactory extends AbstractFactoryMould<Color, ColorEnum> {

    public ColorFactory() {
        super();
    }

    @Override
    public Color produce(ColorEnum type) {
        try {
            //只可用于无参构造函数
            return (Color) type.getType().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void print() {
        System.out.println("我是抽象工厂生产的颜色工厂");
    }
}
