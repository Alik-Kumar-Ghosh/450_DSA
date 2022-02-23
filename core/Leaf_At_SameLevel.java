//https://practice.geeksforgeeks.org/problems/leaf-at-same-level/1

public class Leaf_At_SameLevel {

    class Solution
    {   int levelleaf=-1;
        boolean check(Node root)
        {
            // Your code here
            if(root==null){
                return true;
            }
            int level = 0;
            return helper( root,level);

        }
        boolean helper(Node root, int level){
            if(root == null){
                return true;
            }
            if(root.left==null&&root.right==null){
                if(levelleaf==-1){
                    levelleaf=level;
                    return true;
                }
                else{
                    if(levelleaf==level)
                        return true;
                    else
                        return false;
                }
            }
            boolean lans = helper(root.left,level+1);
            boolean rans = helper(root.right,level+1);
            if(lans==false||rans==false)
                return false;
            else
                return true;
        }
    }

}
