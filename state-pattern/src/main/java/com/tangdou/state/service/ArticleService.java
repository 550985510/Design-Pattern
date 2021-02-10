package com.tangdou.state.service;

import com.tangdou.state.model.Article;
import com.tangdou.state.status.Status;

/**
 * 文章服务类
 * @author 崔航
 * @date 2021/2/9 16:11
 */
public interface ArticleService extends Status {

    /**
     * 添加文章
     * @param article 文章
     */
    void add(Article article);

    /**
     * 获取文章
     * @param id 文章id
     * @return 文章
     */
    Article get(Long id);
}
