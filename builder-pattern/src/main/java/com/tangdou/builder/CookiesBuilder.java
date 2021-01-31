package com.tangdou.builder;

/**
 * 饼干建造者
 * @author 崔航
 * @date 2021/1/29 17:39
 */
public interface CookiesBuilder {

    /**
     * 形状
     * @return 饼干建造者
     */
    CookiesBuilder shape();

    /**
     * 颜色
     * @return 饼干建造者
     */
    CookiesBuilder color();

    /**
     * 建造
     * @param number 数量
     * @return 饼干
     */
    Cookies build(Integer number);
}
