package com.tangdou.builder.demo.food.snack;

import com.tangdou.builder.demo.accessory.Accessory;
import com.tangdou.builder.demo.enums.SizeType;
import com.tangdou.builder.demo.accessory.Ketchup;

/**
 * 薯条
 * @author 崔航
 * @date 2021/1/31 15:23
 */
public class FrenchFries extends BaseSnack {

    private final SizeType sizeType;

    public FrenchFries(SizeType sizeType) {
        this.sizeType = sizeType;
    }

    /**
     * 名称
     *
     * @return 名称
     */
    @Override
    public String name() {
        return "薯条(" + sizeType.getValue() + "薯)";
    }

    /**
     * 价格
     *
     * @return 价格
     */
    @Override
    public Double price() {
        switch (sizeType) {
            case SMALL:
                return 11.5;
            case MEDIUM:
                return 13.0;
            case LARGE:
                return 14.5;
            default:
                throw new IllegalStateException("Unexpected value: " + sizeType);
        }
    }

    /**
     * 附赠品
     *
     * @return 附赠品
     */
    @Override
    public Accessory accessory() {
        return new Ketchup(2);
    }
}
