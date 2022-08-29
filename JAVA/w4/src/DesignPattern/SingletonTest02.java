package DesignPattern;

/**
 * @Author Anthony Z.
 * @Date 16/6/2022
 * @Description: 懒汉式
 */
public class SingletonTest02 {
    public static void main(String[] args) {
        for(int i=0; i<100; i++){
            new Thread(()->{
                System.out.println(Singleton3.getInstance().hashCode());
            }).start();
        }



    }

}

// 懒汉式（线程不安全）
class Singleton3 {

    private static Singleton3 instance;
    private Singleton3() {}

    // 提供一个静态的公有方法，当使用这个方法时，才去创建instance
    // 起到Lazy Loading的效果，但是只能在单线程下使用
    // 如果多线程，一个线程进入 if(singleton == null)判断语句块，还未来得及
    // 往下执行，另一个线程也通过了这个判断语句，这是便会产生多个instance
    // 在实际开发中，不会使用这种方式
    public static Singleton3 getInstance(){
        if(instance == null){
            try{
                Thread.sleep(1);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            instance = new Singleton3();
        }

        return instance;
    }

}

// 懒汉式（线程安全） 加入同步处理的代码
class Singleton4{
    private static Singleton4 instance;
    private Singleton4(){}

    // 加入synchronized
    // 效率低 每一次都要同步 效率太低
    // 实际开发中不推荐
    public static synchronized Singleton4 getInstance(){
        if(instance == null){
            instance = new Singleton4();
        }

        return instance;
    }
}

class Singleton5 {
    private static Singleton5 instance;
    private Singleton5(){

    }

    // 同步代码块
    // 这种写法是错的 把synchronized放在那边
    // 只要进入if 还是线程不安全
    public static Singleton5 getInstance() {
        if(instance == null){
            synchronized (Singleton5.class){
                instance = new Singleton5();
            }
        }
        return instance;
    }


}