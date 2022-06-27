package MultiThread;

/**
 * @Author Anthony Z.
 * @Date 1/6/2022
 * @Description:
 *
 *
 * execute方法的实现
 *
 * 1. 当线程池的线程数小于coePoolSize核心线程数,
 * 则通过threadFactory创建一个新的线程，则把入参中的任务作为第一个任务传入该线程
 *
 * 2. 如果当前线程池中线程数已经达到corePoolSize, 那么则会通过
 * 阻塞队列workerQueue的offer方法来将任务添加到线程中保存，并等待线程空闲后进行执行
 *
 * 3. 如果线程数已经达到了corePoolSize且阻塞队列中无法插入该任务（比如已满），
 * 那么线程池就会再增加一个线程来执行该任务，除非线程数已经达到了最大线程数maximumPoolSize；
 *
 * 4. 如果确实已经达到了最大线程数，那么就会通过拒绝策略对象handler拒绝这个任务。
 *
 *
 * 超时时间
 * 当
 */
public class ThreadPoolTest1 {
}
