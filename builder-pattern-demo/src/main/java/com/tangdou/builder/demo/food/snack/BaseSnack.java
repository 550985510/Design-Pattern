package com.tangdou.builder.demo.food.snack;

import com.tangdou.builder.demo.food.Food;
import com.tangdou.builder.demo.packing.Packing;
import com.tangdou.builder.demo.packing.Carton;

/**
 * 小吃基类
 * @author 崔航
 * @date 2021/1/31 14:46
 */
public abstract class BaseSnack implements Food {

    /**
     * 包装
     *
     * @return 包装
     */
    @Override
    public Packing packing() {
        return new Carton();
    }
}
