package com.tangdou.interpreter;

import com.tangdou.ApplicationStarter;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 崔航
 * @date 2021/2/7 17:16
 */
@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ApplicationStarter.class)
public class InterpreterTest {

    @Test
    public void test() {
        //设置规则 金木水火土都有才行
        List<TerminalExpression> list = new ArrayList<>(5);
        list.add(new TerminalExpression("金"));
        list.add(new TerminalExpression("火"));
        list.add(new TerminalExpression("水"));
        list.add(new TerminalExpression("木"));
        list.add(new TerminalExpression("土"));
        AndExpression and = new AndExpression(list);
        OrExpression or = new OrExpression(list);
        System.out.println(and.interpreter("金，木，水，火，土"));
        System.out.println(or.interpreter("金"));
    }
}
