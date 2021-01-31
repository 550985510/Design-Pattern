package com.tangdou.factory.shape;

import com.tangdou.factory.shape.product.Circular;
import com.tangdou.factory.shape.product.Rectangle;
import com.tangdou.factory.shape.product.Square;
import lombok.Getter;

/**
 * 形状枚举
 * @author 崔航
 * @date 2021/1/28 15:35
 */
@Getter
public enum ShapeEnum {

    /**
     * 形状枚举
     */
    SQUARE(Square.class, "正方形"),
    CIRCULAR(Circular.class, "圆形"),
    RECTANGLE(Rectangle.class, "矩形");

    private final Class<?> type;
    private final String name;

    ShapeEnum(Class<?> type, String name) {
        this.type = type;
        this.name = name;
    }
}
