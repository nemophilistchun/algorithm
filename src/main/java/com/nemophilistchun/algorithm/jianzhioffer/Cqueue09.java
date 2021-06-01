package com.nemophilistchun.algorithm.jianzhioffer;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author chun
 * @date 2021/6/2 02:11
 */
public class Cqueue09 {

    /**
     * 用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead 操作返回 -1 )
     *
     * 输入：
     * ["CQueue","appendTail","deleteHead","deleteHead"]
     * [[],[3],[],[]]
     * 输出：[null,null,3,-1]
     *
     * 1 <= values <= 10000
     * 最多会对 appendTail、deleteHead 进行 10000 次调用
     *
     *
     * 思路：
     * 维护两个栈，第一个栈支持插入操作，第二个栈支持删除操作。
     * 时间复杂度O(n) 空间复杂度O(n)需要使用两个栈存储已有的元素
     *
     */
    public static void main(String[] args) {

    }

    Deque<Integer> stack1;
    Deque<Integer> stack2;

    public Cqueue09() {
        stack1 = new LinkedList<>();
        stack2 = new LinkedList<>();
    }

    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {
        // 如果第二个栈为空,就将stack1的元素加入到stack2，这样第二个栈里元素的顺序就是待删除的元素的顺序
        if (stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        if (stack2.isEmpty()){
            return -1;
        } else {
            return stack2.pop();
        }
    }
}
