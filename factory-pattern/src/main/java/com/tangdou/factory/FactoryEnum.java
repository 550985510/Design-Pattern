package com.tangdou.factory;

import com.tangdou.factory.color.ColorFactory;
import com.tangdou.factory.shape.ShapeFactory;
import lombok.Getter;

/**
 * 形状枚举
 * @author 崔航
 * @date 2021/1/28 15:35
 */
@Getter
public enum FactoryEnum {

    /**
     * 形状枚举
     */
    SHAPE(ShapeFactory.class, "形状工厂"),
    COLOR(ColorFactory.class, "颜色工厂");

    private final Class<?> type;
    private final String name;

    FactoryEnum(Class<?> type, String name) {
        this.type = type;
        this.name = name;
    }
}
