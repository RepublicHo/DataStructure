package MultiThread;

/**
 * @Author Anthony Z.
 * @Date 2/6/2022
 * @Description: https://www.baeldung.com/java-volatile
 *
 * Processors are responsible for executing program instructions. Therefore,
 * they need to retrieve both program instructions and required data from RAM.
 *
 * As CPUs are capable of carrying out a significant number of
 * instructions per second, fetching from RAM is not ideal for them.
 * To improve the situation, processors are using tricks like caching.
 *
 *
 */
public class Concept3 extends Thread{
    private /*volatile*/ int count = 100;

    @Override
    public /*synchronized*/ void run() {
        // 加了synchronized就不要加volatile了
        count--;
        System.out.println(Thread.currentThread().getName() + " 2 count= " + count);
    }

    public static void main(String[] args) {
        Concept3 ins = new Concept3();
        for (int i=100; i>0; i--){
            new Thread(ins, "Thread" + i).start();
        }
    }
}
