package com.tangdou.responsibility.chain;

import com.tangdou.ApplicationStarter;
import com.tangdou.responsibility.chain.approver.Colonel;
import com.tangdou.responsibility.chain.approver.Lieutenant;
import com.tangdou.responsibility.chain.approver.Major;
import com.tangdou.responsibility.chain.approver.Monitor;
import com.tangdou.responsibility.chain.porcess.FourLevelProcess;
import com.tangdou.responsibility.chain.porcess.OneLevelProcess;
import com.tangdou.responsibility.chain.porcess.SecondLevelProcess;
import com.tangdou.responsibility.chain.porcess.ThreeLevelProcess;
import com.tangdou.responsibility.chain.programme.BaseProgramme;
import com.tangdou.responsibility.chain.programme.OperationPlan;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author 崔航
 * @date 2021/2/4 15:37
 */
@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ApplicationStarter.class)
public class ResponsibilityChainTest {

    @Test
    public void test() {
        BaseProgramme programme = new OperationPlan();
        OneLevelProcess oneLevelProcess = new OneLevelProcess(new Monitor("班长王大锤", "愉快地"));
        SecondLevelProcess secondLevelProcess = new SecondLevelProcess(new Lieutenant("连长刘二堡"));
        ThreeLevelProcess threeLevelProcess = new ThreeLevelProcess(new Major("营长李狗蛋"));
        FourLevelProcess fourLevelProcess = new FourLevelProcess(new Colonel("团长赵宝刚"));
        oneLevelProcess.setNext(secondLevelProcess);
        secondLevelProcess.setNext(threeLevelProcess);
        threeLevelProcess.setNext(fourLevelProcess);
        boolean result = oneLevelProcess.approval(programme);
        log.info("{}", result);
    }
}
