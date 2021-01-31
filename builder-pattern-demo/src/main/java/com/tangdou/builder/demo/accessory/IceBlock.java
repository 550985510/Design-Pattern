package com.tangdou.builder.demo.accessory;

/**
 * 冰块
 * @author 崔航
 * @date 2021/1/31 15:07
 */
public class IceBlock extends BaseAccessory {

    public IceBlock(Integer number) {
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
        return "冰块";
    }
}
