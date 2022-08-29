package MultiThread;

import java.util.concurrent.CountDownLatch;

/**
 * @Author Anthony Z.
 * @Date 13/7/2022
 * @Description: Compare and Swap (CAS) 比较并替换
 *
 * 和之前的volatile讲解的一样，volatile只能保证visibility, 无法保证atomicity.
 *
 * https://zhuanlan.zhihu.com/p/34556594
 * https://mp.weixin.qq.com/s?__biz=MzUxNjgzODM1NQ==&mid=2247484311&idx=1&sn=78f3eeefc3cd25aff42ea85096b8fb07&chksm=f9a0052bced78c3d627f4c0643c38fe09d1650e9e6bdd0ae316107d75f0d67504395ceba9cba&scene=21#wechat_redirect
 * https://xie.infoq.cn/article/cf4d6ed572f96b36b0e9a52c7
 *  */
public class Concept21 {
    public static volatile int race = 0;
    private static final int THREADS_COUNT = 20;
    private static CountDownLatch countDownLatch = new CountDownLatch(THREADS_COUNT);

    public static void increase(){race++;}

    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[THREADS_COUNT];
        for(int i=0; i<THREADS_COUNT; i++){
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    for(int i=0; i<10000; i++){
                        increase();
                    }
                    countDownLatch.countDown();
                }
            });
            threads[i].start();
        }
        // 得用debug，否则会进入死循环
//        while(Thread.activeCount()>1){
//            Thread.yield();
//        }
        countDownLatch.await();

        System.out.println(race);
    }
}
