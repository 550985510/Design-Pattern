package com.tangdou.builder;

import com.tangdou.factory.color.Color;
import com.tangdou.factory.shape.Shape;

/**
 * 饼干建造者抽象类
 * @author 崔航
 * @date 2021/1/30 16:48
 */
public abstract class AbstractCookiesBuilder implements CookiesBuilder {

    /**
     * 形状
     */
    protected Shape shape;

    /**
     * 形状
     */
    protected Color color;

}
