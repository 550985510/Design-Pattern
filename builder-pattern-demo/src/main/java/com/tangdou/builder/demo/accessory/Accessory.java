package com.tangdou.builder.demo.accessory;

/**
 * 附属品 附赠品
 * @author 崔航
 * @date 2021/1/31 14:35
 */
public interface Accessory {

    /**
     * 个数
     * @return 个数
     */
    Integer number();

    /**
     * 单位
     * @return 单位
     */
    String unit();

    /**
     * 名称
     * @return 名称
     */
    String name();
}
