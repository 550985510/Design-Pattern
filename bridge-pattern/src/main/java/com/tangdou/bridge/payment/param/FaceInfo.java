package com.tangdou.bridge.payment.param;

import lombok.Data;

/**
 * 人脸信息
 * @author 崔航
 * @date 2021/2/1 17:51
 */
@Data
public class FaceInfo implements PaymentParam {

    /**
     * 五官
     */
    private String features;

    public FaceInfo(String features) {
        this.features = features;
    }
}
