package com.tangdou.iterator.iterator;

import com.tangdou.iterator.model.Node;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author 崔航
 * @date 2021/2/7 10:05
 */
public class BreadthFirstIterator extends Iterator<Node> {

    private final Queue<Node> queue = new LinkedList<>();

    public BreadthFirstIterator(Node root) {
        super(root);
        queue.offer(root);
    }


    /**
     * 是否存在下一个元素
     *
     * @return 是否
     */
    @Override
    public boolean hasNext() {
        return !queue.isEmpty();
    }

    /**
     * 下一个元素
     *
     * @return 下一个元素
     */
    @Override
    public Node next() {
        Node poll = queue.poll();
        if (!ObjectUtils.isEmpty(poll) && !CollectionUtils.isEmpty(poll.getChildren())) {
            poll.getChildren().forEach(queue::offer);
        }
        return poll;
    }
}
