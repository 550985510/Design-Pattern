package com.tangdou.iterator.iterator;

import com.tangdou.iterator.model.Node;

/**
 * @author 崔航
 * @date 2021/2/7 10:05
 */
public class BreadthFirstIterator extends Iterator<Node> {


    /**
     * 初始化
     *
     * @param node 节点
     * @return 迭代器
     */
    @Override
    public void init(Node node) {

    }

    /**
     * 是否存在下一个元素
     *
     * @return 是否
     */
    @Override
    public boolean hasNext() {
        return false;
    }

    /**
     * 下一个元素
     *
     * @return 下一个元素
     */
    @Override
    public Node next() {
        return null;
    }
}
