package com.tangdou.bridge.payment;

/**
 * @author 崔航
 * @date 2021/2/1 17:46
 */
public abstract class AbstractPaymentMethod<T> {

    protected T param;

    public AbstractPaymentMethod(T param) {
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
