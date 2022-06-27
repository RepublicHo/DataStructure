package ProducerConsumerProblem;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author Anthony Z.
 * @Date 2/6/2022
 * @Description:
 */
public class DataQueue {
    private final Queue<Message> queue = new LinkedList<>();
    private final int maxSize;
    private final Object FULL_QUEUE = new Object();
    private final Object EMPTY_QUEUE = new Object();

    DataQueue(int maxSize){
        this.maxSize = maxSize;
    }

    /**
     * If the queue is empty, the consumer waits on the EMPTY_QUEUE object.
     * @throws InterruptedException
     */
    public void waitOnEmpty() throws InterruptedException{
        synchronized (EMPTY_QUEUE){
            EMPTY_QUEUE.wait();
        }
    }

    public void notifyAllForEmpty(){
        synchronized (EMPTY_QUEUE){
            EMPTY_QUEUE.notify();
        }
    }


    public void waitOnFull() throws InterruptedException{
        synchronized (FULL_QUEUE){
            FULL_QUEUE.wait();
        }
    }

    public void notifyAllForFull(){
        synchronized (FULL_QUEUE){
            FULL_QUEUE.notifyAll();
        }
    }
}
