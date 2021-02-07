package com.tangdou.iterator.container;

import com.tangdou.iterator.iterator.Iterator;
import com.tangdou.iterator.model.Node;

/**
 * @author 崔航
 * @date 2021/2/7 9:27
 */
public class Tree<T extends Node, E extends Iterator<T>> extends AbstractContainer<T, E> {

    private final T root;

    public Tree(E iterator, T root) {
        super(iterator);
        this.root = root;
    }

    /**
     * 添加元素
     *
     * @param element 元素
     */
    @Override
    public void add(T element) {
        root.getChildren().add(element);
    }

    /**
     * 向指定元素添加子元素
     *
     * @param element 子元素
     * @param to      指定元素
     */
    @Override
    public void addTo(T element, T to) {
        to.getChildren().add(element);
    }

    /**
     * 删除元素
     *
     * @param element 元素
     */
    @Override
    public void remove(T element) {
        root.getChildren().remove(element);
    }

    /**
     * 从指定元素中移除子元素
     *
     * @param element 子元素
     * @param from    指定元素
     */
    @Override
    public void removeFrom(T element, T from) {
        from.getChildren().remove(element);
    }
}
