package com.tangdou.builder.demo.food.burger;

import com.tangdou.builder.demo.accessory.Accessory;
import com.tangdou.builder.demo.food.Food;
import com.tangdou.builder.demo.packing.Packing;
import com.tangdou.builder.demo.packing.Wrapper;

/**
 * 汉堡基类
 * @author 崔航
 * @date 2021/1/31 14:43
 */
public abstract class BaseBurger implements Food {

    /**
     * 包装
     *
     * @return 包装
     */
    @Override
    public Packing packing() {
        return new Wrapper();
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
