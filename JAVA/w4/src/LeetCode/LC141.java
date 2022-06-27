package LeetCode;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @Author Anthony Z.
 * @Date 4/6/2022
 * @Description:
 */
public class LC141 {

//  快慢指针：跑得快的一定会在某一个时刻追上跑得慢的人
//  时间复杂度极低
    public boolean hasCycle(ListNode head){
        if(head == null){
            return false;
        }

        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && slow != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;

    }

    /**
     * 就是往hashSet里面加 看看有没有重复
     * 时间和空间效率低
     * @param head
     * @return
     */
    public boolean hasCycle1(ListNode head){
        ListNode temp = head;
        int hashSize = 0;
        HashSet<ListNode> hashSet = new HashSet<>();

        while(temp != null){

            hashSize = hashSet.size();
            hashSet.add(temp);

            if(hashSet.size() == hashSize){
                return true;
            }

            temp = temp.next;

        }
        return false;
    }


}



class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
