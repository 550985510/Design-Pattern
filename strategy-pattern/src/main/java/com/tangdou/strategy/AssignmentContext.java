package com.tangdou.strategy;

/**
 * 策略模式
 * 定义策略及封装算法，调用者决定使用哪种策略
 * 较工厂模式的不同在于，策略模式需要客户端清楚所需策略，并在客户端进行实例化
 * 而工厂模式则是在服务端做实例化
 * @author 木叶丸
 * @date 2018/12/3 21:01
 */
class AssignmentContext {

    private AssignmentStrategy strategy;

    AssignmentContext(AssignmentStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 执行所选分配策略的分配算法
     */
    void executeAssign(){
        strategy.assign();
    }
}
