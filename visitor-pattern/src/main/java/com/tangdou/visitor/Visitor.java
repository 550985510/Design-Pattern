package com.tangdou.visitor;

/**
 * @author 崔航
 * @date 2021/2/19 17:06
 */
public interface Visitor<T> {

    /**
     * 访问数据源对象
     * @param dataSource 数据源
     * @return 返回值
     */
    T visit(DataSource dataSource);

    /**
     * 访问数据库对象
     * @param database 数据库
     * @return 返回值
     */
    T visit(Database database);

    /**
     * 访问数据表对象
     * @param table 数据表
     * @return 返回值
     */
    T visit(Table table);

    /**
     * 访问数据列对象
     * @param column 数据列
     * @return 返回值
     */
    T visit(Column column);
}
