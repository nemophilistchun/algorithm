package com.nemophilistchun.algorithm.jianzhioffer;


/**
 * @author chun
 * @date 2021/5/30 13:23
 */
public class AddTwoNumbers02 {

    /**
     * 2. 两数相加
     * 给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
     * 请你将两个数相加，并以相同形式返回一个表示和的链表。
     * 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
     *
     * 1)
     * 输入：l1 = [2,4,3], l2 = [5,6,4]
     * 输出：[7,0,8]
     * 解释：342 + 465 = 807.
     *
     * 2)
     * 输入：l1 = [0], l2 = [0]
     * 输出：[0]
     *
     */
    public static void main(String[] args) {

    }

    /**
     * 时间复杂度O(max(m,n)) 空间复杂度O(1)
     *
     * 思路：
     * 同时遍历两个链表，对因为相加，有进位则进位
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null){
            return null;
        }
        //建个头结点
        ListNode result = new ListNode(0);
        //head为result的头结点，下面会补充result每一位的值
        ListNode head = result;
        //进位标志位
        int addOne = 0;
        //l1，l2都为null，说明都走到最后一位了，但是有可能存在进位，所以得补上最后一位。
        while (l1 != null || l2 != null || addOne != 0){
            int val1 = l1 == null ? 0 : l1.val;
            int val2 = l2 == null ? 0 : l2.val;
            int sum = val1 + val2 + addOne;
            head.next = new ListNode(sum % 10);
            head = head.next;
            addOne = sum / 10;
            if (l1 != null){
                l1 = l1.next;
            }
            if (l2 != null){
                l2 = l2.next;
            }
        }
        return result.next;
    }

     public static class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

}
