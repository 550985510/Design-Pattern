package com.tangdou.demo.singleton;

import lombok.Getter;
import org.springframework.stereotype.Component;

/**
 * 单例模式全局静态常量
 * @author 木叶丸
 * @date 2018/12/3 21:34
 */
@Component
public class Author {

    @Getter
    private String name;

    private Author() {
        this.name = "木叶丸";
    }

    private static Author author = new Author();

    public static Author getAuthor() {
        return author;
    }
}
