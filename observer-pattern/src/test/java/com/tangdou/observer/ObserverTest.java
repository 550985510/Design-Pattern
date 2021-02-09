package com.tangdou.observer;

import com.tangdou.ApplicationStarter;
import com.tangdou.observer.model.Order;
import com.tangdou.observer.model.OrderStatus;
import com.tangdou.observer.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @author 崔航
 * @date 2021/2/9 13:21
 */
@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ApplicationStarter.class)
public class ObserverTest {

    @Resource
    private OrderService orderService;

    @Test
    public void test() {
        Order order = new Order("KH1006520210209441662", new BigDecimal(600_0000));
        orderService.create(order);
        orderService.updateStatus(order.getOrderNo(), OrderStatus.INTERVIEW);
        orderService.updateStatus(order.getOrderNo(), OrderStatus.LOAN);
    }
}
