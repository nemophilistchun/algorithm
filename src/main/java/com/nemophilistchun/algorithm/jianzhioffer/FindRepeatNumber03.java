package com.nemophilistchun.algorithm.jianzhioffer;

import java.util.HashSet;
import java.util.Set;

/**
 * @author chun
 * @date 2021/5/29 21:04
 */
public class FindRepeatNumber03 {

    /**
     * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，
     * 但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
     *
     * 输入：
     * [2, 3, 1, 0, 2, 5, 3]
     * 输出：2 或 3
     *
     * 限制：
     *
     * 2 <= n <= 100000
     */
    public static void main(String[] args) {

    }

    /**
     * 时间复杂度O（n） 空间复杂度O（n）
     *
     * 思路：
     * 牺牲一点空间，遍历数组，如果不存在set中就添加到set，存在说明有重复，直接返回
     *
     * @param nums nums
     * @return 数组中任意一个重复的数字
     */
    public int findRepeatNumber01(int[] nums) {
        Set<Integer> set = new HashSet<>(16);
        for (int i:nums) {
            if (set.contains(i)){
                return i;
            }else{
                set.add(i);
            }
        }
        return -1;
    }


    /**
     * 时间复杂度O（n） 空间复杂度O（1）
     * 思路：
     * 遍历数组，让数组换到正确的位置上，比如0在num[0]上就是正确位置，此时再遍历下一个元素，当发现待交换的数字和对应正确位置上
     * 的数值一样，说明重复了
     * @param nums nums
     * @return 数组中任意一个重复的数字
     */
    public int findRepeatNumber02(int[] nums) {
        int i = 0;
        while (i < nums.length){
            //索引 i 的值为 i,已经在正确的位置上，换下一个位置
            if (nums[i] == i){
                i++;
                continue;
            }
            //索引nums[i]位置上的数值 == nums[i]本身，即有重复值
            if (nums[nums[i]] == nums[i]){
                return nums[i];
            }
            //说明位置i的数值不是i，nums[i]位置和i位置的值
            int temp = nums[i];
            nums[i] = nums[temp];
            nums[temp] = temp;
        }
        return -1;
    }

}
