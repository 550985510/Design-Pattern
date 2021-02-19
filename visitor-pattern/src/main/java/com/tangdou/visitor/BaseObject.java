package com.tangdou.visitor;

/**
 * @author 崔航
 * @date 2021/2/19 17:06
 */
public abstract class BaseObject {

    protected Integer id;

    protected String name;

    /**
     * 接受访问
     * @param visitor 访问者
     */
    abstract void accept(Visitor visitor);
}
