package com.tangdou.bridge.payment.param;

import lombok.Data;

/**
 * 密码
 * @author 崔航
 * @date 2021/2/1 17:50
 */
@Data
public class Password implements PaymentParam {

    /**
     * 密码
     */
    private String value;

    public Password(String value) {
        this.value = value;
    }
}
