package MultiThread;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author Anthony Z.
 * @Date 1/6/2022
 * @Description: 99%的实际开发问题都可以用生产者-消费者解决
 * 可以解决大部分的并发问题
 *
 * Producer and Consumer are two separate processes, sharing a common buffer or queue.
 * Producer continuously produces certain data and pushes it onto the buffer,
 * whereas the consumer consumes those data from the buffer.
 *
 * ------------------------------------
 * 1. Both may try to update the queue at the same time, probably leading to data loss or inconsistencies.
 * 2. Producers might be slower than consumer. In such cases, the consumer may wait.
 *
 */
public class PCproblem {

}

class Producer extends Thread{

    private Buffer buffer;

    Producer(Buffer buffer){
        this.buffer = buffer;
    }

    @Override
    public void run() {
        int i = 20;
        while(i >= 0){
            try{
                synchronized (buffer){
                    if(buffer.isFull()) buffer.wait();

                    buffer.addElement(i + "");
                    buffer.notify();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                i--;
            }
        }
    }
}

class Consumer implements Runnable{
    private Buffer buffer;

    Consumer(Buffer buffer){
        this.buffer = buffer;
    }


    @Override
    public void run() {
        String ele = "";
        while(ele.equals("0")){
            try{
                synchronized (buffer){
                    if(buffer.isEmpty()){
                        buffer.wait();
                    }

                    ele = buffer.getElement();
                    buffer.popElement();
                    buffer.notify();
                    System.out.println("Consumer: " + ele);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Buffer{

    private List<String> storage;
    private int capacity;

    Buffer(int capacity){
        if(capacity < 0){
            throw new IllegalArgumentException();
        }
        this.storage = new LinkedList<>();
        this.capacity = capacity;
    }

    boolean isEmpty(){ return storage.isEmpty(); }
    boolean isFull(){ return storage.size() == capacity; }

    String getElement(){
        if(this.isEmpty()){
            throw new IllegalStateException();
        }
        return storage.get(0);
    }

    void popElement(){
        if(isEmpty()){
            throw new IllegalStateException();
        }

        storage.remove(0);
    }

    void addElement(String s){
        if(isFull()){
            throw new IllegalStateException();
        }

        storage.add(s);
    }
}