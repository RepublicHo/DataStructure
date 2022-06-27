package ProducerConsumerProblem;

/**
 * @Author Anthony Z.
 * @Date 2/6/2022
 * @Description:
 */
public class Producer extends Thread{
    private final DataQueue dataQueue;
    private volatile boolean runFlag;

    public Producer(DataQueue dataQueue){
        this.dataQueue = dataQueue;
        runFlag = true;
    }

    @Override
    public void run() {
        produce();
    }

    public void produce(){
        while(runFlag){
            
        }
    }
}


