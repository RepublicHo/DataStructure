package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author Anthony Z.
 * @Date 6/6/2022
 * @Description:
 */
public class LC15 {
    public static List<List<Integer>> threeSum(int[] nums) {
        if(nums.length < 3){
            return new ArrayList<>();
        }

        List<List<Integer>> listarr = new ArrayList<>();

        Arrays.sort(nums);

        for(int i = 0; i<nums.length-3; i++){
            int results = -1 * nums[i];

            int left = i+1;
            int right = nums.length - 1;

            // HashMap<Integer, Integer> map = new HashMap<>();


            while(left<right){
                List<Integer> tempList = new ArrayList<>();
                if(nums[left]+ nums[right] == results){
                    tempList.add(nums[i]);
                    tempList.add(nums[left]);
                    tempList.add(nums[right]);
                    listarr.add(tempList);
                    left++;
                }else if(nums[left] + nums[right]<results){
                    left++;
                }else{
                    right--;
                }
            }
        }

        return listarr;

    }

    public static void main(String[] args) {
        int[] nums = new int[]{0, 0, 0};
        List<List<Integer>> result = threeSum(nums);
        System.out.println(result);

    }


}
