package com.tangdou.demo.abstractFactory;

/**
 * 抽象工厂模具
 * @author 崔航
 * @date 2021/1/28 17:37
 */
public abstract class AbstractFactoryMould<P, E> implements Factory<P, E> {

    public AbstractFactoryMould() {
        print();
    }

    /**
     * 生产
     * @param e 产品类型枚举
     * @return 产品
     */
    @Override
    public abstract P produce(E e);
}
