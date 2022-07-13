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
 *  2. JVM装载类（类的初始化）是安全的
 *
 * 1. 单例模式保证了系统内存中该类只存在一个对象，节省了系统资源，
 * 对于一些需要频繁创建和消费的对象，使用单例可以提高系统性能
 *
 * 2. 当实例化一个单例类的时候，必须要记住使用相应的获取方法
 * 的对象，而不是使用new
 *
 * 单例模式的使用场景：需要频繁进行创建和消费的对象
 *
 */
class Singleton7{
//    private static volatile Singleton7 instance;
    private Singleton7(){}
    private static class SingletonInstance{
        private static final Singleton7 INSTANCE = new Singleton7();
    }

    public static Singleton7 getInstance(){
        return SingletonInstance.INSTANCE;
    }

}