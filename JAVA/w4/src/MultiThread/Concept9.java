package MultiThread;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Anthony Z.
 * @Date 12/7/2022
 * @Description: volatile 不可以替代synchronized
 * 因为volatile不能保证原子性
 * volatile并不能保证多个线程共同修改running变量时
 * 所带来的不一致问题
 * count++
 */
public class Concept9 {
    /*volatile*/ int count = 0;
    void m(){
        for(int i=0; i<10000; i++){
            count++;
        }
    }

    public static void main(String[] args) {
        Concept9 concept9 = new Concept9();
        List<Thread> threads = new ArrayList<>();
        for(int i=0; i<10; i++){
            threads.add(new Thread(concept9::m, "thread-"+i));
        }

        threads.forEach((o)->o.start());
        threads.forEach((o)->{
            try{
                o.join();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        });
        System.out.println(concept9.count);
    }
}
