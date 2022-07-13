package MultiThread;

/**
 * @Author Anthony Z.
 * @Date 2/6/2022
 * @Description:
 */
public class Concept4 extends Thread{

    public void m1(){
        System.out.println(Thread.currentThread().getName() + " m1 starts");
        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " m1 ends");
    }

    public void m2(){
        System.out.println(Thread.currentThread().getName() + " m2 starts");
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " m2 ends");
    }
    public static void main(String[] args) {

        Concept4 concept4 = new Concept4();

//       这样就智能一前一后
//        concept4.m1();
//        concept4.m2();


        new Thread(concept4::m1, "t1").start();
        new Thread(concept4::m2, "t2").start();
    }
}
