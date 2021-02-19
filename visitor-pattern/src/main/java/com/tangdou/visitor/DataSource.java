package com.tangdou.visitor;

import java.util.List;

/**
 * 数据源连接
 * @author 崔航
 * @date 2021/2/19 17:11
 */
public class DataSource extends BaseObject {

    private List<Database> children;

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
