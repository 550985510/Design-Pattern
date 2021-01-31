package com.tangdou.abstrat.factory;

import com.tangdou.ApplicationStarter;
import com.tangdou.factory.Factory;
import com.tangdou.factory.FactoryEnum;
import com.tangdou.factory.FactoryProducer;
import com.tangdou.factory.color.Color;
import com.tangdou.factory.color.ColorEnum;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @author 崔航
 * @date 2021/1/28 15:48
 */
@Slf4j
@SpringBootTest(classes = ApplicationStarter.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class AbstractFactoryTest {

    @Resource
    private FactoryProducer<Color, ColorEnum> factoryProducer;

    @Test
    public void test() {
        Factory<Color, ColorEnum> colorFactory = factoryProducer.produce(FactoryEnum.COLOR);
        colorFactory.produce(ColorEnum.BLUE);
    }
}
