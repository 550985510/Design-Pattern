package com.tangdou.factory;

/**
 * 工厂接口
 * @author 崔航
 * @date 2021/1/28 17:47
 */
public interface Factory<P, E> {

    /**
     * 打印工厂信息
     */
    void print();

    /**
     * 生产
     * @param e 产品类型枚举
     * @return 产品
     */
    P produce(E e);
}
