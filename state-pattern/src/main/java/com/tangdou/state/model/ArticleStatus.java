package com.tangdou.state.model;

import lombok.Getter;

/**
 * @author 崔航
 * @date 2021/2/9 15:09
 */
@Getter
public enum ArticleStatus {

    /**
     * 文章状态
     */
    NOT_SUBMITTED_APPROVAL("未提交审批"),
    WAITING_APPROVAL("等待审批中"),
    APPROVAL_REVOKED("已撤销审批"),
    APPROVED("审批已通过"),
    APPROVAL_REJECTED("审批已拒绝"),
    PUBLISHED("文章已发布"),
    WITHDRAWN("文章已撤回");

    private final String description;

    ArticleStatus(String description) {
        this.description = description;
    }
}
