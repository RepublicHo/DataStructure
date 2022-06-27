package DesignPattern;

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

}

class Singleton6 {
    private static volatile Singleton6 instance;
    private Singleton6(){}

//  加入双重检查代码，解决线程安全问题，同时解决懒加载问题
    public static Singleton6 getInstance(){
        if(instance == null){
            synchronized (Singleton6.class){
                if(instance == null){
                    instance = new Singleton6();
                }
            }
        }
        return instance;
    }


}

