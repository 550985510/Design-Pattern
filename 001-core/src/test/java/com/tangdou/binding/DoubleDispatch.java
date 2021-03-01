package com.tangdou.binding;

/**
 * 双分派
 * 变量被声明时的类型叫做变量的静态类型(Static Type) 又叫明显类型(Apparent Type)。
 * 变量所引用的对象的真实类型又叫做变量的实际类型(Actual Type)。
 * 根据对象的类型而对方法进行的选择,就是分派(Dispatch)。
 * @author 崔航
 * @date 2021/3/1 14:17
 */
public class DoubleDispatch {

    static class Father {
        void accept(Execute execute) {
            execute.visit(this);
        }
    }

    static class Son extends Father {
        void accept(Execute execute) {
            execute.visit(this);
        }
    }

    static class Daughter extends Father {
        void accept(Execute execute) {
            execute.visit(this);
        }
    }

    static class Execute {
        void visit(Father father) {
            System.out.println("This is Father's method");
        };
        void visit(Son son) {
            System.out.println("This is Son's method");
        };
        void visit(Daughter daughter) {
            System.out.println("This is Daughter's method");
        };
    }

    public static void main(String[] args) {
        //先进行动态分派（动态绑定） 后 进行静态分派（静态绑定）
        //访问者模式就是双分派
        Father father = new Father();
        Father son = new Son();
        Father daughter = new Daughter();

        Execute exe = new Execute();
        father.accept(exe);
        son.accept(exe);
        daughter.accept(exe);
    }
}
