package com.tangdou.composite.user.attribute;

import lombok.Getter;

/**
 * 年龄段
 * @author 崔航
 * @date 2021/2/2 16:08
 */
@Getter
public enum AgeGroup implements AttributeEnum {

    /**
     * 年龄段
     */
    JUVENILE("少年", 0, 17, "0 ~ 17"),
    YOUTH("青年", 18, 45, "18 ~ 45"),
    MID_LIFE("中年", 46, 69, "46 ~ 69"),
    OLD("老年", 70, null, "70 ~ ∞");

    private final String value;

    private final Integer mixAge;

    private final Integer maxAge;

    private final String description;

    AgeGroup(String value, Integer mixAge, Integer maxAge, String description) {
        this.value = value;
        this.mixAge = mixAge;
        this.maxAge = maxAge;
        this.description = description;
    }

    public static AgeGroup get(Integer age) {
        if (age < JUVENILE.mixAge) {
            return JUVENILE;
        } else if (age < YOUTH.mixAge) {
            return YOUTH;
        } else if (age < MID_LIFE.mixAge) {
            return MID_LIFE;
        } else {
            return OLD;
        }
    }
}
