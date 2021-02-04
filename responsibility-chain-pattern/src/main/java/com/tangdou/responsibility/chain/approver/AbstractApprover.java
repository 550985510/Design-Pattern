package com.tangdou.responsibility.chain.approver;

/**
 * 审批人基类
 * @author 崔航
 * @date 2021/2/4 15:09
 */
public abstract class AbstractApprover {

    protected String name;

    public AbstractApprover(String name) {
        this.name = name;
    }

    /**
     * 签字
     */
    public abstract void sign();

    /**
     * 拒绝方案
     */
    public abstract void refuse();
}
