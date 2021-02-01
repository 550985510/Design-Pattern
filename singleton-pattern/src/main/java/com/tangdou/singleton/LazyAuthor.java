package com.tangdou.singleton;

import lombok.Getter;
import org.springframework.util.ObjectUtils;

import java.util.concurrent.atomic.AtomicReference;

/**
 * 懒汉模式单例
 * @author 崔航
 * @date 2021/2/1 11:25
 */
@Getter
public class LazyAuthor {

    private final String name;

    private static LazyAuthor AUTHOR;

    private LazyAuthor() {
        this.name = "木叶丸";
    }

    /**
     * 非线程安全
     * @return 单例对象
     */
    public static LazyAuthor getInstance() {
        if (ObjectUtils.isEmpty(AUTHOR)) {
            AUTHOR = new LazyAuthor();
        }
        return AUTHOR;
    }

    /**
     * 线程安全
     * @return 单例对象
     */
    public synchronized static LazyAuthor getInstanceSecured() {
        if (ObjectUtils.isEmpty(AUTHOR)) {
            AUTHOR = new LazyAuthor();
        }
        return AUTHOR;
    }

    private static class SingletonHolder {
        private static final LazyAuthor LAZY_AUTHOR = new LazyAuthor();
    }

    /**
     * 线程安全（推荐使用）
     * @return 单例对象
     */
    public static LazyAuthor getInstanceByNestedClass() {
        return SingletonHolder.LAZY_AUTHOR;
    }

    private static final AtomicReference<LazyAuthor> INSTANCE = new AtomicReference<>();

    /**
     * 线程安全
     * 利用cas实现单例
     * @return 单例
     */
    @SuppressWarnings("all")
    public static LazyAuthor getInstanceByCas() {
        for(;;) {
            LazyAuthor author = INSTANCE.get();
            if (!ObjectUtils.isEmpty(author)) {
                return author;
            }
            INSTANCE.compareAndSet(null, new LazyAuthor());
            return INSTANCE.get();
        }
    }
}
