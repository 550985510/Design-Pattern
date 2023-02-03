package com.tangdou.groovy;

import com.tangdou.groovy.loader.GroovyLoader;
import com.tangdou.groovy.service.PrintService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @author 崔航
 * @date 2023/2/3 11:19
 */
@Slf4j
@SpringBootTest(classes = ApplicationStarter.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class GroovyTest {

    @Resource
    private GroovyLoader groovyLoader;

    @Test
    public void test() {
        //TestService encode后
        String script = "cGFja2FnZSBjb20udGFuZ2RvdS5ncm9vdnkuc2VydmljZTsNCg0KLyoqDQogKiBAYXV0aG9yIOW0lOiIqg0KICogQGRhdGUgMjAyMy8yLzMgMTE6MTYNCiAqLw0KcHVibGljIGNsYXNzIFRlc3RTZXJ2aWNlIGltcGxlbWVudHMgUHJpbnRTZXJ2aWNlIHsNCiAgICAvKioNCiAgICAgKiDovpPlh7rlhoXlrrkNCiAgICAgKg0KICAgICAqIEByZXR1cm4g6L6T5Ye65YaF5a65DQogICAgICovDQogICAgQE92ZXJyaWRlDQogICAgcHVibGljIFN0cmluZyBwcmludCgpIHsNCiAgICAgICAgcmV0dXJuICLmtYvor5Vncm9vdmV5IjsNCiAgICB9DQp9DQo";
        String className = "testService";
        Object bean = groovyLoader.getBean(className, script);
        String print = ((PrintService) bean).print();
        System.out.print(print);
    }
}
