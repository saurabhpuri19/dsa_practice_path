package org.practice;

public class TwoSum {

    static void main() {
//        int [] nums = {2,6,4,3};
//        int target = 10;

        int [] nums = {2,5,4,3};
        int target = 10;
        System.out.println("result :::::::: " +isTwoSum(nums, target));
    }
    public static boolean isTwoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target){
                    return true;
                }
            }
        }
        return false;
    }
}
