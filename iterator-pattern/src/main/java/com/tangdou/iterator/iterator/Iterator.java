package com.tangdou.iterator.iterator;

/**
 * @author 崔航
 * @date 2021/2/7 9:13
 */
public abstract class Iterator<T> {

    /**
     * 初始化
     * @param node 节点
     */
    public abstract void init(T node);

    /**
     * 是否存在下一个元素
     * @return 是否
     */
    public abstract boolean hasNext();

    /**
     * 下一个元素
     * @return 下一个元素
     */
    public abstract T next();
}
