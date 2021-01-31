package com.tangdou.decorator;

/**
 * 装饰器模板
 * @author 崔航
 * @date 2020/9/15 10:23
 */
public abstract class AbstractDecorator implements PrintComponent {

    private final PrintComponent printComponent;

    public AbstractDecorator(PrintComponent printComponent) {
        this.printComponent = printComponent;
    }

    /**
     * 打印
     */
    @Override
    public void print() {
        beforePrint();
        printComponent.print();
        afterPrint();
    }

    /**
     * 打印之前
     */
    protected abstract void beforePrint();

    /**
     * 打印之后
     */
    protected abstract void afterPrint();
}
