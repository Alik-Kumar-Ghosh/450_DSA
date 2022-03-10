//https://practice.geeksforgeeks.org/problems/right-view-of-binary-tree/1#
//https://leetcode.com/problems/binary-tree-right-side-view/
public class RightView_Btree {
//GFG
    class Solution{
        //Function to return list containing elements of right view of binary tree.
        ArrayList<Integer> arr=new ArrayList<>();
        ArrayList<Integer> rightView(Node node) {
            //add code here.
            helper(node,0);
            return arr;
        }
        void helper(Node root,int level){
            if(root==null){
                return;
            }
            if(arr.size()==level){
                arr.add(root.data);
            }

            helper(root.right,level+1);
            helper(root.left,level+1);
        }
    }



    //LeetCode

    class Solution {
        List<Integer> arr=new LinkedList<Integer>();
        public List<Integer> rightSideView(TreeNode root) {
            printView(root,0);
            return arr;
        }
        void printView(TreeNode root, int level){
            if(root==null){
                return ;
            }
            if(level == arr.size())
                arr.add(root.val);
            arr.set(level,root.val);
            printView(root.left,level+1);
            printView(root.right,level+1);
        }
    }
}
