package com.tangdou.composite;

import com.tangdou.composite.filter.Filter;
import com.tangdou.composite.filter.FilterFactory;
import com.tangdou.composite.node.BaseNode;
import com.tangdou.composite.node.RuleNode;
import com.tangdou.composite.node.result.ResultNode;
import com.tangdou.composite.user.User;
import org.springframework.util.ObjectUtils;


/**
 * 规则引擎
 * @author 崔航
 * @date 2021/2/2 19:22
 */
public class RuleEngine {

    public static ResultNode process(Long rootId, User user) {
        RuleNode ruleNode = Database.findRuleById(rootId);
        if (ObjectUtils.isEmpty(ruleNode)) {
            return null;
        }
        Filter rootFilter = FilterFactory.produce(ruleNode.getFilterType());
        BaseNode baseNode = rootFilter.filter(ruleNode.getId(), user);
        while (baseNode instanceof RuleNode) {
            if (ObjectUtils.isEmpty(baseNode)) {
                return null;
            }
            Filter filter = FilterFactory.produce(((RuleNode) baseNode).getFilterType());
            baseNode = filter.filter(baseNode.getId(), user);
        }
        return (ResultNode) baseNode;
    }
}
