package com.tangdou.proxy.impl;

import com.tangdou.proxy.Executor;

/**
 * 代理执行者
 * @author 崔航
 * @date 2021/2/4 11:45
 */
public class ProxyExecutor implements Executor {

    private final RealExecutor realExecutor = new RealExecutor("爸爸");

    /**
     * 干点啥
     */
    @Override
    public void doSomething() {
        System.out.println(realExecutor.getName() + "先刷了个牙");
        realExecutor.doSomething();
        System.out.println(realExecutor.getName() + "最后又睡了");
    }
}
