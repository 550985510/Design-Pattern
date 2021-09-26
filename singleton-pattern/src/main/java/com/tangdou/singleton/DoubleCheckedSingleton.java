package com.tangdou.singleton;

/**
 * @author 崔航
 * @date 2021/9/26 18:23
 */
public class DoubleCheckedSingleton {

    /**
     * volatile 作用
     * 1.防止指令重排序
     * 2.线程修改实例后应该放入主存 而不是寄存器或高速缓冲区 保证新的值对其他线程可见
     */
    private volatile static Author singleton;

    public static Author getSingleton() {
        if (singleton == null) {
            //这里对任何一个类加锁都可以 为了让线程获取锁后进入临界区
            //可以写Author.class 但不是对实例加锁 因为还没有生成
            synchronized (DoubleCheckedSingleton.class) {
                if (singleton == null) {
                    //第二次判断 避免多线程多次实例化
                    singleton = new Author();
                }
            }
        }
        return singleton;
    }

    public static class Author {

    }
}
