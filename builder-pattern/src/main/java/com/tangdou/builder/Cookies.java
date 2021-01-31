package com.tangdou.builder;

import com.tangdou.factory.color.Color;
import com.tangdou.factory.shape.Shape;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * 饼干
 * @author 崔航
 * @date 2021/1/29 17:30
 */
@Data
@AllArgsConstructor
@Builder(builderMethodName ="hiddenBuilder")
public class Cookies {

    /**
     * 形状
     */
    private Shape shape;

    /**
     * 形状
     */
    private Color color;

    /**
     * 个数
     */
    private Integer number;

    public Cookies(Integer number) {
        this.number = number;
    }

    /**
     * 指定必填字段
     * @param number 个数
     * @return 饼干对象
     */
    public static CookiesBuilder builder(Integer number) {
        return hiddenBuilder().number(number);
    }
}
