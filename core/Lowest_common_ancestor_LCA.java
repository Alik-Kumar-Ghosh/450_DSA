//https://practice.geeksforgeeks.org/problems/lowest-common-ancestor-in-a-binary-tree/1#

public class Lowest_common_ancestor_LCA {

    class Solution
    {
        //Function to return the lowest common ancestor in a Binary Tree.
        Node lca(Node root, int n1,int n2)
        {
            // Your code here
            if(root ==null)
                return null;
            if(root.data==n1||root.data==n2)
                return root;
            Node lans=lca(root.left,n1,n2);
            Node rans=lca(root.right,n1,n2);
            if(lans!=null&&rans!=null)
                return root;
            else if(lans!=null&&rans==null)
                return lans;
            else if(lans==null&&rans!=null)
                return rans;
            else
                return null;
        }
    }


}
