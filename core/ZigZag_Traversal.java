/*https://practice.geeksforgeeks.org/problems/zigzag-tree-traversal/1#*/
/*https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/*/

    class GFG
    {
        //Function to store the zig zag order traversal of tree in a list.
        ArrayList<Integer> zigZagTraversal(Node root)
        {       Queue<Node> q = new LinkedList<>();
            q.add(root);
            ArrayList<Integer> l1 = new  ArrayList<>();
            if(root==null)
                return null;
            int flag=0;
            while(!q.isEmpty()){
                if(flag==0){
                    flag=1;
                }
                else
                    flag=0;
                int levelnum=q.size();
                ArrayList<Integer> l2 = new  ArrayList<>();
                for(int i=0;i<levelnum;i++){
                    Node temp = q.remove();
                    if(temp.left!=null)
                        q.add(temp.left);
                    if(temp.right!=null)
                        q.add(temp.right);
                    l2.add(temp.data);
                }
                if(flag==0)
                    Collections.reverse(l2);
                for(int i=0;i<l2.size();i++)
                    l1.add(l2.get(i));
            }
            return l1;
        }
    }


//leetcode


class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> l1=new LinkedList<>();
        if(root==null)
                return l1;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int left_to_right=0;
        while(!q.isEmpty()){
            if(left_to_right==1)
                left_to_right=0;
            else
                left_to_right=1;
            List<Integer> l2=new LinkedList<>();
            int levelsize=q.size();
            for(int i=0;i<levelsize;i++){
            TreeNode curr=q.poll();
            if(curr.left!=null){
                q.add(curr.left);
            }
            if(curr.right!=null){
                q.add(curr.right);
            
            }
            l2.add(curr.val);
        }
        if(left_to_right==0){
            Collections.reverse(l2);
            l1.add(l2);
        }
        else{
            l1.add(l2);
        }
    }
        return l1;
}
}

