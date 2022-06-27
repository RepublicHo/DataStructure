package MultiThread;

/**
 * @Author Anthony Z.
 * @Date 15/6/2022
 * @Description:
 *
 * synchronized的三种应用方式
 * synchronized关键字最主要有以下3种应用方式，下面分别介绍
 *
 * 1. 修饰实例方法，作用于当前 实例 加锁，进入同步代码前要获得当前实例的锁
 *
 * 2. 修饰静态方法，作用于当前 类 对象加锁，进入同步代码前要获得当前类对象的锁
 *
 * 3. 修饰代码块，指定加锁对象，对给 定对象 加锁，进入同步代码库前要获得给定对象的锁。
 *
 *
 * 联系数据库：在事务并发操作时，可能出现的问题有：
 * 脏读：(读取未提交的数据) transaction A读到了Transaction B更新了但是未提交的数据，然后Transaction B由于某种错误发生rollback,
 * 那么transaction A读到的就是脏数据
 *
 * 幻读 (两次读取的记录数量不同) Transaction A在Transaction B提交前读取的结果可能和提交后读到的结果不同
 * phantom problem 这个不能像不可重复读通过加锁解决。因为对于新增的记录根本无法加锁。需要将事务串行化
 *
 * Read Uncommitted：最低的隔离级别，什么都不需要做，一个事务可以读到另一个事务未提交的结果。所有的并发事务问题都会发生。
 * Read Committed：只有在事务提交后，其更新结果才会被其他事务看见。 可以解决脏读问题。
 * Repeated Read：在一个事务中，对于同一份数据的读取结果总是相同的，无论是否有其他事务对这份数据进行操作，以及这个事务是否提交。 可以解决脏读、不可重复读。
 * Serialization：事务串行化执行，隔离级别最高，牺牲了系统的并发性。 可以解决并发事务的所有问题。
 *
 */
public class SynTest2 implements Runnable{

    static int i = 0;

    public synchronized void increase(){i++;}
    @Override
    public void run() {
        for(int i=0; i<10000; i++){
            increase();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        SynTest2 synTest2 = new SynTest2();
        Thread t1 = new Thread(synTest2); // 相同对象的锁
        Thread t2 = new Thread(synTest2);

        /*
        * 两个线程操作同一个共享资源 variable i.
        * 由于i++操作并不具备原子性，该操作先读取值，然后写回一个新值，相当于分两步完成
        *
        * 如果第二个Thread在第一个Thread读取旧值和写回新值的期间读取i的域值，
        * 那么两个Thread会看到一样的值，造成线程安全失败。
        *
        * 因此对于increase方法必须使用synchronized修饰，以便保证线程安全。\
        * 当一个线程正在访问一个对象的synchronized方法，其它对象就无法访问synchronized 实例方法
        *
        *
        *倘若我们没有使用synchronized关键字，其最终输出结果就很可能小于2000000，这便是synchronized关键字的作用。
        *
        * */

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(i);

    }
}
