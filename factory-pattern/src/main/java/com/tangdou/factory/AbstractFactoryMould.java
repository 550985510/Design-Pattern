package com.tangdou.factory;

/**
 * 抽象工厂模具
 * @author 崔航
 * @date 2021/1/28 17:37
 */
public abstract class AbstractFactoryMould<P, E> implements Factory<P, E> {

    public AbstractFactoryMould() {
        print();
    }

}
