package com.tangdou.strategy;

import com.tangdou.ApplicationStarter;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @author 木叶丸
 * @date 2018/12/3 21:10
 */
@Slf4j
@SpringBootTest(classes = ApplicationStarter.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class AssignmentContextTest {

    @Resource
    private AverageAssignmentStrategy averageAssignmentStrategy;

    @Test
    public void test() {
        AssignmentContext context = new AssignmentContext(averageAssignmentStrategy);
        context.executeAssign();
    }
}
