package com.tangdou.builder.demo.packing;

/**
 * 纸盒
 * @author 崔航
 * @date 2021/1/31 14:38
 */
public class Carton implements Packing {

    /**
     * 包装
     *
     * @return 包装
     */
    @Override
    public String name() {
        return "纸盒";
    }
}
