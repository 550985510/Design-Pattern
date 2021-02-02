package com.tangdou.composite.node;

import com.tangdou.composite.user.attribute.AttributeEnum;
import lombok.Data;

/**
 * 规则结点链接
 * @author 崔航
 * @date 2021/2/2 17:30
 */
@Data
public class NodeLinked {

    /**
     * 结点起始id（树中的父id）
     */
    private Long startId;

    /**
     * 结点结束id（树中的子id）
     */
    private Long endId;

    /**
     * 是否链接结果结点
     */
    private boolean linkedResult;

    /**
     * 规则对应枚举
     */
    private AttributeEnum attributeEnum;

    public NodeLinked(Long startId, Long endId, boolean linkedResult, AttributeEnum attributeEnum) {
        this.startId = startId;
        this.endId = endId;
        this.linkedResult = linkedResult;
        this.attributeEnum = attributeEnum;
    }
}
