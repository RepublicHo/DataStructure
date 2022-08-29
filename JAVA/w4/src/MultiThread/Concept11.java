package MultiThread;

import java.util.concurrent.TimeUnit;

/**
 * @Author Anthony Z.
 * @Date 13/7/2022
 * @Description:
 *
 */
public class Concept11 {
    final Object o = new Object();
    void m(){
        synchronized (o){
            while(true){
                try{
                    TimeUnit.SECONDS.sleep(1);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName());
            }
        }
    }

    public static void main(String[] args) {
        Concept11 concept11 = new Concept11();
        // 启动第一个线程
        new Thread(concept11::m, "t1").start();
        try{
            TimeUnit.SECONDS.sleep(3);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        // 创建第二个线程
        Thread t2 = new Thread(concept11::m, "t2");
// 如果写了final 就避免这种改变发生
//        concept11.o = new Object();
        // 锁对象发生改变，所以t2线程得以执行，
        // 如果注释这句话，线程2永远没机会执行
        t2.start();


    }
}
