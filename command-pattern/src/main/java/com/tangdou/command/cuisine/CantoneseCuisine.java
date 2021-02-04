package com.tangdou.command.cuisine;

import com.tangdou.command.cook.CantoneseCook;

/**
 * @author 崔航
 * @date 2021/2/4 20:05
 */
public class CantoneseCuisine extends AbstractOrderCommand<CantoneseCook> {

    /**
     * 分配厨师
     *
     * @return 厨师
     */
    @Override
    public CantoneseCook assignment() {
        return new CantoneseCook();
    }
}
