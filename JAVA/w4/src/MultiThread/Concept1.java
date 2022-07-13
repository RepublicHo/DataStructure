package MultiThread;

/**
 * @Author Anthony Z.
 * @Date 13/5/2022
 * @Description:
 * 拿到好工资，就得上天入地 底层的东西
 * 1. The difference between Thread and process
 * Three ways to create a thread
 * 三种启动线程的方式
 * 1. 从Thread 继承
 * 2. 实现runnable接口
 * 3. 通过线程池来启动 （其实还是）
 *
 * When we extends Thread class, we can't extend any other class.
 *
 */
public class Concept1 {

    static class MyThread extends Thread{
        public void run(){

            System.out.println("Hello World from 1");
        }
    }

    static class MyRun implements Runnable{

        @Override
        public void run() { //

            System.out.println("Hello World from 2");
        }
    }

    static void testJoin(){
        Thread t1 = new Thread(()->{
            for(int i=0; i<10; i++){
                System.out.println("A"+i);
                try{
                    Thread.sleep(500);
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(()->{
//           try {
//               t1.join(); // 用于等待另一个线程的结束
               System.out.println("Hello from t2");
//           } catch (InterruptedException e) {
//               e.printStackTrace();
//           }
        });

        t1.start();
        t2.start();

    }

    public static void main(String[] args) {

        testJoin();
//        new MyThread().start(); // 调用的是start不是run
//        new Thread(new MyRun()).start(); // 跟Thread不一样
//        new Thread(() ->{
//            System.out.println("Hello World from 3");
//        }).start(); // Lambda

//        new Thread(()->{
//            for(int i=0; i<100; i++){
//                System.out.println("A" + i);
//                try{
//                    Thread.sleep(500); // sleep for 500 ms
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }).start();

//      yield就是线程先从CPU上先离开一下，进入等待队列，但是事实上没什么大用，因为在等待队列依然可能被执行
//        new Thread(()->{
//            for(int i=0; i<100; i++){
//                System.out.println("--------B" + i);
//                if(i%10 == 0){
//                    Thread.yield();
//                }
//            }
//        }).start();


    }

}
