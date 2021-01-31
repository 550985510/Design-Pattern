package com.tangdou.builder;

import com.tangdou.ApplicationStarter;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 传统builder模式测试类
 * @author 崔航
 * @date 2021/1/29 17:33
 */
@Slf4j
@SpringBootTest(classes = ApplicationStarter.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class BuilderTest {

    @Test
    public void test() {
        Oven oven = new Oven(new RedSquareCookiesBuilder());
        Cookies cookies = oven.baking(10);
        log.info("{}", cookies);
    }
}
