package com.tangdou.visitor;

import lombok.Data;

/**
 * @author 崔航
 * @date 2021/2/19 17:06
 */
@Data
public abstract class BaseObject {

    protected Integer id;

    protected String name;

    /**
     * 接受访问
     * @param visitor 访问者
     * @return 返回值
     */
    abstract <T> T accept(Visitor<T> visitor);
}
