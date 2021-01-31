package com.tangdou.builder;

import com.tangdou.factory.color.product.Red;
import com.tangdou.factory.shape.product.Square;

/**
 * 红色圆形饼干建造者
 * @author 崔航
 * @date 2021/1/29 17:59
 */
public class RedSquareCookiesBuilder extends AbstractCookiesBuilder{

    @Override
    public RedSquareCookiesBuilder shape() {
        this.shape = new Square();
        return this;
    }

    @Override
    public RedSquareCookiesBuilder color() {
        this.color = new Red();
        return this;
    }

    @Override
    public Cookies build(Integer number) {
        Cookies cookies = new Cookies(number);
        cookies.setColor(this.color);
        cookies.setShape(this.shape);
        return cookies;
    }
}
