
//https://practice.geeksforgeeks.org/problems/transform-to-sum-tree/1

public class Transform_to_SumTree {

    class Solution{
        public void toSumTree(Node root){
            //add code here.
            if(root==null)
                return;
            sum(root);
        }
        int sum(Node root){
            if(root==null)
                return 0;
            int ls=sum(root.left);
            int rs=sum(root.right);
            int x=root.data;
            root.data=ls+rs;
            return ls+rs+x;
        }
    }
}
