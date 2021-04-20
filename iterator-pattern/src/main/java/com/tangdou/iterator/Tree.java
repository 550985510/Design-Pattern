package com.tangdou.iterator;

import com.tangdou.iterator.iterator.Iterator;

/**
 * @author 崔航
 * @date 2021/2/5 19:49
 */
public class Tree<Node, E extends Iterator<Node>> extends AbstractContainer<Node, E> {

    public Tree(E iterator) {
        super(iterator);
    }

    /**
     * 添加元素
     *
     * @param e 元素
     */
    @Override
    public void add(Node e) {

    }

    /**
     * 将元素加到另一个元素里
     *
     * @param e  元素
     * @param to 目标元素
     */
    @Override
    public void addTo(Node e, Node to) {

    }

    /**
     * 移除元素
     *
     * @param e 元素
     */
    @Override
    public void remove(Node e) {

    }

    /**
     * 从目标元素中移除元素
     *
     * @param e    元素
     * @param from 目标元素
     */
    @Override
    public void removeFrom(Node e, Node from) {

    }

}
