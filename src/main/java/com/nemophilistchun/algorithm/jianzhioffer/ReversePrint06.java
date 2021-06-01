package com.nemophilistchun.algorithm.jianzhioffer;

import java.util.LinkedList;
import java.util.Stack;

/**
 * @author chun
 * @date 2021/6/1 22:12
 */
public class ReversePrint06 {
    /**
     * 06-输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
     *
     * 输入：head = [1,3,2]
     * 输出：[2,3,1]
     *
     * 限制：
     * 0 <= 链表长度 <= 10000
     */
    public static void main(String[] args) {

    }

    /**
     * 时间复杂度 O(N)  空间复杂度 O(N)辅助栈 stack 和数组 res 共使用 O(N)O(N) 的额外空间
     * 先入后出 的需求可以借助 栈 来实现
     */
    public int[] reversePrint01(ListNode head) {
        LinkedList<Integer> stack = new LinkedList<>();
        while (head != null){
            stack.addLast(head.val);
            head = head.next;
        }
        int[] result = new int[stack.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = stack.removeLast();
        }
        return result;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

}
