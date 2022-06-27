package MultiThread;

/**
 * @Author Anthony Z.
 * @Date 1/6/2022
 * @Description: the volatile keyword.
 *
 *
 * For multithreaded applications, we need
 * to ensure a couple of rules for consistent behavior:
 *
 * Mutual Exclusion - only one thread executes a critical section at a time.
 * Visibility - changes made by one thread to the shared data are visible to
 * other threads to maintain data consistency.
 *
 * volatile is quite a useful keyword because it can help ensure the visibility
 * aspect of the data change without, providing mutual exclusion.
 *
 * Technically, any write to a volatile field happens before every
 * subsequent read of the same field.
 *
 */
public class TaskRunner {

    private static int number;
    private static boolean ready;

    private static class Reader implements Runnable{
        @Override
        public void run() {
            while(!ready){
                Thread.yield();

            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        new Thread(new Reader()).start();
        number = 42;
        ready = true;
    }
}
