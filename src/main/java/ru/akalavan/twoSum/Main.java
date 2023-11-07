package ru.akalavan.twoSum;

import java.util.Arrays;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 *
 * Example 1:
 *
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * Example 2:
 *
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * Example 3:
 *
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 */
public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(Arrays.toString(main.twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(main.twoSum(new int[]{3, 2, 4}, 6)));
        System.out.println(Arrays.toString(main.twoSum(new int[]{3, 3}, 6)));
    }

    public int[] twoSum(int[] nums, int target) {
        int sum;
        for (int i = 0; i < nums.length; i++) {
            sum = 0;
            for (int j = i + 1; j < nums.length; j++) {
                sum = nums[i] + nums[j];
                if (sum == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{0, 0};
    }
}
