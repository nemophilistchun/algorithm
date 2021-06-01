package com.nemophilistchun.algorithm.jianzhioffer;

/**
 * @author chun
 * @date 2021/6/1 22:02
 */
public class ReplaceSpace05 {

    /**
     * 05请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
     * 输入：s = "We are happy."
     * 输出："We%20are%20happy."
     *
     * 限制：
     * 0 <= s 的长度 <= 10000
     *
     */
    public static void main(String[] args) {

    }

    /**
     * 时间复杂度O（n） 空间复杂度O（n）额外创建字符数组
     *
     * 思路：
     * 将s变成字符串数组，遍历
     */
    public String replaceSpace(String s) {
        char[] string = s.toCharArray();
        StringBuilder result = new StringBuilder();
        for (char c : string) {
            if (c == ' ') {
                result.append("%20");
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}
