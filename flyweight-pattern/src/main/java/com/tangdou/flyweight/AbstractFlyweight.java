package com.tangdou.flyweight;

/**
 * @author 崔航
 * @date 2021/2/3 16:22
 */
public abstract class AbstractFlyweight implements Flyweight {

    protected Long id;

    public AbstractFlyweight(Long id) {
        this.id = id;
        this.print();
    }

}
