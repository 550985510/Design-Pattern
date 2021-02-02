package com.tangdou.composite.node;

import com.tangdou.composite.filter.FilterType;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 规则节点
 * 规则结点和结点连接共同构成树结构
 * 可以同时维护多个树结构
 * @author 崔航
 * @date 2021/2/2 15:56
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class RuleNode extends BaseNode{

    /**
     * 过滤类型
     * 需要根据过滤类型枚举拿到对应的类
     * 从而执行过滤方法
     */
    private FilterType filterType;

    public RuleNode(Long id, FilterType filterType) {
        this.id = id;
        this.filterType = filterType;
    }
}
