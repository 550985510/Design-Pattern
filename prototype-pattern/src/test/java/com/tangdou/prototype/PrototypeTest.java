package com.tangdou.prototype;

import com.tangdou.ApplicationStarter;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 崔航
 * @date 2021/2/1 10:57
 */
@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ApplicationStarter.class)
public class PrototypeTest {

    @Test
    public void test() {
        Map<String, Integer> map = new HashMap<>(8);
        map.put("aaa", 111);
        map.put("bbb", 222);
        map.put("ccc", 333);
        List<Integer> list = new ArrayList<>(map.values());
        //创建实例会调用构造方法
        Prototype prototype = new Prototype(map, list);
        //克隆实例不会调用构造方法
        Prototype clone = prototype.clone();
        log.info("{}", clone);
        log.info("{}", prototype);
        //修改克隆对象的属性 不影响原型对象
        clone.getList().add(0, 0);
        log.info("{}", clone);
        log.info("{}", prototype);
    }
}
