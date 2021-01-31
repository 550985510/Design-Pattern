package com.tangdou.builder.demo.food.burger;

/**
 * 深海鳕鱼堡
 * @author 崔航
 * @date 2021/1/31 15:02
 */
public class CodFishBurger extends BaseBurger {
    /**
     * 名称
     *
     * @return 名称
     */
    @Override
    public String name() {
        return "深海鳕鱼堡";
    }

    /**
     * 价格
     *
     * @return 价格
     */
    @Override
    public Double price() {
        return 21.5;
    }
}
