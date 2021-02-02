package com.tangdou.composite.filter;

import com.tangdou.composite.node.BaseNode;
import com.tangdou.composite.user.User;

/**
 * @author 崔航
 * @date 2021/2/2 19:12
 */
public interface Filter {

    /**
     * 决策
     * @param nodeId 规则结点id
     * @param user 用户信息
     * @return 下一节点
     */
    BaseNode filter(Long nodeId, User user);
}
