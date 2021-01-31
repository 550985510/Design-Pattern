package com.tangdou.builder.demo.accessory;

/**
 * 环保纸吸管
 * @author 崔航
 * @date 2021/1/31 14:48
 */
public class Straw extends BaseAccessory {

    public Straw(Integer number) {
        super(number);
    }

    /**
     * 单位
     *
     * @return 单位
     */
    @Override
    public String unit() {
        return "个";
    }

    /**
     * 名称
     *
     * @return 名称
     */
    @Override
    public String name() {
        return "纸吸管";
    }
}
