package com.tangdou.composite.user;

import lombok.Data;

/**
 * 用户对象
 * @author 崔航
 * @date 2021/2/2 15:20
 */
@Data
public class User {

    private Integer age;

    private Gender gender;

    private Occupation occupation;
}
