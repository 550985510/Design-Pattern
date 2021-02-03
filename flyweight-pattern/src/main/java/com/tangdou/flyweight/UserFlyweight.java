package com.tangdou.flyweight;

/**
 * @author 崔航
 * @date 2021/2/3 16:27
 */
public class UserFlyweight extends AbstractFlyweight {

    public UserFlyweight(Long id) {
        super(id);
    }

    /**
     * 输出
     */
    @Override
    public void print() {
        System.out.println("用户享生产成功");
    }
}
