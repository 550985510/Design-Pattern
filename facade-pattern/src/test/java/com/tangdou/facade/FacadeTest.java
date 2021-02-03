package com.tangdou.facade;

import com.tangdou.ApplicationStarter;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author 崔航
 * @date 2021/2/3 14:52
 */
@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ApplicationStarter.class)
public class FacadeTest {

    @Test
    public void test() {
        ShoppingPlatform shoppingPlatform = new ShoppingPlatform();
        shoppingPlatform.buyFromJingDong();
        shoppingPlatform.buyFromTaoBao();
    }
}
