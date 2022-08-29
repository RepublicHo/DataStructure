package MultiThread;

/**
 * @Author Anthony Z.
 * @Date 25/5/2022
 * @Description:
 *
 * synchronized 关键字：
 *
 * https://www.baeldung.com/java-concurrency
 *
 * In a multi-threaded environment, a race condition occurs
 * when two or more threads attempt to update mutable shared
 * data at the same time.
 *
 * Java offers a mechanism to avoid race conditions by synchronizing
 * thread access to shared data. the synchronized keyword makes
 * the operation thread-safe.
 *
 * A piece of logic, marked with synchronized becomes a synchronized
 * block, allowing only a thread to execute at a time.
 */
public class Concept2{
    private static int count = 10000;
    private static Object o =new Object();

    public static void m1(){
        synchronized (o){ // 任何线程要执行下面的代码，必须拿到o的锁
            for(int i=0; i<100000; i++){
                count--;
                System.out.println(Thread.currentThread().getName() + " 1 count= " + count);
            }

        }
    }

    public static void m2(){
        synchronized (o){
            for(int i=0; i<100000; i++){
                count++;
                System.out.println(Thread.currentThread().getName() + " 2 count= " + count);
            }
        }
    }

    public static void main(String[] args) {

        new Thread(Concept2::m1).start();
        new Thread(Concept2::m2).start();
    }


}
