package ListSetMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author Anthony Z.
 * @Date 29/5/2022
 * @Description: list和set有共同的父类collection
 *
 * List接口，存储有序，可重复的数据，是动态的
 * 1. ArrayList: List的主要实现类线程不安全，Search效率高，
 * 底层使用Object[]存储
 * 它可以在ArrayList的管理下插入数据时按需动态扩容、数据拷贝等操作。
 *
 * 2. Vector: 线程安全，效率低，是list接口的古老实现类，底层使用Object[]存储
 * In practice, we rarely use it.
 *
 * 3. LinkedList: 对于频繁的插入，删除操作才效率高，底层用双向链表存储
 *
 *
 */
public class ListTest1 {
    static void arrayListTest1(){
        // we can set initial capacity
        List<Integer> arrayList1 = new ArrayList<>(2);
        arrayList1.add(2);
        arrayList1.add(3);
        
    }
    static void arrayListTest2(){
        /*
        Arrays是一个工具包，里面还有一些非常好用的方法，
        例如；二分查找Arrays.binarySearch、排序Arrays.sort等

        Arrays.asList 构建的集合，不能赋值给 ArrayList
        Arrays.asList 构建的集合，不能再添加元素
        Arrays.asList 构建的集合，不能再删除元素

        这两个List压根不同一个东西，而且Arrasys下的List是一个私有类，
        只能通过asList使用，不能单独创建
         */
        List<Integer> list1 = Arrays.asList(2, 3, 4);
        // This is also a good way of initializing an arrayList
        List<Integer> list2 = new ArrayList<>(Arrays.asList(4, 5, 6));
        System.out.println(list1.toArray().getClass() == Object[].class);
        System.out.println(list2.toArray().getClass() == Object[].class);
    }

    public static void main(String[] args) {
        arrayListTest2();
    }
}
