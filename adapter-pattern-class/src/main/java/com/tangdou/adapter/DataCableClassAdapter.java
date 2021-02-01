package com.tangdou.adapter;

import org.springframework.stereotype.Service;

/**
 * 数据线适配器
 * 类适配模式 继承源类
 * @author 崔航
 * @date 2021/2/1 16:12
 */
@Service
public class DataCableClassAdapter extends AppleDataCable implements DataCableAdapter {

    /**
     * 给华为手机充电
     */
    @Override
    public void chargeUpForHuaWei() {
        //苹果充电线不能给华为充电 插上转接头之后则可以给华为充电
        this.chargeUpForIphone();
    }
}
