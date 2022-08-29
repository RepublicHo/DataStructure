package MultiThread;

/**
 * @Author Anthony Z.
 * @Date 13/7/2022
 * @Description:
 * volatile is intended to guarantee that all htreads see the same value of
 * the specific variable.
 * One thread may not see the latest value of a variable changed by
 * another thread due to caching.
 *
 * Example:
 * Main memory: nv = 42
 * Thread 1 writes a value to a non-volatile field nv,
 * which is cached locally in the core for efficiency.
 *
 * When Thread2 subsequently reads the value of field nv,
 * it gets a different result due to caching.
 *
 * However, a volatile variable will always be stored in main memory.
 */
public class Concept8 {
    private static int number;
    private static /*volatile*/ boolean ready;
    /*
    “捎带同步（piggybacking on synchronization）”，
    即，没有特意为result变量的读写设置同步，而是利用了其他同步动作时“捎带”的效果
     */

    private static class Reader extends Thread{
        @Override
        public void run(){
            while(!ready){
                Thread.yield();
            }
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        /*
        It creates a thread that spins on the ready variable
        as long as it's false;
        When the variable becomes true, the thread will print the number.

        We may expect this program to simply print 42 after a
        short delay. However, the delay may be much longer, or even
        hang forever, or even print 0.
    The details of initialization:
    1. 给对象申请内存,
    2. 给对象的成员变量初始化
    3. 把内容赋值给instance
        The case of these anomalies反常现象 is the lack of
        proper memory visibility and reordering.
         */
        for(int i=0; i<10000; i++){
            new Reader().start();
    //        new Thread(()->{
    //            number = 42;
    //            ready = true;
    //        }).start();

            number = 42;
            ready = true;
        }
    }
}
