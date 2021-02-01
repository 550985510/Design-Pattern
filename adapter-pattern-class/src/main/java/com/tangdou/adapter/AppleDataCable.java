package com.tangdou.adapter;

import org.springframework.stereotype.Component;

/**
 * 苹果数据线
 * @author 崔航
 * @date 2021/2/1 16:10
 */
@Component
public class AppleDataCable  {

    /**
     * 给苹果手机充电
     */
    public void chargeUpForIphone() {
        System.out.println("充电成功");
    }
}
