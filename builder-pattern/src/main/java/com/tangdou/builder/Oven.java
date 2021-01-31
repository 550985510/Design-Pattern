package com.tangdou.builder;

/**
 * 烤箱
 * @author 崔航
 * @date 2021/1/29 18:06
 */
public class Oven {

    /**
     * 饼干建造者
     */
    private final CookiesBuilder cookiesBuilder;

    public Oven(CookiesBuilder cookiesBuilder) {
        this.cookiesBuilder = cookiesBuilder;
    }

    public Cookies baking(Integer number) {
        return cookiesBuilder
                .shape()
                .color()
                .build(number);
    }
}
