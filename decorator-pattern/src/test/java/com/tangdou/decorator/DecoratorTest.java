package com.tangdou.decorator;

import com.tangdou.ApplicationStarter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author 崔航
 * @date 2020/9/15 10:29
 */
@SpringBootTest(classes = ApplicationStarter.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class DecoratorTest {

    @Test
    public void test() {
        PrintComponent printComponent = new BasePrint();
        DecoratorOne decoratorOne = new DecoratorOne(printComponent);
        decoratorOne.print();
    }
}
