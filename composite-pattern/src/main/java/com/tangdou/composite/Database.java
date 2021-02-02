package com.tangdou.composite;

import com.tangdou.composite.node.NodeLinked;
import com.tangdou.composite.node.RuleNode;
import com.tangdou.composite.node.result.ResultNode;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 模拟数据库
 * @author 崔航
 * @date 2021/2/2 18:57
 */
public class Database {

    private static final Map<Long, RuleNode> RULE_TABLE = new HashMap<>();

    private static final List<ResultNode> RESULT_TABLE = new ArrayList<>();

    private static final List<NodeLinked> NODE_LINKED_TABLE = new ArrayList<>();

    public static void insertRule(RuleNode ruleNode) {
        RULE_TABLE.put(ruleNode.getId(), ruleNode);
    }

    public static void insertResult(ResultNode resultNode) {
        RESULT_TABLE.add(resultNode);
    }

    public static void insertNodeLinked(NodeLinked nodeLinked) {
        NODE_LINKED_TABLE.add(nodeLinked);
    }

    public static RuleNode findRuleById(Long id) {
        if (CollectionUtils.isEmpty(RULE_TABLE)) {
            return null;
        }
        return RULE_TABLE.get(id);
    }

    public static ResultNode findResultById(Long id) {
        if (CollectionUtils.isEmpty(RESULT_TABLE)) {
            return null;
        }
        return RESULT_TABLE.stream().filter(n -> id.equals(n.getId())).findAny().orElse(null);
    }

    public static List<NodeLinked> findByStartId(Long startId) {
        if (CollectionUtils.isEmpty(NODE_LINKED_TABLE)) {
            return null;
        }
        return NODE_LINKED_TABLE.stream().filter(n -> startId.equals(n.getStartId())).collect(Collectors.toList());
    }
}
