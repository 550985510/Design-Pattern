package com.tangdou.demo.builder;

import com.tangdou.demo.factory.color.product.Red;
import com.tangdou.demo.factory.shape.product.Square;

/**
 * 红色圆形饼干建造者
 * @author 崔航
 * @date 2021/1/29 17:59
 */
public class RedSquareCookiesBuilder implements CookiesBuilder{

    /**
     * 饼干
     */
    private final Cookies cookies;

    public RedSquareCookiesBuilder(Integer number) {
        this.cookies = new Cookies(number);
    }

    @Override
    public RedSquareCookiesBuilder shape() {
        cookies.setShape(new Square());
        return this;
    }

    @Override
    public RedSquareCookiesBuilder color() {
        cookies.setColor(new Red());
        return this;
    }

    @Override
    public Cookies build(Integer number) {
        return new Cookies(number);
    }
}
