package Generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Anthony Z.
 * @Date 5/6/2022
 * @Description:
 *
 * 异常类不可以用泛型
 * static method也不可以用泛型
 */
public class Order<T> {
    String orderName;
    int orderId;

    T orderT;

    public Order(){};

    /**
     * 类的构造器 不用写<T>
     * @param name
     * @param orderId
     * @param orderT
     */
    public Order(String name, int orderId, T orderT){
        this.orderName = name;
        this.orderId = orderId;
        this.orderT = orderT;
    }

    public void setOrderT(T t){
        this.orderT = t;
    }

    /**
     * 这个方法不可以称作泛型方法
     * 要在方法中出现泛型的结构，泛型的参数和类的泛型参数没有任何关系
     * @return
     */
    public T getOrderT() {
        return orderT;
    }

    /**
     * 泛型方法，和其所属的类是不是泛型类，没有任何关系
     * @param arr
     * @return
     * @param <E>
     */
    public <E> List<E> copyFromArray2List(E[] arr){
        ArrayList<E> list = new ArrayList<>();
        for(E e:arr){
            list.add(e);
        }
        return list;
    }
}

class class1{
    public void test1(){
        Order order = new Order();
        /**
         * if we define the generics class, but we don't specify it
         * the type is Object by default.
         *
         * 如果大家定义了类是带泛型的，建议要在实例化时指明类的泛型。
         */
        order.setOrderT(123);
        order.setOrderT("abc");

        /**
         * 要带上泛型
         */
        Order<String> order2 = new Order<>();
        order2.setOrderT("anc");
    }


}


/**
 * 实际开发的过程中，可能在extends的时候specify the type
 */
class SubOrder1 extends Order<Integer>{

}

/**
 * 也可能在extends的时候不specify the type
 * 要用泛型就一直用，一路上都要用
 */

class SubOrder2<T> extends Order<T>{
    public void test4(){
        Order<T> order = new Order<>();
        Integer[] arr = new Integer[]{1, 2, 3};
        List<Integer> list = order.copyFromArray2List(arr);
        System.out.println(list);
    }

    public static void main(String[] args) {
        SubOrder2 subOrder2 = new SubOrder2();
        subOrder2.test4();
    }

}