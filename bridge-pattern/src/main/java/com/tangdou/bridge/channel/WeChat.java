package com.tangdou.bridge.channel;

import com.tangdou.bridge.payment.AbstractPaymentMethod;

import java.math.BigDecimal;

/**
 * 微信支付
 * @author 崔航
 * @date 2021/2/1 19:20
 */
public class WeChat extends AbstractPayChannel {

    public WeChat(AbstractPaymentMethod paymentMethod) {
        super(paymentMethod);
    }

    /**
     * 支付
     *
     * @param userId  用户id
     * @param amount  金额
     * @param account 收款账户
     */
    @Override
    void doPay(Long userId, BigDecimal amount, String account) {
        System.out.println("正在使用微信支付");
    }
}
