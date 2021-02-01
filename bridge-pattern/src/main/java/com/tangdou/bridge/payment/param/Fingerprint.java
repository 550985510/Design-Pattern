package com.tangdou.bridge.payment.param;

import lombok.Data;

/**
 * 指纹
 * @author 崔航
 * @date 2021/2/1 17:50
 */
@Data
public class Fingerprint implements PaymentParam {

    /**
     * 手指
     */
    private String finger;

    public Fingerprint(String finger) {
        this.finger = finger;
    }
}
