public class MergeTwoBinaryTrees {

    /*https://leetcode.com/problems/merge-two-binary-trees/*/
    class Solution {
        public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
            return mergeT(root1,root2);
        }
        public TreeNode mergeT(TreeNode t1,TreeNode t2){
            if(t1==null&&t2==null)
                return null;
            if(t1==null&&t2!=null)
                return t2;
            if(t1!=null && t2==null)
                return t1;

            TreeNode sum=new TreeNode(t1.val+t2.val);
            sum.left=mergeT(t1.left,t2.left);
            sum.right=mergeT(t1.right,t2.right);

            return sum;
        }
    }
}
