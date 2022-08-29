package MultiThread;

import java.util.concurrent.TimeUnit;

/**
 * @Author Anthony Z.
 * @Date 12/7/2022
 * @Description: Volatile ensures the changes to a variable
 * 1. 保证线程可见性 consistently visible to other threads atomically
 * 2. 禁止指令重排序 volatiles reads/writes cannot be reordered.
 * which is, reads & writes go directly to main memory (not registers/cache)
 * to avoid read/write conflicts on java fields storing shared mutable data.
 *
 * Java compiler automatically transform reads & writes on a volatile variable into
 * atomic acquire & release pairs.
 *
 * When a concurrent program is not written correctly,
 * the errors tend to fall into three categories:
 * 1. atomicity
 * 2. visibility
 * 3. ordering
 *
 * 看Singleton的double check
 */
public class Concept7 {
    boolean running = true;
    int num = 23;
    void m(){
        System.out.println("m starts");
        System.out.println(num);
        while(running){
//            try{
//                TimeUnit.MILLISECONDS.sleep(10);
//            }catch (InterruptedException e){
//                e.printStackTrace();
//            }
        }
        System.out.println(num);
        System.out.println("m ends");
    }

    public static void main(String[] args) {
        Concept7 concept7 = new Concept7();
        new Thread(concept7::m, "t1").start();

        try{
            TimeUnit.SECONDS.sleep(1);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        concept7.running = false;
        concept7.num = 2;
    }
}
