package com.tangdou.bridge;

import com.tangdou.ApplicationStarter;
import com.tangdou.bridge.channel.AbstractPayChannel;
import com.tangdou.bridge.channel.Alipay;
import com.tangdou.bridge.channel.WeChat;
import com.tangdou.bridge.payment.FaceRecognitionPay;
import com.tangdou.bridge.payment.FingerprintRecognitionPay;
import com.tangdou.bridge.payment.PasswordPay;
import com.tangdou.bridge.payment.param.FaceInfo;
import com.tangdou.bridge.payment.param.Fingerprint;
import com.tangdou.bridge.payment.param.Password;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;

/**
 * @author 崔航
 * @date 2021/2/1 19:53
 */
@Slf4j
@SpringBootTest(classes = ApplicationStarter.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class BridgeTest {

    @Test
    public void test() {
        Long userId = 1L;
        String account = "1000000";
        BigDecimal amount = new BigDecimal(1000000);
        AbstractPayChannel weChat = new WeChat(new FaceRecognitionPay(new FaceInfo("天下第一帅")));
        weChat.pay(userId, amount, account);

        weChat = new WeChat(new PasswordPay(new Password("654321")));
        weChat.pay(userId, amount, account);

        AbstractPayChannel alipay = new Alipay(new FingerprintRecognitionPay(new Fingerprint("大拇指")));
        alipay.pay(userId, amount, account);
    }
}
