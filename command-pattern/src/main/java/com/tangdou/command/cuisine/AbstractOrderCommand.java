package com.tangdou.command.cuisine;

import com.tangdou.command.cook.AbstractCook;
import org.springframework.util.ObjectUtils;

/**
 * 点菜命令
 * 持有接收人对象 厨子
 * @author 崔航
 * @date 2021/2/4 19:23
 */
public abstract class AbstractOrderCommand<T extends AbstractCook> {

    protected T cook;

    public AbstractOrderCommand() {}

    public void execute() {
        if (ObjectUtils.isEmpty(cook)) {
            cook = assignment();
        }
        cook.cooking();
    }

    /**
     * 分配厨师
     * @return 厨师
     */
    public abstract T assignment();
}
