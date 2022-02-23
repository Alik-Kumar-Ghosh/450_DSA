
/*https://practice.geeksforgeeks.org/problems/minimum-depth-of-a-binary-tree/1#*/
public class minimum_depth_of_a_binary_tree {

    int minDepth(Node node)
    {
        //code here
        if(node == null)
            return 0;
        int leftmin= minDepth(node.left);
        int rightmin= minDepth(node.right);
        if(leftmin==0||rightmin==0)
            return Math.max(leftmin,rightmin)+1;
        return Math.min(leftmin,rightmin)+1;

    }
}
