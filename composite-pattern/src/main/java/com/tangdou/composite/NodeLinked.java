package com.tangdou.composite;

import com.tangdou.composite.user.UserAttribute;
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
     * 链接类型（end结点类型）
     * 结果产物/规则结点
     */
    private LinkedType linkedType;
}
