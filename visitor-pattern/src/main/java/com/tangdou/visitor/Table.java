package com.tangdou.visitor;

import java.util.List;

/**
 * 表
 * @author 崔航
 * @date 2021/2/19 17:15
 */
public class Table extends BaseObject {

    private List<Column> children;

    /**
     * 接受访问
     *
     * @param visitor 访问者
     */
    @Override
    void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
