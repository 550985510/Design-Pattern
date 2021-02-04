package com.tangdou.proxy;

import com.tangdou.ApplicationStarter;
import com.tangdou.proxy.impl.ProxyExecutor;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author 崔航
 * @date 2021/2/4 11:48
 */
@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ApplicationStarter.class)
public class ProxyTest {

    @Test
    public void test() {
        ProxyExecutor proxyExecutor = new ProxyExecutor();
        proxyExecutor.doSomething();
    }
}
