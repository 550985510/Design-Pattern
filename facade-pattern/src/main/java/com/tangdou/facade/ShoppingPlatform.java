package com.tangdou.facade;

/**
 * 外观模式 （封装）
 * 综合购物平台 集成所有其他平台
 * 将其他平台接口封装到一起 作为统一门户
 * @author 崔航
 * @date 2021/2/3 14:48
 */
public class ShoppingPlatform {

    private final Shopping taoBao = new TaoBao();
    private final Shopping jingDong = new JingDong();

    void buyFromTaoBao() {
        taoBao.buy();
    }

    void buyFromJingDong() {
        jingDong.buy();
    }
}
