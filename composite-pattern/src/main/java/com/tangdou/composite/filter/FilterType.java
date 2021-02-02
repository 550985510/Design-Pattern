package com.tangdou.composite.filter;

import lombok.Getter;

/**
 * @author 崔航
 * @date 2021/2/2 17:36
 */
@Getter
public enum FilterType {

    /**
     * 条件类型
     */
    AGE_FILTER(AgeFilter.class, "年龄条件"),
    GENDER_FILTER(GenderFilter.class, "性别条件"),
    OCCUPATION_FILTER(OccupationFilter.class, "职业条件");


    private final Class<?> type;
    private final String name;

    FilterType(Class<?> type, String name) {
        this.type = type;
        this.name = name;
    }
}
