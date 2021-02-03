package com.tangdou.flyweight;

/**
 * @author 崔航
 * @date 2021/2/3 16:24
 */
public class DataFlyweight extends AbstractFlyweight {

    public DataFlyweight(Long id) {
        super(id);
    }

    /**
     * 输出
     */
    @Override
    public void print() {
        System.out.println("数据享生产成功");
    }
}
