package com.tangdou.dynamicLoad;

import com.tangdou.ApplicationStarter;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author 木叶丸
 * @date 2020/2/26 16:37
 */
@Slf4j
@SpringBootTest(classes = ApplicationStarter.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class DynamicLoad {

    @Test
    public void test() {
        Office.run("Word");
        Office.run("Excel");
    }
}
class Office {
    static void run(String className) {
        try {
            String packageName = "com.tangdou.demo.dynamicLoad.";
            Class<?> c = Class.forName(packageName + className);
            OfficeFamily officeFamily = (OfficeFamily) c.newInstance();
            officeFamily.doSth();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
    }
}

interface OfficeFamily{

    void doSth();
}

class Word implements OfficeFamily {

    @Override
    public void doSth() {
        System.out.println("我是Word");
    }
}

class Excel implements OfficeFamily {

    @Override
    public void doSth() {
        System.out.println("我是Excel");
    }
}
