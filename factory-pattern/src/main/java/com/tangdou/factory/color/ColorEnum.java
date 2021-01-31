package com.tangdou.factory.color;

import com.tangdou.factory.color.product.Blue;
import com.tangdou.factory.color.product.Green;
import com.tangdou.factory.color.product.Red;
import lombok.Getter;

/**
 * 颜色枚举
 * @author 崔航
 * @date 2021/1/28 15:35
 */
@Getter
public enum ColorEnum {

    /**
     * 颜色枚举
     */
    RED(Red.class, "红色"),
    BLUE(Blue.class, "蓝色"),
    GREEN(Green.class, "绿色");

    private final Class<?> type;
    private final String name;

    ColorEnum(Class<?> type, String name) {
        this.type = type;
        this.name = name;
    }
}
