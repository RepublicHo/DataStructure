package DesignPattern;

/**
 * @Author Anthony Z.
 * @Date 23/6/2022
 * @Description:
 */
public class SingletonTest04 {
}


/**
 * Difference Between Static
 * and Non-Static Nested Class in Java
 *
 *
 *  There are two kinds of classes in Java, one is called a top-level class
 *  and the other is called a nested class.As the name suggested top-level class is
 *  a class that is declared in ‘.java’ file. On the other hand, a nested class is declared inside another class.
 *  The class which enclosed nested class is known as Outer class.In the Java programming language, you can not
 *  make a top-level class static. You can only make nested classes either static or non-static.
 *  详情看NestedClass
 *
 *  静态内部类（推荐使用）
 *  1. 采用了类装载的机制来保证初始化实例只有一个线程
 *  2.
 *
 *
 */
class Singleton7{
    private static volatile Singleton7 instance;
    private Singleton7(){}
    private static class SingletonInstance{
        private static final Singleton7 INSTANCE = new Singleton7();
    }

}