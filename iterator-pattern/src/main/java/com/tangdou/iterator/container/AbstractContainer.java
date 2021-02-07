package com.tangdou.iterator.container;

import com.tangdou.iterator.AbstractIterable;
import com.tangdou.iterator.iterator.Iterator;

/**
 * 容器
 *
 * @author 崔航
 * @date 2021/2/7 9:20
 */
public abstract class AbstractContainer<T, E extends Iterator<T>> extends AbstractIterable<T, E> {

    public AbstractContainer(E iterator) {
        super(iterator);
    }

    /**
     * 添加元素
     * @param element 元素
     */
    public abstract void add(T element);

    /**
     * 向指定元素添加子元素
     * @param element 子元素
     * @param to 指定元素
     */
    public abstract void addTo(T element, T to);

    /**
     * 删除元素
     * @param element 元素
     */
    public abstract void remove(T element);

    /**
     * 从指定元素中移除子元素
     * @param element 子元素
     * @param from 指定元素
     */
    public abstract void removeFrom(T element, T from);
}
