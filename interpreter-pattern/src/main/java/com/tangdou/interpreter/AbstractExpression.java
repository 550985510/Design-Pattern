package com.tangdou.interpreter;

/**
 * 解释器
 * @author 崔航
 * @date 2021/2/7 16:22
 */
public abstract class AbstractExpression<T> {

    /**
     * 解释
     * @param context 内容
     * @return 结果
     */
    public abstract T interpreter(String context);
}
