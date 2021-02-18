package com.tangdou.template.test;

import com.tangdou.ApplicationStarter;
import com.tangdou.template.PlayGame;
import com.tangdou.template.Shower;
import com.tangdou.template.Template;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author 崔航
 * @date 2021/2/18 15:22
 */
@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ApplicationStarter.class)
public class TemplateTest {

    @Test
    public void test() {
        Template shower = new Shower();
        shower.doSomething();
        Template playGame = new PlayGame();
        playGame.doSomething();
    }
}
