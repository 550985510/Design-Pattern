package com.tangdou.factory.shape.product;

import com.tangdou.factory.shape.AbstractShapeMould;

/**
 * 正方形
 * @author 崔航
 * @date 2021/1/28 15:28
 */
public class Square extends AbstractShapeMould {

    public Square() {
        super();
    }

    @Override
    public void print() {
        System.out.println("我是形状工厂生产的正方形");
    }
}
