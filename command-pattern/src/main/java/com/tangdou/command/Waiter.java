package com.tangdou.command;

import com.tangdou.command.cuisine.AbstractOrderCommand;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 服务员
 * 请求者 接收客户的请求 将命令*（菜品）发给厨子（接收者）执行
 * @author 崔航
 * @date 2021/2/4 19:10
 */
public class Waiter {

    private static final Queue<AbstractOrderCommand<?>> ORDER_QUEUE = new LinkedList<>();

    /**
     * 点菜
     * @param cuisine 菜品
     */
    public static void order(AbstractOrderCommand<?> cuisine) {
        if (ObjectUtils.isEmpty(cuisine)) {
            return;
        }
        ORDER_QUEUE.offer(cuisine);
    }

    /**
     * 下单
     */
    public static synchronized void placeOrder() {
        while (!CollectionUtils.isEmpty(ORDER_QUEUE)) {
            AbstractOrderCommand<?> orderCommand = ORDER_QUEUE.poll();
            if (ObjectUtils.isEmpty(orderCommand)) {
                continue;
            }
            orderCommand.execute();
        }
    }
}
