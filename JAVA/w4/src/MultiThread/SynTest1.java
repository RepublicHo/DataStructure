package MultiThread;

/**
 * @Author Anthony Z.
 * @Date 1/6/2022
 * @Description:
 *
 *
 * In the multithreading concept, multiple threads try to access
 * the shared resources at a time, which may produce inconsistent results.
 *
 * Synchronization in Java is the capacity to control the access of multiple
 * threads to any shared resources. It's necessary for reliable communication between
 * threads.
 *
 * Synchronization is classified into two types.
 *
 * 1. Process synchronization
 * The process is nothing but a program under execution. It is isolated
 * from other processes. The memory and others, are allocatred to
 * process by the OS.
 *
 * 2. Thread synchronization
 * 2.1 Mutual Exclusive
 * A Mutex or Mutual Exclusive helps only one thread to access the shared resources.
 * It won’t allow the accessing of shared resources at a time.
 * It can be achieved in the following ways.
 *
 * Synchronized Method
 * Synchronized block
 * Static Synchronization
 *
 * 2.2 Cooperation.  (Inter Thread Communication in java)
 */
public class SynTest1 {

    private int count = 10;
    private Object o = new Object();

    public void m(){
        synchronized (o){ // 任何程序要执行下面的代码，对count进行访问的时候，我们把o锁起来
            count--;
            System.out.println(Thread.currentThread().getName() +
                    " count = " + count);
        }
    }

    public static void main(String[] args) {
        SynTest1 synTest1 = new SynTest1();
        synTest1.m();
    }
}
