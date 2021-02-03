package com.tangdou.facade;

/**
 * @author 崔航
 * @date 2021/2/3 14:45
 */
public class TaoBao implements Shopping {

    /**
     * 购买
     */
    @Override
    public void buy() {
        System.out.println("已在淘宝下单");
    }
}
