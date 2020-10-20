package com.tangdou.demo;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 上台阶问题（一次一阶 或 两阶）
 * @author 木叶丸
 * @date 2018/12/6 21:54
 */
@Slf4j
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class TestDemo {


    private List<Integer> stepStlye = new ArrayList<Integer>();
    public static final int STAIRS_COUNT = 3;

    public void goStairs(int leftStairsCount) {
        if (leftStairsCount - 1 >= 0) {
            stepStlye.add(1);
            leftStairsCount = leftStairsCount - 1;
            goStairs(leftStairsCount);
            leftStairsCount = leftStairsCount + 1;
            stepStlye.remove(stepStlye.size() - 1);
        }
        if (leftStairsCount - 2 >= 0) {
            stepStlye.add(2);
            leftStairsCount = leftStairsCount - 2;
            goStairs(leftStairsCount);
            leftStairsCount = leftStairsCount + 2;
            stepStlye.remove(stepStlye.size() - 1);
        }
        if (leftStairsCount == 0) {
            System.out.println(Arrays.toString(stepStlye.toArray(new Integer[0])));
            return;
        }
    }

    @Test
    public void setStepStlye() {
        goStairs(3);
    }

    public static class TempNode {
        public Integer step = 0;
        public String path = "";
    }

    @Test
    public void testStep() {
        TempNode tempNode = new TempNode();
        up(tempNode);
    }

    private void up(TempNode tempNode) {
        TempNode tempNode1 = new TempNode();
        tempNode1.step = tempNode.step + 1;
        tempNode1.path = tempNode.path + "-1";
        if (tempNode1.step == 10) {
            System.out.println(tempNode1.path);
        }
        if (tempNode1.step < 10) {
            up(tempNode1);
        }
        TempNode tempNode2 = new TempNode();
        tempNode2.step = tempNode.step + 2;
        tempNode2.path = tempNode.path + "-2";
        if (tempNode2.step == 10) {
            System.out.println(tempNode2.path);
        }
        if (tempNode2.step < 10) {
            up(tempNode2);
        }
    }
}
