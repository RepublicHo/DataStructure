package DesignPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Anthony Z.
 * @Date 27/6/2022
 * @Description: Strategy Pattern 策略模式
 * 将定义的算法家族，
 *
 * 可以避免多重分支的if-else和switch语句
 *
 * In strategy, a class behavior or its algorithm can be changed at run time.
 *
 *
 *
 */
public class SP {
}

class Receipt{
    /**
     * 回执信息
     */
    String message;
    /**
     * 回执类型
     */
    String type;
}

class ReceiptBuilder{
//    public static List<Receipt> generateReceiptList(){
//        List<Receipt> receiptList = new ArrayList<>();
//        receiptList.add(new Receipt(("我是MT2101回执喔", "MT2101"));
//        return null;
//    }
}
class Test{
    public static void main(String[] args) {
        String promotion = "EMPTY";

    }
}

interface IReceiptHandleStrategy{
    void handleReceipt(Receipt receipt);
}

class Mt2101ReceiptHandleStrategy implements IReceiptHandleStrategy{

    @Override
    public void handleReceipt(Receipt receipt) {
//        System.out.println("解析报文MT2101: " + receipt.get);
    }
}