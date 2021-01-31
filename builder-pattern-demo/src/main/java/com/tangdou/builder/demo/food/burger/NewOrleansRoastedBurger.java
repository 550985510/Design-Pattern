package com.tangdou.builder.demo.food.burger;

/**
 * 新奥尔良烤鸡腿堡
 * @author 崔航
 * @date 2021/1/31 15:00
 */
public class NewOrleansRoastedBurger extends BaseBurger {
    /**
     * 名称
     *
     * @return 名称
     */
    @Override
    public String name() {
        return "新奥尔良烤鸡腿堡";
    }

    /**
     * 价格
     *
     * @return 价格
     */
    @Override
    public Double price() {
        return 20.5;
    }
}
