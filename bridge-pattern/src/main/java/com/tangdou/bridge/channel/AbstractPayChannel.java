package com.tangdou.bridge.channel;

import com.tangdou.bridge.payment.AbstractPaymentMethod;

import java.math.BigDecimal;

/**
 * 多支付渠道与多支付方式之间的桥梁
 * @author 崔航
 * @date 2021/2/1 17:52
 */
public abstract class AbstractPayChannel {

    /**
     * 支付方式
     */
    protected AbstractPaymentMethod paymentMethod;

    public AbstractPayChannel(AbstractPaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /**
     * 支付
     * @param userId 用户id
     * @param amount 金额
     * @param account 收款账户
     */
    abstract void doPay(Long userId, BigDecimal amount, String account);

    public void pay(Long userId, BigDecimal amount, String account) {
        if (this.verify()) {
            System.out.println(paymentMethod.name() + "校验通过");
            this.doPay(userId, amount, account);
            System.out.println("支付成功");
            return;
        }
        System.out.println(paymentMethod.name() + "校验失败，无法进行交易");
    }

    Boolean verify() {
        return paymentMethod.verify();
    }
}
