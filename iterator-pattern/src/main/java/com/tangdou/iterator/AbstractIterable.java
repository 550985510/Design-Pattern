package com.tangdou.iterator;

import com.tangdou.iterator.iterator.Iterator;

/**
 * @author 崔航
 * @date 2021/2/7 9:17
 */
public abstract class AbstractIterable<T, E extends Iterator<T>> {

    protected E iterator;

    public AbstractIterable(E iterator) {
        this.iterator = iterator;
    }

    public E iterator() {
        return iterator;
    }
}
