package com.example.test;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = new int[] {3,2,4};
        int target = 6;
        int[] solution = twoSum(nums, target);

        System.out.println(solution[0]);
        System.out.println(solution[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++){
            for (int j = nums.length - 1; j > i; j--){
                System.out.println("i " + nums[i] + ",  j " + nums[j]);
                if(nums[i] + nums[j] == target){

                    return new int[] {i, j};
                }
            }
        }
        return new int[]{};
    }
}
