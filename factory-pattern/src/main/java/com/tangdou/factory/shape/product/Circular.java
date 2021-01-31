package com.tangdou.factory.shape.product;

import com.tangdou.factory.shape.AbstractShapeMould;

/**
 * 圆形
 * @author 崔航
 * @date 2021/1/28 15:30
 */
public class Circular extends AbstractShapeMould {

    public Circular() {
        super();
    }

    @Override
    public void print() {
        System.out.println("我是形状工厂生产的圆形");
    }
}
