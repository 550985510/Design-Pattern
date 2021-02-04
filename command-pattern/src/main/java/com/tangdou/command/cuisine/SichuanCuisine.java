package com.tangdou.command.cuisine;

import com.tangdou.command.cook.SichuanCook;

/**
 * @author 崔航
 * @date 2021/2/4 20:01
 */
public class SichuanCuisine extends AbstractOrderCommand<SichuanCook> {

    /**
     * 分配厨师
     *
     * @return 厨师
     */
    @Override
    public SichuanCook assignment() {
        return new SichuanCook();
    }
}
