package com.tangdou.mediator;

import com.tangdou.ApplicationStarter;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 中介者模式测试
 * @author 崔航
 * @date 2021/2/8 11:02
 */
@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ApplicationStarter.class)
public class MediatorTest {

    @Test
    public void test() {
        Colleague colleague = Colleague.builder().name("王大锤").phoneNumber("13832546525").build();
        DingTalk.entry(colleague);
        Colleague ceo = colleague.call("王总");
        log.info("{}", ceo);
    }
}
