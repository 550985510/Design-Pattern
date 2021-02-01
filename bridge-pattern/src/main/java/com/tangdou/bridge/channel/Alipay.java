package com.tangdou.bridge.channel;

import com.tangdou.bridge.payment.AbstractPaymentMethod;

import java.math.BigDecimal;

/**
 * 支付宝
 * @author 崔航
 * @date 2021/2/1 19:50
 */
public class Alipay extends AbstractPayChannel{

    public Alipay(AbstractPaymentMethod paymentMethod) {
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
        System.out.println("正在使用支付宝支付");
    }
}
