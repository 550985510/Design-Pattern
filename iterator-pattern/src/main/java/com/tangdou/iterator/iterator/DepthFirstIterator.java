package com.tangdou.iterator.iterator;

import com.tangdou.iterator.model.Node;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 深度优先遍历
 * @author 崔航
 * @date 2021/2/7 10:03
 */
public class DepthFirstIterator extends Iterator<Node> {

    private final List<Node> list = new ArrayList<>();

    private int i = -1;

    /**
     * 初始化
     *
     * @param node 节点
     */
    @Override
    public void init(Node node) {
        Stack<Node> stack = new Stack<>();
        stack.push(node);
        while (!stack.empty()) {
            Node pop = stack.pop();
            list.add(pop);
            if (CollectionUtils.isEmpty(pop.getChildren())) {
                continue;
            }
            pop.getChildren().forEach(stack::push);
        }
    }

    /**
     * 是否存在下一个元素
     *
     * @return 是否
     */
    @Override
    public boolean hasNext() {
        i = i + 1;
        return i < list.size();
    }

    /**
     * 下一个元素
     *
     * @return 下一个元素
     */
    @Override
    public Node next() {
        return list.get(i);
    }
}
