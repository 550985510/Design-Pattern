package com.tangdou.factory.color.product;

import com.tangdou.factory.color.AbstractColorMould;

/**
 * 绿色
 * @author 崔航
 * @date 2021/1/28 15:30
 */
public class Green extends AbstractColorMould {

    public Green() {
        super();
    }

    @Override
    public void print() {
        System.out.println("我是颜色工厂生产的绿色");
    }
}
