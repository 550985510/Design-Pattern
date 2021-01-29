package com.tangdou.demo.builder;

/**
 * 饼干建造者
 * @author 崔航
 * @date 2021/1/29 17:39
 */
public interface CookiesBuilder {

    /**
     * 形状
     */
    CookiesBuilder shape();

    /**
     * 颜色
     */
    CookiesBuilder color();

    /**
     * 建造
     * @param number 个数
     * @return 饼干
     */
    Cookies build(Integer number);
}
