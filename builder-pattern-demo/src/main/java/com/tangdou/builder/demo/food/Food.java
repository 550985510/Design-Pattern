package com.tangdou.builder.demo.food;

import com.tangdou.builder.demo.packing.Packing;
import com.tangdou.builder.demo.accessory.Accessory;

/**
 * 食物接口
 * @author 崔航
 * @date 2021/1/31 14:21
 */
public interface Food {

    /**
     * 名称
     * @return 名称
     */
    String name();

    /**
     * 价格
     * @return 价格
     */
    Double price();

    /**
     * 包装
     * @return 包装
     */
    Packing packing();

    /**
     * 附赠品
     * @return 附赠品
     */
    Accessory accessory();
}
