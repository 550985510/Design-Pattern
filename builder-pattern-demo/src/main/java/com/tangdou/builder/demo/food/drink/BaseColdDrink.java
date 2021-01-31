package com.tangdou.builder.demo.food.drink;

import com.tangdou.builder.demo.accessory.Accessory;
import com.tangdou.builder.demo.accessory.IceBlock;

/**
 * 冷饮基类
 * @author 崔航
 * @date 2021/1/31 15:06
 */
public abstract class BaseColdDrink extends BaseDrink {

    /**
     * 附赠品
     *
     * @return 附赠品
     */
    @Override
    public Accessory accessory() {
        return new IceBlock(5);
    }
}
