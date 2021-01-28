package com.tangdou.demo.abstractFactory;

import com.tangdou.demo.factory.color.Color;
import com.tangdou.demo.factory.color.ColorEnum;
import com.tangdou.demo.factory.shape.Shape;
import com.tangdou.demo.factory.shape.ShapeEnum;
import com.tangdou.demo.factory.shape.ShapeFactory;
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
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class AbstractFactoryTest {

    @Resource
    private FactoryProducer factoryProducer;

    @Test
    public void test() {
        Factory<Color, ColorEnum> colorFactory = factoryProducer.produce(FactoryEnum.COLOR);
        colorFactory.produce(ColorEnum.BLUE);
    }
}
