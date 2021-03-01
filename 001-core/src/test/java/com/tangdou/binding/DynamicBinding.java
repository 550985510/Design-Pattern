package com.tangdou.binding;

/**
 * 动态绑定 运行时多态
 * @author 崔航
 * @date 2021/3/1 14:02
 */
public class DynamicBinding {

    static class Father {
        public void method(){
            System.out.println("This is Father's method");
        }
    }

    static class Son extends Father {
        public void method(){
            System.out.println("This is Son's method");
        }
    }

    static class Daughter extends Father {
        public void method(){
            System.out.println("This is Daughter's method");
        }
    }

    public static void main(String[] args) {
        //动态绑定 在运行期间判断引用对象的实际类型
        //重写就是动态绑定 根据对象的实际类型决定调用哪个方法
        Father son = new Son();
        son.method();

        Father daughter = new Daughter();
        daughter.method();
    }
}
