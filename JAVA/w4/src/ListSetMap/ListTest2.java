package ListSetMap;

import java.util.LinkedList;

/**
 * @Author Anthony Z.
 * @Date 30/7/2022
 * @Description:
 *
 * LinkedList的链表结构不一定会比ArrayList节省空间，
 * 首先它所占用的内存不是连续的，其次他还需要大量的实例化对象创造节点。
 *
 * ArrayList与LinkedList都有自己的使用场景，如果你不能很好的确定，那么就使用ArrayList。
 * 但如果你能确定你会在集合的首位有大量的插入、删除以及获取操作，那么可以使用LinkedList，
 * 因为它都有相应的方法；addFirst、addLast、removeFirst、removeLast、getFirst、getLast，这些操作的时间复杂度都是O(1)，非常高效。
 */
public class ListTest2 {
    static void linkedListTest1(){
        LinkedList<Integer> linkedList1 = new LinkedList<>();
        linkedList1.addFirst(2);
    }
    public static void main(String[] args) {

    }
}
