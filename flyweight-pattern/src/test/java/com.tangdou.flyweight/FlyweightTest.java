package com.tangdou.flyweight;

import com.tangdou.ApplicationStarter;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author 崔航
 * @date 2021/2/3 16:36
 */
@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ApplicationStarter.class)
public class FlyweightTest {

    @Test
    public void test() {
        DataFlyweight dataFlyweight1 = FlyweightFactory.produceDataFlyweight(1L);
        DataFlyweight dataFlyweight2 = FlyweightFactory.produceDataFlyweight(1L);
        DataFlyweight dataFlyweight3 = FlyweightFactory.produceDataFlyweight(1L);
        DataFlyweight dataFlyweight4 = FlyweightFactory.produceDataFlyweight(1L);
        DataFlyweight dataFlyweight5 = FlyweightFactory.produceDataFlyweight(1L);
        log.info("" + dataFlyweight1.id + dataFlyweight2.id + dataFlyweight3.id + dataFlyweight4.id + dataFlyweight5.id);

        UserFlyweight userFlyweight1 = FlyweightFactory.produceUserFlyweight(1L);
        UserFlyweight userFlyweight2 = FlyweightFactory.produceUserFlyweight(1L);
        UserFlyweight userFlyweight3 = FlyweightFactory.produceUserFlyweight(1L);
        UserFlyweight userFlyweight4 = FlyweightFactory.produceUserFlyweight(1L);
        UserFlyweight userFlyweight5 = FlyweightFactory.produceUserFlyweight(1L);
        log.info("" + userFlyweight1.id + userFlyweight2.id + userFlyweight3.id + userFlyweight4.id + userFlyweight5.id);
    }
}
