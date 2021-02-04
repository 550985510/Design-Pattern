package com.tangdou.proxy.impl;

import com.tangdou.proxy.Executor;
import lombok.Getter;

/**
 * 真实执行者
 * @author 崔航
 * @date 2021/2/4 11:42
 */
public class RealExecutor implements Executor {

    @Getter
    private final String name;

    /**
     * 构造方法不对外开放
     * @param name 名称
     */
    protected RealExecutor(String name) {
        this.name = name;
    }

    /**
     * 干点啥
     */
    @Override
    public void doSomething() {
        System.out.println(name + "干了点啥");
    }
}
