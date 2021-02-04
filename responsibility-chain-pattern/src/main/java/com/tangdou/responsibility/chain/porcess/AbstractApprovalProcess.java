package com.tangdou.responsibility.chain.porcess;

import com.tangdou.responsibility.chain.approver.AbstractApprover;
import com.tangdou.responsibility.chain.programme.BaseProgramme;
import lombok.Setter;
import org.springframework.util.ObjectUtils;

/**
 * 审批流程基类
 * 用泛型限制死审批链和审批人类型的对应关系
 * @author 崔航
 * @date 2021/2/4 14:34
 */
public abstract class AbstractApprovalProcess<T extends AbstractApprover> {

    @Setter
    protected AbstractApprovalProcess<? extends AbstractApprover> next;

    protected T approver;

    public AbstractApprovalProcess(T approver) {
        this.approver = approver;
    }

    public boolean approval(BaseProgramme programme) {
        boolean approval = this.doApproval(programme);
        if (!approval) {
            //拒绝
            approver.refuse();
            return false;
        }
        //同意
        approver.sign();
        if (ObjectUtils.isEmpty(next)) {
            return true;
        }
        //下轮审批
        return next.approval(programme);
    }

    /**
     * 执行审批
     * @param programme 方案
     * @return 审批结果
     */
    protected abstract boolean doApproval(BaseProgramme programme);
}
