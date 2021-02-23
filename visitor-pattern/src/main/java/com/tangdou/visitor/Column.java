package com.tangdou.visitor;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author 崔航
 * @date 2021/2/19 17:17
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Column extends BaseObject {


    /**
     * 接受访问
     *
     * @param visitor 访问者
     */
    @Override
    <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
