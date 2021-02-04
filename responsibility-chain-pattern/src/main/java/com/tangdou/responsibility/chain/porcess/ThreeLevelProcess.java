package com.tangdou.responsibility.chain.porcess;

import com.tangdou.responsibility.chain.approver.Major;
import com.tangdou.responsibility.chain.programme.BaseProgramme;

/**
 * @author 崔航
 * @date 2021/2/4 16:00
 */
public class ThreeLevelProcess extends AbstractApprovalProcess<Major> {

    public ThreeLevelProcess(Major approver) {
        super(approver);
    }

    /**
     * 执行审批
     *
     * @param programme 方案
     * @return 审批结果
     */
    @Override
    protected boolean doApproval(BaseProgramme programme) {
        return true;
    }
}
