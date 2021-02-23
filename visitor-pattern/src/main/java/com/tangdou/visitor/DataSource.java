package com.tangdou.visitor;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * 数据源连接
 * @author 崔航
 * @date 2021/2/19 17:11
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class DataSource extends BaseObject {

    private List<Database> children;

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
