package com.tangdou.adapter;

import com.tangdou.ApplicationStarter;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @author 崔航
 * @date 2021/2/1 16:33
 */
@Slf4j
@SpringBootTest(classes = ApplicationStarter.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class AdapterTest {

    @Resource
    private AppleDataCable appleDataCable;

    @Resource
    private DataCableClassAdapter dataCableClassAdapter;

    @Resource
    private DataCableObjectAdapter dataCableObjectAdapter;

    @Test
    public void test() {
        //给苹果手机充电
        appleDataCable.chargeUpForIphone();
        //给华为手机充电 或者给苹果充电
        dataCableClassAdapter.chargeUpForHuaWei();
        //只能给华为充电
        dataCableObjectAdapter.chargeUpForHuaWei();
    }
}
