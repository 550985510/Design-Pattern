package com.tangdou.visitor;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * 数据库
 * @author 崔航
 * @date 2021/2/19 17:14
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Database extends BaseObject {

    private List<Table> children;

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
