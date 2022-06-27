package DesignPattern;

/**
 * @Author Anthony Z.
 * @Date 16/6/2022
 * @Description: Singleton Pattern
 *
 * Primary purpose:
 * To restrict the limit of the numbe rof object creation to only one.
 * so that
 * 即保证类的实例化对象仅有一个，并且提供一个访问它的全局访问点
 *
 * Remember that the key points while defining class as a singleton class is:
 * 1. Make a constructor private.
 * 2. Write a static method that has the return type object of this singleton class.
 *
 * 设计模式的本质是 提高软件的维护性、通用性和扩展性，并降低软件的复杂度
 *
 * 饿汉式（静态变量）：这种单例模式可用，但可能造成内存的的浪费
 *
 * Advantage: 在类装载的时候完成实例化，避免了线程同步的问题
 * 基于类装载的方式，避免了多线程的同步问题。
 * 不过，instance在类装载时就实例化，在单例模式中大部分都是调用getInstance方法
 *
 * Disadvantage: 在类装载的时候就完成了实例化，没有达到Lazy Loading的效果，如果
 * 从未使用过这个实例，这会造成内存的浪费
 *
 *
 */
public class SingletonTest01 {

    public static void main(String[] args) {
        Singleton1 instance1 = Singleton1.getInstance();
        Singleton1 instance2 = Singleton1.getInstance();
        System.out.println(instance2 == instance1);
        System.out.println(instance2.hashCode() == instance1.hashCode());
    }

}

// 饿汉式的第一种写法
class Singleton1{

//  1. 构造器私有化，外部能new
    private Singleton1(){

    }
//  2. 在本类内部创建对象实例
    private final static Singleton1 instance = new Singleton1();

//  3. 提供一个公有的静态方法，返回实例对象
    public static Singleton1 getInstance(){
        return instance;
    }
}


// 饿汉式的第二种写法
class Singleton2{

    private Singleton2(){

    }
    private static Singleton2 instance;

//  在静态代码块中，创建单例对象
    /*
    在类装载的时候，就执行静态代码块中的代码，和上面一个优缺点一样
     */
    static{
        instance = new Singleton2();
    }

    public static Singleton2 getInstance(){
        return instance;
    }
}