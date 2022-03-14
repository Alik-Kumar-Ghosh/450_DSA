//https://leetcode.com/problems/same-tree/submissions/
public class SameTree {
    class Solution {
        public boolean isSameTree(TreeNode p, TreeNode q) {
            if(p==null&&q==null)
                return true;
            if(p==null||q==null)
                return false;
            boolean l = isSameTree(p.left,q.left);
            boolean r = isSameTree(p.right,q.right);
            if(l==false||r==false)
                return false;
            if(p.val==q.val)
                return true;
            else
                return false;
        }
    }
}
