package com.tangdou.strategy;

import lombok.Getter;

/**
 * @author 木叶丸
 * @date 2018/12/3 20:52
 */
@Getter
public enum AssignmentMethodEnum {

    /**
     * 分配方式
     */
    AVERAGE_ASSIGNMENT(1, "平均分配"),
    MINIMUM_FIRST_ASSIGNMENT(2, "最小优先分配");

    private Integer key;

    private String desc;

    AssignmentMethodEnum(Integer key, String desc) {
        this.key = key;
        this.desc = desc;
    }
}
