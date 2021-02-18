package com.tangdou.template;

/**
 * @author 崔航
 * @date 2021/2/18 15:13
 */
public abstract class Template {

    /**
     * 先做什么
     */
    abstract void before();

    /**
     * 运行
     */
    abstract void run();

    /**
     * 后做什么
     */
    abstract void after();

    public void doSomething() {
        before();
        run();
        after();
    }
}
