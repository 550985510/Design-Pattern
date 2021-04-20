package com.tangdou.iterator;

import com.tangdou.iterator.iterator.Iterator;

/**
 * 容器
 * @author 崔航
 * @date 2021/2/5 19:38
 */
public abstract class AbstractContainer<T, E extends Iterator<T>> extends AbstractIterable<T, E> {

    public AbstractContainer(E iterator) {
        super(iterator);
    }

    /**
     * 添加元素
     * @param e 元素
     */
    abstract void add(T e);

    /**
     * 将元素加到目标元素
     * @param e 元素
     * @param to 目标元素
     */
    abstract void addTo(T e, T to);

    /**
     * 移除元素
     * @param e 元素
     */
    abstract void remove(T e);

    /**
     * 从目标元素中移除元素
     * @param e 元素
     * @param from 目标元素
     */
    abstract void removeFrom(T e, T from);
}
