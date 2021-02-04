package com.tangdou.responsibility.chain.approver;

/**
 * 班长
 * @author 崔航
 * @date 2021/2/4 15:19
 */
public class Monitor extends AbstractApprover {

    private final String adjective;

    public Monitor(String name, String adjective) {
        super(name);
        this.adjective = adjective;
    }

    /**
     * 签字
     */
    @Override
    public void sign() {
        System.out.println(name + adjective + "同意了该方案");
    }

    /**
     * 拒绝方案
     */
    @Override
    public void refuse() {
        System.out.println(name + adjective + "驳回了该方案");
    }
}
