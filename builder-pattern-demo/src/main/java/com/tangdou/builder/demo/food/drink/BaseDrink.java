package com.tangdou.builder.demo.food.drink;

import com.tangdou.builder.demo.accessory.Accessory;
import com.tangdou.builder.demo.food.Food;
import com.tangdou.builder.demo.packing.Packing;
import com.tangdou.builder.demo.accessory.Straw;
import com.tangdou.builder.demo.packing.Dixie;

/**
 * 饮料基类
 * @author 崔航
 * @date 2021/1/31 14:45
 */
public abstract class BaseDrink implements Food {

    /**
     * 包装
     *
     * @return 包装
     */
    @Override
    public Packing packing() {
        return new Dixie();
    }

    /**
     * 附赠品
     *
     * @return 附赠品
     */
    @Override
    public Accessory accessory() {
        return new Straw(1);
    }
}
