package com.nemophilistchun.algorithm.jianzhioffer;

/**
 * @author chun
 * @date 2021/6/1 22:31
 */
public class BuildTree07 {

    /**
     * 输入某二叉树的前序遍历和中序遍历的结果，请重建该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
     *
     * 前序遍历 preorder = [3,9,20,15,7]
     * 中序遍历 inorder = [9,3,15,20,7]
     *
     * 限制：
     * 0 <= 节点个数 <= 5000
     */
    public static void main(String[] args) {

    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return null;
    }

    public class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int x) { val = x; }
   }

}
