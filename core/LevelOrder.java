//  https://leetcode.com/problems/binary-tree-level-order-traversal/
public class LevelOrder {

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
        public List<List<Integer>> levelOrder(TreeNode root) {
            Queue<TreeNode> q = new LinkedList<>();
            q.add(root);
            List<List<Integer>> l1 = new  LinkedList<List<Integer>>();
            if(root==null)
                return null;
            // int flag=0;
            while(!q.isEmpty()){
                int levelnum=q.size();
                List<Integer> l2 = new LinkedList<Integer>();
                for(int i=0;i<levelnum;i++){
                    TreeNode temp = q.remove();
                    if(temp.left!=null)
                        q.add(temp.left);
                    if(temp.right!=null)
                        q.add(temp.right);
                    l2.add(temp.val);
                }
                l1.add(l2);
            }
            return l1;
        }

    }

}
