package com.tangdou.iterator.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 崔航
 * @date 2021/2/7 9:26
 */
@Data
public class Node {

    /**
     * 值
     */
    private int value;

    /**
     * 子节点
     */
    private List<Node> children = new ArrayList<>();

    public Node(int value) {
        this.value = value;
    }
}
