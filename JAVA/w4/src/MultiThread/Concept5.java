package MultiThread;

import java.util.concurrent.TimeUnit;

/**
 * @Author Anthony Z.
 * @Date 12/7/2022
 * @Description: 可重入属性
 * https://www.zhihu.com/question/23284564
 */
public class Concept5 {
    synchronized void m(){
        System.out.println("m starts");

        try{

            TimeUnit.SECONDS.sleep(4);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("m ends");
    }

    public static void main(String[] args) {
        new Concept6().m();
    }
}

class Concept6 extends Concept5{
    @Override
    synchronized void m(){
        System.out.println("child m starts");
        super.m();
        System.out.println("child m ends");
    }
}