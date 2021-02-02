package com.tangdou.composite;

import com.tangdou.composite.filter.FilterType;
import com.tangdou.composite.user.UserAttribute;

/**
 * 规则节点
 * 规则结点和结点连接共同构成树结构
 * 可以同时维护多个树结构
 * @author 崔航
 * @date 2021/2/2 15:56
 */
public class RuleNode {

    private Long id;

    private boolean root;

    /**
     * 结果产物
     * 每个规则树可能对应不同的结果产物
     * 如果需要区分则增加规则树id概念
     * 或把结果产物单独拆分出来
     */
    private String result;

    /**
     * 规则对应枚举
     */
    private UserAttribute userAttribute;

    /**
     * 过滤类型
     * 需要根据过滤类型枚举拿到对应的类
     * 从而执行过滤方法
     */
    private FilterType filterType;
}
