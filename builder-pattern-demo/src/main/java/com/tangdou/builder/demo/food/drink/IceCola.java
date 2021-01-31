package com.tangdou.builder.demo.food.drink;

import com.tangdou.builder.demo.enums.SizeType;

/**
 * 冰可乐
 * @author 崔航
 * @date 2021/1/31 15:13
 */
public class IceCola extends BaseColdDrink {

    private final SizeType sizeType;

    public IceCola(SizeType sizeType) {
        this.sizeType = sizeType;
    }

    /**
     * 名称
     *
     * @return 名称
     */
    @Override
    public String name() {
        return "冰可乐(" + sizeType.getValue() + "杯)";
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
                return 8.0;
            case MEDIUM:
                return 10.0;
            case LARGE:
                return 12.0;
            default:
                throw new IllegalStateException("Unexpected value: " + sizeType);
        }
    }
}
