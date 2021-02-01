package com.tangdou.bridge.payment;

import com.tangdou.bridge.payment.param.FaceInfo;
import com.tangdou.bridge.payment.param.PaymentParam;

/**
 * 人脸识别
 * @author 崔航
 * @date 2021/2/1 19:48
 */
public class FaceRecognitionPay extends AbstractPaymentMethod {

    private final static FaceInfo FACE_INFO = new FaceInfo("天下第一帅");

    public FaceRecognitionPay(PaymentParam param) {
        super(param);
    }

    /**
     * 支付方式名称
     *
     * @return 支付方式名称
     */
    @Override
    public String name() {
        return "人脸识别";
    }

    /**
     * 校验
     *
     * @return 校验结果
     */
    @Override
    public Boolean verify() {
        return FACE_INFO.getFeatures().equals(((FaceInfo) this.param).getFeatures());
    }
}
