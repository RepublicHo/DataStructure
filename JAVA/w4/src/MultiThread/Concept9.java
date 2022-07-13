package MultiThread;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Anthony Z.
 * @Date 12/7/2022
 * @Description:
 */
public class Concept9 {
    volatile int count = 0;
    void m(){
        for(int i=0; i<10000; i++){
            count++;
        }
    }

    public static void main(String[] args) {
        Concept9 concept8 = new Concept9();
        List<Thread> threads = new ArrayList<>();
        for(int i=0; i<10; i++){

        }
    }
}
