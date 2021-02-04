package com.tangdou.responsibility.chain.approver;

/**
 * 副职官员 班长上级
 * @author 崔航
 * @date 2021/2/4 15:33
 */
public class Lieutenant extends AbstractApprover {

    public Lieutenant(String name) {
        super(name);
    }

    /**
     * 签字
     */
    @Override
    public void sign() {
        System.out.println(name + "同意了该方案");
    }

    /**
     * 拒绝方案
     */
    @Override
    public void refuse() {
        System.out.println(name + "驳回了该方案");
    }
}
