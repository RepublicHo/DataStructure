package LeetCode;

import java.util.HashMap;

/**
 * @Author: Anthony
 * @Date: 05/09/2022
 * @Description: Two sum
 *
 * 1. HashMap can enable O(n).
 *
 */
public class LC1 {
    public int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int[] result = new int[2];
        int i=0;
        for(i=0; i<nums.length; i++){
            if(!hashMap.containsKey(target-nums[i])){
                hashMap.put(nums[i], i);
            }else{
                result[0] = hashMap.get(target-nums[i]);
                result[1] = i;
                break;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        LC1 n1=new LC1();
        int[] result = n1.twoSum(nums, target);
        System.out.println(result[0]+""+result[1]);

    }
}

