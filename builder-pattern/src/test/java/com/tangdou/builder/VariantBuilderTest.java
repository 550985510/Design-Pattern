package com.tangdou.builder;

import com.tangdou.ApplicationStarter;
import com.tangdou.factory.color.product.Red;
import com.tangdou.factory.shape.product.Circular;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 变种builder模式测试类
 * @author 崔航
 * @date 2021/1/29 17:33
 */
@Slf4j
@SpringBootTest(classes = ApplicationStarter.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class VariantBuilderTest {

    @Test
    public void test() {
        Cookies cookies = Cookies.builder(10).color(new Red()).shape(new Circular()).build();
        log.info("{}", cookies);
    }
}
