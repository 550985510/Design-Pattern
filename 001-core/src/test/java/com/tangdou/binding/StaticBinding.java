package com.tangdou.binding;

/**
 * 静态绑定 编译时多态
 * @author 崔航
 * @date 2021/3/1 14:07
 */
public class StaticBinding {

    static class Father {}
    static class Son extends Father {}
    static class Daughter extends Father {}

    static class Execute {
        public void method(Father father){
            System.out.println("This is Father's method");
        }

        public void method(Son son){
            System.out.println("This is Son's method");
        }

        public void method(Daughter daughter){
            System.out.println("This is Daughter's method");
        }
    }

    public static void main(String[] args) {
        //静态绑定 在编译时确定要执行的方法
        //重载就是静态绑定 根据对象的静态类型决定调用哪个方法
        //强转转的是静态类型
        Father father = new Father();
        Father son = new Son();
        Father daughter = new Daughter();

        Execute exe = new Execute();
        exe.method(father);
        exe.method(son);
        exe.method(daughter);
    }
}
