package com.tangdou.iterator;

import com.tangdou.ApplicationStarter;
import com.tangdou.iterator.container.Tree;
import com.tangdou.iterator.iterator.BreadthFirstIterator;
import com.tangdou.iterator.iterator.DepthFirstIterator;
import com.tangdou.iterator.model.Node;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author 崔航
 * @date 2021/2/7 10:46
 */
@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ApplicationStarter.class)
public class IteratorTest {

    /**
     * 树结构如下：
     *               1
     *             / | \
     *            2  3  4
     *          / \  |   \
     *         5  6  7   8
     */

    @Test
    public void test() {
        Node root = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        Node node8 = new Node(8);
        //深度优先
        System.out.println("深度优先");
        Tree<Node, DepthFirstIterator> depthFirstIteratorTree = new Tree<>(new DepthFirstIterator(root), root);
        depthFirstIteratorTree.add(node2);
        depthFirstIteratorTree.add(node3);
        depthFirstIteratorTree.add(node4);

        depthFirstIteratorTree.addTo(node5, node2);
        depthFirstIteratorTree.addTo(node6, node2);

        depthFirstIteratorTree.addTo(node7, node3);

        depthFirstIteratorTree.addTo(node8, node4);
        DepthFirstIterator depthFirstIterator = depthFirstIteratorTree.iterator();

        while(depthFirstIterator.hasNext()){
            System.out.println(depthFirstIterator.next().getValue());
        }
        //广度优先
        System.out.println("广度优先");
        Tree<Node, BreadthFirstIterator> breadthFirstIteratorTree = new Tree<>(new BreadthFirstIterator(root), root);
        BreadthFirstIterator breadthFirstIterator = breadthFirstIteratorTree.iterator();

        while(breadthFirstIterator.hasNext()){
            System.out.println(breadthFirstIterator.next().getValue());
        }
    }

    @Test
    public void testRemove() {
        Node root = new Node(1);
        Node node2 = new Node(2);
        Tree<Node, DepthFirstIterator> depthFirstIteratorTree = new Tree<>(new DepthFirstIterator(root), root);
        depthFirstIteratorTree.addTo(root, node2);
        depthFirstIteratorTree.removeFrom(node2, root);
        depthFirstIteratorTree.remove(root);
    }
}
