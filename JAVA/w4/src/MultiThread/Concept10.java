package MultiThread;

import java.util.concurrent.TimeUnit;

/**
 * @Author Anthony Z.
 * @Date 13/7/2022
 * @Description: 锁粒度 Fine(细) Coarse(粗) Lock
 * Coarse-grained locking: Poor concurrency
 * Fine-grained locking: Need to know which one and which order to acquire
 *
 * Start with coarse-grained locking
 * Refine the granularity as contention arises
 *
 * 但是也
 */
public class Concept10 {
    int count = 0;

    synchronized void m1(){
        try{
            TimeUnit.SECONDS.sleep(2);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        //业务逻辑中只有下面这句需要sync, 这时候不应该给整个方法上锁
        count++;
        try{
            TimeUnit.SECONDS.sleep(2);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    void m2(){
        try{
            TimeUnit.SECONDS.sleep(2);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        // 采用fine-grained locking细粒度的锁，
        // 可以是线程争用时间变短，从而提高效率
        synchronized (this){
        count++;
        }

        try{
            TimeUnit.SECONDS.sleep(2);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }


}
