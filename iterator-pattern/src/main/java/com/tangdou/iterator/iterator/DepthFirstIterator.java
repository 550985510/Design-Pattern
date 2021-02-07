package com.tangdou.iterator.iterator;

import com.tangdou.iterator.model.Node;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;

import java.util.Stack;

/**
 * 深度优先遍历
 * @author 崔航
 * @date 2021/2/7 10:03
 */
public class DepthFirstIterator extends Iterator<Node> {

    private final Stack<Node> stack = new Stack<>();

    public DepthFirstIterator(Node root) {
        super(root);
        stack.push(root);
    }

    /**
     * 是否存在下一个元素
     *
     * @return 是否
     */
    @Override
    public boolean hasNext() {
        return !stack.empty();
    }

    /**
     * 下一个元素
     *
     * @return 下一个元素
     */
    @Override
    public Node next() {
        Node pop = stack.pop();
        if (!ObjectUtils.isEmpty(pop) && !CollectionUtils.isEmpty(pop.getChildren())) {
            pop.getChildren().forEach(stack::push);
        }
        return pop;
    }
}
