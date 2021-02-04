package com.tangdou.responsibility.chain.porcess;

import com.tangdou.responsibility.chain.approver.Lieutenant;
import com.tangdou.responsibility.chain.programme.BaseProgramme;

/**
 * 二级审批流程
 * @author 崔航
 * @date 2021/2/4 15:35
 */
public class SecondLevelProcess extends AbstractApprovalProcess<Lieutenant> {

    public SecondLevelProcess(Lieutenant approver) {
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
        //此处是处理逻辑
        return false;
    }
}
