package com.tangdou.builder.demo.accessory;

/**
 * 番茄酱
 * @author 崔航
 * @date 2021/1/31 14:49
 */
public class Ketchup extends BaseAccessory {

    public Ketchup(Integer number) {
        super(number);
    }

    /**
     * 单位
     *
     * @return 单位
     */
    @Override
    public String unit() {
        return "包";
    }

    /**
     * 名称
     *
     * @return 名称
     */
    @Override
    public String name() {
        return "番茄酱";
    }
}
