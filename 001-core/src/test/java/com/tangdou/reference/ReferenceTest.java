package com.tangdou.reference;

import java.lang.ref.WeakReference;

/**
 * 1.强引用：StrongReference引用指向对象，gc运行时不回收。
 * 2.软引用：SoftReference，gc运行时可能回收（jvm内存不够时）。
 * 3.弱引用：WeakReference，gc运行时立即回收。
 * 4.虚引用:PhantomReference，类似于无引用，主要用于跟踪对象被回收的状态，不能单独使用，必须与引用队列
 * @author 崔航
 * @date 2020/10/12 10:47
 */
public class ReferenceTest {

    public static void main(String[] args) {
        //字符串常量池中的对象不能回收
        String str = "我是一个常量池中的字符串";
        //新建String对象（堆） 指向常量池中的 "我是一个在堆中的字符串"
        String str2 = new String("我是一个在堆中的字符串");
        //弱引用管理对象
        WeakReference<String> weakReference = new WeakReference<>(str);
        WeakReference<String> weakReference2 = new WeakReference<>(str2);
        System.out.println("gc运行前: " + weakReference.get());
        System.out.println("gc运行前: " + weakReference2.get());
        //断开引用
        str = null; str2 = null;
        //通知回收
        System.gc();
        System.runFinalization();
        System.out.println("gc运行后: " + weakReference.get());
        System.out.println("gc运行后: " + weakReference2.get());
    }
}
