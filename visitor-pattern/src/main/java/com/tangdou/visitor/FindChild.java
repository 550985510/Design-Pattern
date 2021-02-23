package com.tangdou.visitor;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.util.ObjectUtils;

/**
 * 查找子节点访问者
 * @author 崔航
 * @date 2021/2/19 17:36
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class FindChild implements Visitor<BaseObject> {

    private Integer id;

    public FindChild(Integer id) {
        this.id = id;
    }

    /**
     * 访问数据源对象
     *
     * @param dataSource 数据源
     * @return 返回值
     */
    @Override
    public BaseObject visit(DataSource dataSource) {
        if (id.equals(dataSource.id)) {
            return dataSource;
        }
        for (Database child : dataSource.getChildren()) {
            if (id.equals(child.id)) {
                return child;
            }
            BaseObject accept = child.accept(this);
            if (!ObjectUtils.isEmpty(accept)) {
                return accept;
            }
        }
        return null;
    }

    /**
     * 访问数据库对象
     *
     * @param database 数据库
     * @return 返回值
     */
    @Override
    public BaseObject visit(Database database) {
        if (id.equals(database.id)) {
            return database;
        }
        for (Table child : database.getChildren()) {
            if (id.equals(child.id)) {
                return child;
            }
            BaseObject accept = child.accept(this);
            if (!ObjectUtils.isEmpty(accept)) {
                return accept;
            }
        }
        return null;
    }

    /**
     * 访问数据表对象
     *
     * @param table 数据表
     * @return 返回值
     */
    @Override
    public BaseObject visit(Table table) {
        if (id.equals(table.id)) {
            return table;
        }
        for (Column child : table.getChildren()) {
            if (id.equals(child.id)) {
                return child;
            }
            BaseObject accept = child.accept(this);
            if (!ObjectUtils.isEmpty(accept)) {
                return accept;
            }
        }
        return null;
    }

    /**
     * 访问数据列对象
     *
     * @param column 数据列
     * @return 返回值
     */
    @Override
    public BaseObject visit(Column column) {
        if (id.equals(column.id)) {
            return column;
        }
        return null;
    }
}
