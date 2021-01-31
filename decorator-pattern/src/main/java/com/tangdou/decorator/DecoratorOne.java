package com.tangdou.decorator;

/**
 * 装饰器一
 * @author 崔航
 * @date 2020/9/15 10:20
 */
public class DecoratorOne extends AbstractDecorator{

    public DecoratorOne(PrintComponent printComponent) {
        super(printComponent);
    }


    /**
     * 打印之前
     */
    @Override
    protected void beforePrint() {
        System.out.print("我是装饰器一 现在开始打印之前准备工作");
    }

    /**
     * 打印之后
     */
    @Override
    protected void afterPrint() {
        System.out.print("我是装饰器一 现在开始打印之后善后工作");
    }
}
