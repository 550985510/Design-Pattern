package com.tangdou.demo.decorator;

import org.springframework.stereotype.Service;

/**
 * @author 崔航
 * @date 2020/9/15 10:18
 */
public class BasePrint implements PrintComponent {
    /**
     * 打印
     */
    @Override
    public void print() {
        System.out.print("我是被装饰者！！！");
    }
}
