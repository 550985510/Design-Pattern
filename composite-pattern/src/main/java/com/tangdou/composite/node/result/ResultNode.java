package com.tangdou.composite.node.result;

import com.tangdou.composite.node.BaseNode;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author 崔航
 * @date 2021/2/2 18:00
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ResultNode extends BaseNode {

    private String value;

    public ResultNode(Long id, String value) {
        this.id = id;
        this.value = value;
    }
}
