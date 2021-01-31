package com.tangdou.builder.demo.packing;

/**
 * 包装纸
 * @author 崔航
 * @date 2021/1/31 14:37
 */
public class Wrapper implements Packing {

    /**
     * 包装
     *
     * @return 包装
     */
    @Override
    public String name() {
        return "包装纸";
    }
}
