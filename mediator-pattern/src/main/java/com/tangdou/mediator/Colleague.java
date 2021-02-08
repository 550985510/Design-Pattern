package com.tangdou.mediator;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author 崔航
 * @date 2021/2/8 10:48
 */
@EqualsAndHashCode(callSuper = false)
@Data
@Builder
public class Colleague extends AbstractColleague {

    private String name;

    private String phoneNumber;

    private Integer age;

    private String position;

    private String department;
}
