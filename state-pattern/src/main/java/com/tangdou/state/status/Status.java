package com.tangdou.state.status;

/**
 * @author 崔航
 * @date 2021/2/9 15:55
 */
public interface Status {

    /**
     * 编辑文章
     * @param id 文章id
     * @param title 文章标题
     * @param content 文章内容
     */
    void edit(Long id, String title, String content);

    /**
     * 提交审批
     * @param id 文章id
     */
    void submitApproval(Long id);

    /**
     * 通过审批
     * @param id 文章id
     */
    void pass(Long id);

    /**
     * 拒绝审批
     * @param id 文章id
     */
    void reject(Long id);

    /**
     * 撤销审批
     * @param id 文章id
     */
    void revoke(Long id);

    /**
     * 发布
     * @param id 文章id
     */
    void publish(Long id);

    /**
     * 撤回
     * @param id 文章id
     */
    void withdraw(Long id);
}
