

//https://leetcode.com/problems/univalued-binary-tree/solution/
public class Univalued_binary_tree {
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
        //int valr=root1.val;
        boolean flag=true;
        public boolean isUnivalTree(TreeNode root) {
     /*  if(root==null)
            return true;*/
            helper(root,root.val);
            return flag;
        }
        public void helper(TreeNode root,int a){
            if(root==null)
                return ;
            if(flag==true){
                if(a==root.val)
                    flag=true;
                else{
                    flag= false;
                }
                helper(root.left,a);
                helper(root.right,a);
            }
            else
                return;


        }
        //int first=-1;

    }
}
