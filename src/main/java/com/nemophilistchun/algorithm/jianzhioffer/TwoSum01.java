package com.nemophilistchun.algorithm.jianzhioffer;

import java.util.HashMap;
import java.util.Map;

/**
 * @author chun
 * @date 2021/5/29 21:45
 */
public class TwoSum01 {

    /**
     *给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
     * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
     * 你可以按任意顺序返回答案。
     *
     * 1)
     * 输入：nums = [2,7,11,15], target = 9
     * 输出：[0,1]
     * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
     *
     * 2)
     * 输入：nums = [3,2,4], target = 6
     * 输出：[1,2]
     *
     *提示：
     * 2 <= nums.length <= 104
     * -109 <= nums[i] <= 109
     * -109 <= target <= 109
     * 只会存在一个有效答案
     *
     * @param args args
     */
    public static void main(String[] args) {

    }

    /**
     * 暴力枚举
     * 时间复杂度O（n^2） 空间复杂度O（1）
     */
    public int[] twoSum01(int[] nums, int target) {
        for (int i = 0; i < nums.length -1; i++){
            for (int j = i + 1; j < nums.length; j++){
                if (nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[0];
    }

    /**
     * 哈希表
     * 时间复杂度O(N) 空间复杂度O(N)
     * 思路：
     * 利用Map，key=数值，value=所在的位置存储【就是存储差值】，每遍历一个数值，就用target - nums[i]在不在Map中，在说明满足
     * target - nums[i] + nums[i] = target,返回，否则<当前值， 所在位置>存在Map中
     *
     */
    public int[] twoSum02(int[] nums, int target) {
        //key=数值，value=所在的位置
        Map<Integer, Integer> map = new HashMap<>(16);
        for (int i = 0; i < nums.length; i++){
            if (map.containsKey(target - nums[i])){
                return new int[]{map.get(target - nums[i]), nums[i]};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }
}
