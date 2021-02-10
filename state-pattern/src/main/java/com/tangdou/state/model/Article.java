package com.tangdou.state.model;

import lombok.Data;

/**
 * @author 崔航
 * @date 2021/2/9 15:07
 */
@Data
public class Article {

    private Long id;

    private String title;

    private String author;

    private String content;

    private ArticleStatus status;

    public Article(Long id, String title, String author, String content) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.content = content;
    }
}
