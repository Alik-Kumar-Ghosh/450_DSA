//https://practice.geeksforgeeks.org/problems/sum-tree/1

public class Check_IF_Sum_Tree {

    class Solution
    {
        boolean isSumTree(Node root)
        {
            // Your code here
            if(root==null)
                return false;
            int x =sumT(root);
            if(x==-1)
                return false;
            else
                return true;
        }
        int sumT(Node root){
            if(root==null){
                return 0;
            }
            int ls = sumT(root.left);
            int rs = sumT(root.right);
            //System.out.println(ls+rs);
            if(ls==-1||rs==-1)
                return -1;
            if(ls==0&&rs==0)
                return root.data;
            if(ls+rs!=root.data){
                return -1;
            }
            else{
                int x=root.data;
                root.data=ls+rs;
                return ls+rs+x;
            }
        }
    }

}
