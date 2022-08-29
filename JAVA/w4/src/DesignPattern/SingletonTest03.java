package DesignPattern;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author Anthony Z.
 * @Date 16/6/2022
 * @Description: Double-Check 6 是多线程实际开发中常常的使用的
 * 线程安全，延迟加载，效率较高
 *
 * One thing to keep in mind is that the fields needs to be volatile to
 * prevent cache incoherence issues.
 *
 * Singleton的应用
 * 1. 一台计算机可以连接好几台打印机，
 * 但是计算机上的打印程序通过单例模式来避免两个打印作业同时输出到打印机。
 *
 * 单例模式确保某个类只有一个实例，而且自行实例化并向整个系统提供这个实例。
 * 在计算机系统中，线程池、缓存、日志对象、对话框、打印机、显卡的驱动程序对象常被设计成单例。
 */
public class SingletonTest03 {
    public static void main(String[] args) {
        for(int i=0; i<100; i++){
            new Thread(()->{
                System.out.println(Singleton6.getInstance().hashCode());
            }).start();
        }
    }
}

class Singleton6 {
    /*
    volatile在这里是需要加的，尽管很难出错
    instance = new Singleton6();
    Initialization is the process of assigning
    a value to the variable (declaration is just telling
    the compiler about the existence of an entity in the program)
    1. 给对象申请内存
    2. 给对象的成员变量初始化
    3. 把内容赋值给instance
    在很复杂的并发情形下
    如果有指令重排序，也许一个线程执行了1，然后第二个就认为值已经有了
    直接返回
     */
    private static /*volatile*/ Singleton6 instance;
    private Singleton6(){}

//  加入双重检查代码，解决线程安全问题，同时解决懒加载问题
    public static Singleton6 getInstance(){
        if(instance == null){ // 如果没有这个if，效率会更低
            synchronized (Singleton6.class){
                //只有一个线程可以进入
                if(instance == null){
                    instance = new Singleton6();
                }
            }
        }
        return instance;


    }

    public static void main(String[] args) {
        for(int i=0; i<1000000; i++){
            new Thread(()->{
                System.out.println(Singleton2.getInstance().hashCode());
            }).start();
        }
    }


}

