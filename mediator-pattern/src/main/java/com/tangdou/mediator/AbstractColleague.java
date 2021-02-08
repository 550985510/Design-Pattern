package com.tangdou.mediator;

/**
 * 抽象同事类
 * @author 崔航
 * @date 2021/2/8 11:14
 */
public abstract class AbstractColleague {

    /**
     * 联系某人
     * @param name 姓名
     * @return 详细信息
     */
    public Colleague call(String name) {
        return DingTalk.call(name);
    }
}
