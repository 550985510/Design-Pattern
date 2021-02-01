package com.tangdou.bridge.payment;

import com.tangdou.bridge.payment.param.Password;

/**
 * 密码支付
 * @author 崔航
 * @date 2021/2/1 18:00
 */
public class PasswordPay extends AbstractPaymentMethod {

    private final static Password PASSWORD = new Password("123456");

    public PasswordPay(Password param) {
        super(param);
    }

    /**
     * 支付方式名称
     *
     * @return 支付方式名称
     */
    @Override
    public String name() {
        return "密码";
    }

    /**
     * 校验
     * @return 校验结果
     */
    @Override
    public Boolean verify() {
        return PASSWORD.getValue().equals(((Password) this.param).getValue());
    }
}
