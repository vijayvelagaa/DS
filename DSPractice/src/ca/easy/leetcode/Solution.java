package ca.easy.leetcode;

import java.util.Arrays;

public class Solution {

    public int[] twoSum(int[] nums, int target) {
        int[] num1= new int[2];
        for (int num=0; num<nums.length; num++) {
            for (int num11=1; num11<nums.length; num11++) {
                int result = nums[num] + nums[num11];
                if(result == target) {
                    num1[num] = nums[num];
                    num1[num11] = nums[num11];
                }
                break;
            }
        }
        return  num1;
    }

    public static void main(String []ar) {

        int[] nums = {2,7,11,15};
        int target = 9;
        Solution s = new Solution();
        System.out.println("result : "+ Arrays.toString(s.twoSum(nums,target)));
    }
}
