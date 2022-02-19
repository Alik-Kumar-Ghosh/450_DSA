
//https://leetcode.com/problems/average-of-levels-in-binary-tree/submissions/

public class Average_of_levels_in_binary_tree {

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
        public List<Double> averageOfLevels(TreeNode root) {
            Queue<TreeNode> q = new LinkedList<>();
            q.add(root);
            List<Double> l1 = new  LinkedList<>();
            if(root==null)
                return null;
            while(!q.isEmpty()){
                int levelnum=q.size();
                //List<Integer> l2 = new LinkedList<>();
                double curr=0;
                for(int i=0;i<levelnum;i++){
                    TreeNode temp = q.remove();
                    if(temp.left!=null)
                        q.add(temp.left);
                    if(temp.right!=null)
                        q.add(temp.right);
                    curr=curr+temp.val;

                }
                curr=(curr/levelnum);
                l1.add(curr);
            }
            return l1;
        }
    }

}
