package com.tangdou.iterator;

/**
 * 迭代器
 * @author 崔航
 * @date 2021/2/5 19:35
 */
public interface Iterator<T> {

    /**
     * 是否有下一个结点
     * @return 是否
     */
    boolean hasNext();

    /**
     * 获取下一个结点
     * @return 结点
     */
    T next();
}
