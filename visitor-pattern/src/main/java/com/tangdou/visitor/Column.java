package com.tangdou.visitor;

/**
 * @author 崔航
 * @date 2021/2/19 17:17
 */
public class Column extends BaseObject {

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
