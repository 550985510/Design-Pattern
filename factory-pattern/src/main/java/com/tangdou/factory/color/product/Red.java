package com.tangdou.factory.color.product;

import com.tangdou.factory.color.AbstractColorMould;

/**
 * 红色
 * @author 崔航
 * @date 2021/1/28 15:30
 */
public class Red extends AbstractColorMould {

    public Red() {
        super();
    }

    @Override
    public void print() {
        System.out.println("我是颜色工厂生产的红色");
    }
}
