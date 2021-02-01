package com.tangdou.adapter;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 数据线适配器
 * 对象适配模式 持有源对象 并委派给源对象
 * @author 崔航
 * @date 2021/2/1 16:39
 */
@Service
public class DataCableObjectAdapter implements DataCableAdapter {

    /**
     * 注入 （在构造方法中传入）
     */
    @Resource
    private AppleDataCable appleDataCable;

    /**
     * 给华为手机充电
     */
    @Override
    public void chargeUpForHuaWei() {
        //委派给源对象
        this.appleDataCable.chargeUpForIphone();
    }
}
