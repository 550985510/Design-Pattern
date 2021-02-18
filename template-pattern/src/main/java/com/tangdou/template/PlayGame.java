package com.tangdou.template;

/**
 * @author 崔航
 * @date 2021/2/18 15:18
 */
public class PlayGame extends Template {

    /**
     * 先做什么
     */
    @Override
    void before() {
        System.out.println("先下载游戏");
    }

    /**
     * 运行
     */
    @Override
    void run() {
        System.out.println("打开游戏玩");
    }

    /**
     * 后做什么
     */
    @Override
    void after() {
        System.out.println("保存并退出");
    }
}
