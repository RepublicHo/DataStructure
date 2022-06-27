package MultiThread;

/**
 * @Author Anthony Z.
 * @Date 16/6/2022
 * @Description: https://www.geeksforgeeks.org/implement-runnable-vs-extend-thread-in-java/#:~:text=The%20significant%20differences%20between%20extending,class%20in%20future%20or%20now.
 */
public class Diff1 {
}

class Greeks {
    static void m1(){
        System.out.println("Hello Visitors");
    }
}

class Test1 extends Greeks implements Runnable{
    @Override
    public void run() {
        System.out.println("Run method executed by child Thread");
    }

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.m1();

        Thread t1 = new Thread(test1);
        t1.start();
        System.out.println("Main method executed by main thread");
    }
}