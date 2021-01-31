package com.tangdou.builder.demo.food.snack;

import com.tangdou.builder.demo.accessory.Accessory;

/**
 * 蛋挞
 * @author 崔航
 * @date 2021/1/31 15:29
 */
public class EggTart extends BaseSnack {

    /**
     * 名称
     *
     * @return 名称
     */
    @Override
    public String name() {
        return "蛋挞";
    }

    /**
     * 价格
     *
     * @return 价格
     */
    @Override
    public Double price() {
        return 6.5;
    }

    /**
     * 附赠品
     *
     * @return 附赠品
     */
    @Override
    public Accessory accessory() {
        return null;
    }
}
