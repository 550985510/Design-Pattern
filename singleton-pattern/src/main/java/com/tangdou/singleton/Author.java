package com.tangdou.singleton;

import lombok.Getter;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import java.util.concurrent.atomic.AtomicReference;

/**
 * 单例模式全局静态常量
 * 饿汉模式 线程安全
 * @author 木叶丸
 * @date 2018/12/3 21:34
 */
@Component
public class Author {

    @Getter
    private final String name;

    private static final Author AUTHOR = new Author();

    private Author() {
        this.name = "木叶丸";
    }

    public static Author getInstance() {
        return AUTHOR;
    }
}
