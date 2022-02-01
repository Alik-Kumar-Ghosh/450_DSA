import java.util.ArrayList;

public class Preorder_Traversal {
    /*https://practice.geeksforgeeks.org/problems/preorder-traversal/1/*/

    static ArrayList<Integer> preorder(Node root)
    {
        // Code here
        ArrayList <Integer> ans = new ArrayList <Integer>();
        if(root==null){
            return ans;
        }
        else{
            Stack <Node> st=new Stack<Node>();
            st.push(root);
            while(!st.isEmpty()){
                root=st.pop();
                ans.add(root.data);
                if(root.right!=null)
                    st.push(root.right);
                if(root.left!=null)
                    st.push(root.left);
            }
        }
        return ans;
    }
}
