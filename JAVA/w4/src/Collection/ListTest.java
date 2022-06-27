package Collection;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author Anthony Z.
 * @Date 29/5/2022
 * @Description:
 *
 * List接口，存储有序，可重复的数据，是动态的
 * 1. ArrayList: List的主要实现类线程不安全，效率高，底层使用Object[]存储
 * 2. Vector: 线程安全，效率低，是list接口的古老实现类，底层使用Object[]存储
 * 3. LinkedList: 对于频繁的插入，删除操作才效率高，底层用双向链表存储
 *
 *
 * 529，530，531没听
 * 到535都没听
 */
public class ListTest {
    public void ArrayListTest(){
        List<Integer> list = new LinkedList<>();
        
    }
}
