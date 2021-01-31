package com.tangdou.factory.color.product;

import com.tangdou.factory.color.AbstractColorMould;

/**
 * 蓝色
 * @author 崔航
 * @date 2021/1/28 15:30
 */
public class Blue extends AbstractColorMould {

    public Blue() {
        super();
    }

    @Override
    public void print() {
        System.out.println("我是颜色工厂生产的蓝色");
    }
}
