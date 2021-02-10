package com.tangdou.state.database;

import com.tangdou.state.model.Article;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * 文章数据库
 * 代替了mapper层
 * 如果是mapper就改为持有的方式 因为mvc本身的隔离性质 不用考虑（不允许）client直接调用mapper
 * @author 崔航
 * @date 2021/2/10 11:16
 */
@Component
public class ArticleDatabase {

    private static final Map<Long, Article> ARTICLE_TABLE = new HashMap<>();

    protected void add(Article article) {
        this.update(article);
    }

    protected void update(Article article) {
        ARTICLE_TABLE.put(article.getId(), article);
    }

    protected Article get(Long id) {
        return ARTICLE_TABLE.get(id);
    }
}
