package com.tangdou.bridge.payment;

import com.tangdou.bridge.payment.param.Fingerprint;
import com.tangdou.bridge.payment.param.PaymentParam;

/**
 * 指纹识别支付
 * @author 崔航
 * @date 2021/2/1 19:45
 */
public class FingerprintRecognitionPay extends AbstractPaymentMethod {

    private final static Fingerprint FINGERPRINT = new Fingerprint("大拇指");

    public FingerprintRecognitionPay(PaymentParam param) {
        super(param);
    }

    /**
     * 支付方式名称
     *
     * @return 支付方式名称
     */
    @Override
    public String name() {
        return "指纹识别";
    }

    /**
     * 校验
     *
     * @return 校验结果
     */
    @Override
    public Boolean verify() {
        return FINGERPRINT.getFinger().equals(((Fingerprint) this.param).getFinger());
    }
}
