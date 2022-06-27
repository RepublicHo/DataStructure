package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Anthony Z.
 * @Date 19/5/2022
 * @Description: Find All Duplicates in an Array
 * Given an integer array of length n,
 * Every integer will appear once or twice.
 * Find all integers that appear twice.
 *
 * 要求实现一个时间复杂度为O(n) --> 不可以用排序
 * 要求使用額外空间的算法
 */
public class LC442 {
    public List<Integer> findDuplicates(int[] nums) {

        for(int i=0; i<nums.length; i++){
            while(nums[i] != nums[nums[i]-1]){
                swap(nums, i, nums[i]-1);
            }
        }

        List<Integer> results = new ArrayList();
        for(int i=0; i<nums.length; i++){
            if(nums[i] != i+1){
                results.add(nums[i]);
            }
        }
        return results;
    }

    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

    }
    public static void main(String[] args) {

        int[] nums1 = new int[]{1, 1, 2};
        int[] nums2 = new int[]{2, 4, 3, 2, 7, 6, 4, 3};

    }
}
