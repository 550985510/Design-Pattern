package com.tangdou.state.service;

import com.tangdou.state.database.ArticleDatabase;
import com.tangdou.state.model.Article;
import com.tangdou.state.model.ArticleStatus;
import com.tangdou.state.status.StatusManager;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 文章服务实现类
 * 与状态相关的接口委托给status实现类处理
 * @author 崔航
 * @date 2021/2/9 16:12
 */
@Service
public class ArticleServiceImpl extends ArticleDatabase implements ArticleService {

    @Resource
    private StatusManager statusManager;

    /**
     * 添加文章
     *
     * @param article 文章
     */
    @Override
    public void add(Article article) {
        //初始化状态
        article.setStatus(ArticleStatus.NOT_SUBMITTED_APPROVAL);
        super.add(article);
    }

    /**
     * 获取文章
     *
     * @param id 文章id
     * @return 文章
     */
    @Override
    public Article get(Long id) {
        return super.get(id);
    }

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
        statusManager.get(article.getStatus()).edit(id, title, content);
    }

    /**
     * 提交审批
     *
     * @param id 文章id
     */
    @Override
    public void submitApproval(Long id) {
        Article article = super.get(id);
        statusManager.get(article.getStatus()).submitApproval(id);
    }

    /**
     * 通过审批
     *
     * @param id 文章id
     */
    @Override
    public void pass(Long id) {
        Article article = super.get(id);
        statusManager.get(article.getStatus()).pass(id);
    }

    /**
     * 拒绝审批
     *
     * @param id 文章id
     */
    @Override
    public void reject(Long id) {
        Article article = super.get(id);
        statusManager.get(article.getStatus()).reject(id);
    }

    /**
     * 撤销审批
     *
     * @param id 文章id
     */
    @Override
    public void revoke(Long id) {
        Article article = super.get(id);
        statusManager.get(article.getStatus()).revoke(id);
    }

    /**
     * 发布
     *
     * @param id 文章id
     */
    @Override
    public void publish(Long id) {
        Article article = super.get(id);
        statusManager.get(article.getStatus()).publish(id);
    }

    /**
     * 撤回
     *
     * @param id 文章id
     */
    @Override
    public void withdraw(Long id) {
        Article article = super.get(id);
        statusManager.get(article.getStatus()).withdraw(id);
    }
}
