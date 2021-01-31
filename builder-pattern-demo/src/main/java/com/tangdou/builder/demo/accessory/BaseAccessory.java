package com.tangdou.builder.demo.accessory;

/**
 * 附赠品基类
 * @author 崔航
 * @date 2021/1/31 15:10
 */
public abstract class BaseAccessory implements Accessory {

    protected Integer number;

    public BaseAccessory(Integer number) {
        this.number = number;
    }

    /**
     * 个数
     *
     * @return 个数
     */
    @Override
    public Integer number() {
        return number;
    }
}
