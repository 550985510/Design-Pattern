package com.tangdou.factory;

import com.tangdou.ApplicationStarter;
import com.tangdou.factory.shape.Shape;
import com.tangdou.factory.shape.ShapeEnum;
import com.tangdou.factory.shape.ShapeFactory;
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
public class FactoryTest {

    @Resource
    private ShapeFactory shapeFactory;

    @Test
    public void test() {
        Shape shape = shapeFactory.produce(ShapeEnum.CIRCULAR);
        log.info("{}", shape);
    }
}
