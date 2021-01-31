package com.tangdou.strategy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author 木叶丸
 * @date 2018/12/3 21:04
 */
@Slf4j
@Service
public class AverageAssignmentStrategy implements AssignmentStrategy {

    /**
     * 分配
     */
    @Override
    public void assign() {
        log.info(AssignmentMethodEnum.AVERAGE_ASSIGNMENT.getDesc());
    }
}
