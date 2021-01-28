package com.tangdou.demo.factory.shape.product;

import com.tangdou.demo.factory.shape.AbstractShapeMould;

/**
 * 矩形
 * @author 崔航
 * @date 2021/1/28 15:25
 */
public class Rectangle extends AbstractShapeMould {

    public Rectangle() {
        super();
    }

    @Override
    public void print() {
        System.out.println("我是形状工厂生产的矩形");
    }
}
