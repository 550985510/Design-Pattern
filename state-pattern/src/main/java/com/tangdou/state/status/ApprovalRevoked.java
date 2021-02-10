package com.tangdou.state.status;

import com.tangdou.state.database.ArticleDatabase;
import com.tangdou.state.model.Article;
import com.tangdou.state.model.ArticleStatus;
import com.tangdou.state.model.ArticleStatusAnnotation;
import org.springframework.stereotype.Component;

import javax.validation.ValidationException;

/**
 * @author 崔航
 * @date 2021/2/10 14:34
 */
@Component
@ArticleStatusAnnotation(ArticleStatus.APPROVAL_REVOKED)
public class ApprovalRevoked extends ArticleDatabase implements Status {

    /**
     * 编辑文章
     *
     * @param id      文章id
     * @param title   文章标题
     * @param content 文章内容
     */
    @Override
    public void edit(Long id, String title, String content) {
        Article article = super.get(id);
        article.setTitle(title);
        article.setContent(content);
        super.update(article);
    }

    /**
     * 提交审批
     *
     * @param id 文章id
     */
    @Override
    public void submitApproval(Long id) {
        Article article = super.get(id);
        article.setStatus(ArticleStatus.WAITING_APPROVAL);
        super.update(article);
    }

    /**
     * 通过审批
     *
     * @param id 文章id
     */
    @Override
    public void pass(Long id) {
        throw new ValidationException("审批已撤销请重新提交审批");
    }

    /**
     * 拒绝审批
     *
     * @param id 文章id
     */
    @Override
    public void reject(Long id) {
        throw new ValidationException("审批已撤销无法拒绝审批");
    }

    /**
     * 撤销审批
     *
     * @param id 文章id
     */
    @Override
    public void revoke(Long id) {
        throw new ValidationException("审批已撤销请勿重复撤销");
    }

    /**
     * 发布
     *
     * @param id 文章id
     */
    @Override
    public void publish(Long id) {
        throw new ValidationException("审批已撤销不允许发布");
    }

    /**
     * 撤回
     *
     * @param id 文章id
     */
    @Override
    public void withdraw(Long id) {
        throw new ValidationException("非发布状态无需撤回");
    }
}
