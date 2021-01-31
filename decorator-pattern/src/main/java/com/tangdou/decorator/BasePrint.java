package com.tangdou.decorator;

/**
 * 被装饰者
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
