package com.tangdou.composite.filter;

import com.tangdou.composite.Database;
import com.tangdou.composite.node.BaseNode;
import com.tangdou.composite.node.NodeLinked;
import com.tangdou.composite.user.User;
import com.tangdou.composite.user.attribute.AttributeEnum;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;

import java.util.List;

/**
 * 决策器基类 模板模式
 * @author 崔航
 * @date 2021/2/2 20:31
 */
public abstract class AbstractFilter implements Filter {

    /**
     * 获取属性
     * @param user 用户信息
     * @return 属性
     */
    abstract AttributeEnum getAttribute(User user);

    /**
     * 决策
     *
     * @param nodeId 规则结点id
     * @param user   用户信息
     * @return 下一节点
     */
    @Override
    public BaseNode filter(Long nodeId, User user) {
        List<NodeLinked> nodeLinkedList = Database.findByStartId(nodeId);
        if (CollectionUtils.isEmpty(nodeLinkedList)) {
            return null;
        }
        AttributeEnum attribute = this.getAttribute(user);
        NodeLinked nodeLinked = nodeLinkedList.stream().filter(n -> attribute.equals(n.getAttributeEnum())).findAny().orElse(null);
        if (ObjectUtils.isEmpty(nodeLinked)) {
            return null;
        }
        if (nodeLinked.isLinkedResult()) {
            return Database.findResultById(nodeLinked.getEndId());
        }
        return Database.findRuleById(nodeLinked.getEndId());
    }
}
