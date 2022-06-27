package Collection;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author Anthony Z.
 * @Date 29/5/2022
 * @Description:
 * Map: 双列数据，存储Key-value数据
 *
 * HashMap: 作为Map的主要实现类，线程不安全，效率高
 * 不安全但是还是经常用它
 * HashMap底层：数组+链表+红黑树（jdk8后）
 *
 *
 *      LinkedList: 保证在遍历map元素时，可以按照添加的顺序实现遍历
 * 原因：在原有的HashMao底层结构基础上，添加了一对指针，指向前一个和后一个元素
 * 执行效率高于HashMap
 *
 *
 * TreeMap: 保证按照添加的key-value对进行排序，以key为基础排序，底层使用红黑树其实不咋用
 *
 * HashTable: 古老实现类，线程安全，效率高
 *      Properties: 常常用来处理配置文件。key和value都是string
 *
 * 面试题
 * 1. HashMap的底层实现原理
 * 2. HashMap和 HashTable的异同
 */
public class MapTest {
    public void test1(){
        Map<Integer, String> map = new HashMap();
        map.put(2, "zg");
        map.put(3, "abc");

        // Iterate the map
        for(Map.Entry<Integer, String> entry: map.entrySet()){
            System.out.println("Key: " + entry.getKey() +
                    "Value: " + entry.getValue());
        }

    }

    public void test2(){

    }

}

