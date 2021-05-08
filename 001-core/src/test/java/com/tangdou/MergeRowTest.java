package com.tangdou;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.CollectionUtils;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import java.util.List;

/**
 * 二维数组合并行
 * 只能从第一列开始合并
 * 只有前一列合并了 后一列的才能合并
 * <p>
 * {1, 2, 7, 1, 2, 3}
 * {1, 2, 7, 1, 7, 2}
 * {1, 4, 8, 4, 6, 5}
 * {2, 4, 8, 5, 3, 4}
 * {2, 4, 7, 7, 6, 2}
 * {3, 5, 6, 1, 5, 4}
 * {3, 6, 5, 7, 2, 1}
 *
 * @author 崔航
 * @date 2021/4/14 22:42
 */
@Slf4j
@SpringBootTest(classes = ApplicationStarter.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class MergeRowTest {

    @Test
    public void test() {
        Integer[][] data = new Integer[][]{{1, 2, 7, 1, 2, 3}, {1, 2, 7, 1, 7, 2}, {1, 4, 8, 4, 6, 5}, {2, 4, 8, 5, 3, 4}, {2, 4, 7, 7, 6, 2}, {3, 5, 6, 1, 5, 4}, {3, 6, 5, 7, 2, 1}};
        int maxRow = data.length;
        int maxCol = data[0].length;
        MultiValueMap<Integer, Integer[]> map = new LinkedMultiValueMap<>();
        //循环列 查找当前列是否有可合并的行
        for (int col = 0; col < maxCol; col++) {
            if (col == 0) {
                //如果是第一列
                this.merge(map, data, maxRow, 0, col);
            } else {
                //上一列合并
                List<Integer[]> priorMerge = map.get(col - 1);
                if (CollectionUtils.isEmpty(priorMerge)) {
                    //如果上一列没有合并 则后面的列都不需要合并
                    break;
                }
                for (Integer[] integers : priorMerge) {
                    this.merge(map, data, integers[1] + 1, integers[0], col);
                }
            }
        }
        log.info("");
    }

    private void merge(MultiValueMap<Integer, Integer[]> map, Integer[][] data, int maxRow, int start, int col) {
        //获取第一行的数据 作为比较值
        Integer flag = data[start][col];
        for (int row = start; row < maxRow; row++) {
            //循环每一行
            if (!flag.equals(data[row][col])) {
                //如果当前行和比较值不同 证明需要确定新的下标 并判断之前的行需不需要合并 更新比较值
                flag = data[row][col];
                if (start != row - 1) {
                    //如果上一行和起始下标不同 证明需要合并
                    log.info("合并第{}列的第{}行到第{}行", col, start, row - 1);
                    map.add(col, new Integer[]{start, row - 1});
                }
                //起始下标赋值为当前行
                start = row;
            }
            if (row == maxRow - 1 && start != row) {
                //如果当前是最后一行 起始下标不等于当前行 证明需要合并
                log.info("合并第{}列的第{}行到第{}行", col, start, row);
                map.add(col, new Integer[]{start, row});
            }
        }
    }
}
