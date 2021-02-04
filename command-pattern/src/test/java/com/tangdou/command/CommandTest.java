package com.tangdou.command;

import com.tangdou.ApplicationStarter;
import com.tangdou.command.cuisine.CantoneseCuisine;
import com.tangdou.command.cuisine.SichuanCuisine;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author 崔航
 * @date 2021/2/4 20:15
 */
@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ApplicationStarter.class)
public class CommandTest {

    @Test
    public void test() {
        Waiter.order(new SichuanCuisine());
        Waiter.order(new SichuanCuisine());
        Waiter.order(new CantoneseCuisine());
        Waiter.placeOrder();
    }
}
