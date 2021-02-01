package com.tangdou.bridge.payment;

import com.tangdou.bridge.payment.param.PaymentParam;

/**
 * @author 崔航
 * @date 2021/2/1 17:46
 */
public abstract class AbstractPaymentMethod {

    protected PaymentParam param;

    public AbstractPaymentMethod(PaymentParam param) {
        this.param = param;
    }

    /**
     * 支付方式名称
     * @return 支付方式名称
     */
    public abstract String name();

    /**
     * 校验
     * @return 校验结果
     */
    public abstract Boolean verify();
}
