package com.tangdou.state.status;

import com.tangdou.state.database.ArticleDatabase;
import com.tangdou.state.model.Article;
import com.tangdou.state.model.ArticleStatus;
import com.tangdou.state.model.ArticleStatusAnnotation;
import org.springframework.stereotype.Component;

import javax.validation.ValidationException;

/**
 * @author 崔航
 * @date 2021/2/10 14:45
 */
@Component
@ArticleStatusAnnotation(ArticleStatus.PUBLISHED)
public class Published extends ArticleDatabase implements Status {

    /**
     * 编辑文章
     *
     * @param id      文章id
     * @param title   文章标题
     * @param content 文章内容
     */
    @Override
    public void edit(Long id, String title, String content) {
        throw new ValidationException("文章已发布无法修改");
    }

    /**
     * 提交审批
     *
     * @param id 文章id
     */
    @Override
    public void submitApproval(Long id) {
        throw new ValidationException("文章已发布无需提交审批");
    }

    /**
     * 通过审批
     *
     * @param id 文章id
     */
    @Override
    public void pass(Long id) {
        throw new ValidationException("文章已发布请勿重复审批");
    }

    /**
     * 拒绝审批
     *
     * @param id 文章id
     */
    @Override
    public void reject(Long id) {
        throw new ValidationException("文章已发布请勿重复审批");
    }

    /**
     * 撤销审批
     *
     * @param id 文章id
     */
    @Override
    public void revoke(Long id) {
        throw new ValidationException("文章已发布无法撤回审批");
    }

    /**
     * 发布
     *
     * @param id 文章id
     */
    @Override
    public void publish(Long id) {
        throw new ValidationException("文章已发布请勿重复发布");
    }

    /**
     * 撤回
     *
     * @param id 文章id
     */
    @Override
    public void withdraw(Long id) {
        Article article = super.get(id);
        article.setStatus(ArticleStatus.WITHDRAWN);
        super.update(article);
    }
}
