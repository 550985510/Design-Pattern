package com.tangdou.template;

/**
 * @author 崔航
 * @date 2021/2/18 15:21
 */
public class Shower extends Template {

    /**
     * 先做什么
     */
    @Override
    void before() {
        System.out.println("脱光");
    }

    /**
     * 运行
     */
    @Override
    void run() {
        System.out.println("洗澡");
    }

    /**
     * 后做什么
     */
    @Override
    void after() {
        System.out.println("擦干");
    }
}
