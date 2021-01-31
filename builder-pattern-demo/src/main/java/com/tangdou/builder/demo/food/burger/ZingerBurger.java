package com.tangdou.builder.demo.food.burger;

/**
 * 香辣鸡腿堡
 * @author 崔航
 * @date 2021/1/31 14:51
 */
public class ZingerBurger extends BaseBurger {
    /**
     * 名称
     *
     * @return 名称
     */
    @Override
    public String name() {
        return "香辣鸡腿堡";
    }

    /**
     * 价格
     *
     * @return 价格
     */
    @Override
    public Double price() {
        return 19.5;
    }
}
