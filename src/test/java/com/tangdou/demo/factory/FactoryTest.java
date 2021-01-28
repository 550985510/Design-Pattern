package com.tangdou.demo.factory;

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
public class FactoryTest {

    @Resource
    private ShapeFactory shapeFactory;

    @Test
    public void test() {
        Shape produce = shapeFactory.produce(ShapeEnum.CIRCULAR);
    }
}
