package com.tangdou.state.status;

import com.tangdou.state.database.ArticleDatabase;
import com.tangdou.state.model.Article;
import com.tangdou.state.model.ArticleStatus;
import com.tangdou.state.model.ArticleStatusAnnotation;
import org.springframework.stereotype.Component;

import javax.validation.ValidationException;

/**
 * @author 崔航
 * @date 2021/2/10 13:53
 */
@Component
@ArticleStatusAnnotation(ArticleStatus.WAITING_APPROVAL)
public class WaitingApproval extends ArticleDatabase implements Status {

    /**
     * 编辑文章
     *
     * @param id      文章id
     * @param title   文章标题
     * @param content 文章内容
     */
    @Override
    public void edit(Long id, String title, String content) {
        throw new ValidationException("待审批状态不允许修改");
    }

    /**
     * 提交审批
     *
     * @param id 文章id
     */
    @Override
    public void submitApproval(Long id) {
        throw new ValidationException("已提交审批请勿重复提交");
    }

    /**
     * 通过审批
     *
     * @param id 文章id
     */
    @Override
    public void pass(Long id) {
        Article article = super.get(id);
        article.setStatus(ArticleStatus.APPROVED);
        super.update(article);
    }

    /**
     * 拒绝审批
     *
     * @param id 文章id
     */
    @Override
    public void reject(Long id) {
        Article article = super.get(id);
        article.setStatus(ArticleStatus.APPROVAL_REJECTED);
        super.update(article);
    }

    /**
     * 撤销审批
     *
     * @param id 文章id
     */
    @Override
    public void revoke(Long id) {
        Article article = super.get(id);
        //状态改为未提交审批
        article.setStatus(ArticleStatus.NOT_SUBMITTED_APPROVAL);
        super.update(article);
    }

    /**
     * 发布
     *
     * @param id 文章id
     */
    @Override
    public void publish(Long id) {
        throw new ValidationException("审批通过后才能发布");
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
