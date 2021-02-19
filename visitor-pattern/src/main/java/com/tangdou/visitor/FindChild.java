package com.tangdou.visitor;

/**
 * 查找子节点访问者
 * @author 崔航
 * @date 2021/2/19 17:36
 */
public class FindChild implements Visitor {

    /**
     * 访问数据源对象
     *
     * @param dataSource 数据源
     * @return 返回值
     */
    @Override
    public Object visit(DataSource dataSource) {
        return null;
    }

    /**
     * 访问数据库对象
     *
     * @param database 数据库
     * @return 返回值
     */
    @Override
    public Object visit(Database database) {
        return null;
    }

    /**
     * 访问数据表对象
     *
     * @param table 数据表
     * @return 返回值
     */
    @Override
    public Object visit(Table table) {
        return null;
    }

    /**
     * 访问数据列对象
     *
     * @param column 数据列
     * @return 返回值
     */
    @Override
    public Object visit(Column column) {
        return null;
    }
}
