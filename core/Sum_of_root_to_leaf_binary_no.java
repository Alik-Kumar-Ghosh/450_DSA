/*
* https://leetcode.com/problems/sum-of-root-to-leaf-binary-numbers/submissions/
* */

public class Sum_of_root_to_leaf_binary_no {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     */
    class Solution {
        int sum = 0;
        public int sumRootToLeaf(TreeNode root) {
            if(root==null)
                return 0;
            findRootToLeaf(root,"");
            return sum;
        }

        void findRootToLeaf(TreeNode root,String prev){
            if(root==null)
                return;
            prev=prev+String.valueOf(root.val);
            if(root.left==null && root.right==null)
                sum+=Integer.parseInt(prev,2);
            findRootToLeaf(root.left,prev);
            findRootToLeaf(root.right,prev);
        }
    }
}
