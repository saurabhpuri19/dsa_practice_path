package org.practice;

public class twoSum {
    public static void main(String[] args){
        int[] nums = {1,2,3,4};
        //int target = 8;
        int target = 7;

        boolean result = isTwoSum(nums, target);
        System.out.println("result ::::: " +result);
    }

    public static boolean isTwoSum(int[] nums, int target) {

        for(int i =0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if (nums[i] + nums[j] == target) {
                    return true;
                }
            }

        }
        return false;
    }

}
