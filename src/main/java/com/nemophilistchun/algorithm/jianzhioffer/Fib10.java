package com.nemophilistchun.algorithm.jianzhioffer;

/**
 * @author chun
 * @date 2021/6/2 02:22
 */
public class Fib10 {

    /**
     *写一个函数，输入 n ，求斐波那契（Fibonacci）数列的第 n 项（即 F(N)）。斐波那契数列的定义如下：
     * F(0) = 0,   F(1) = 1
     * F(N) = F(N - 1) + F(N - 2), 其中 N > 1.
     *
     * 斐波那契数列由 0 和 1 开始，之后的斐波那契数就是由之前的两数相加而得出。
     *
     * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
     *
     */
    public static void main(String[] args) {

    }

    /**
     * 时间复杂度 O(N)  空间复杂度 O(1)
     */
    public int fib(int n) {
        int a = 0, b = 1, sum;
        for (int i = 0; i < n; i++) {
            //考虑大数越界问题
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return a;
    }
}
