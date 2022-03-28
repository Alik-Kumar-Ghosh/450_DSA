
//https://practice.geeksforgeeks.org/problems/boundary-traversal-of-binary-tree/1

//approach 1;


class Solution
{   
	ArrayList <Integer> boundary(Node root)
	{ArrayList <Integer> arr=new ArrayList<>();
	    if(root==null)
            return arr;
        arr.add(root.data);
        leftnodes(root.left,arr);
        leafnodes(root.left,arr);
        leafnodes(root.right,arr);
        rightnodes(root.right,arr);
        //System.out.println(arr.toString());
        return arr;
	}

     void leftnodes(Node root,ArrayList<Integer> arr){
    	if(root==null)
        	return; 
        if(root.left==null&& root.right==null){
            return;
        }
        arr.add(root.data);
        if(root.left!=null)
        leftnodes(root.left,arr);
        else
        leftnodes(root.right,arr);
        //return;
    }
  void leafnodes(Node root,ArrayList<Integer> ans){
    if(root==null){
           return;
       }
       if(root.left==null && root.right==null){
           ans.add(root.data);
       }
       leafnodes(root.left,ans);
       leafnodes(root.right,ans);
        //return;
    }
 void rightnodes(Node root,ArrayList<Integer> arr){
    	if(root==null) 
        	return;
        if(root.left==null&& root.right==null){
        	return;
        }
        //rightnodes(root.left);
        if(root.right!=null)
       	rightnodes(root.right,arr);
       	else
       	rightnodes(root.left,arr);
        arr.add(root.data);
        //return;
    }
}









// approach 2
public class Boundary_traversal_binary_tree {

    class Solution
    {
        ArrayList <Integer> boundary(Node node)
        {
            ArrayList<Integer> ans = new ArrayList<Integer>();
            if(isLeaf(node) == false) ans.add(node.data);
            addLeftBoundary(node, ans);
            addLeaves(node, ans);
            addRightBoundary(node, ans);
            return ans;
        }
        boolean isLeaf(Node node){
            if(node==null){
                return false;
            }
            if(node.left==null && node.right==null){
                return true;
            }
            else
                return false;
        }

        void addLeftBoundary(Node root, ArrayList<Integer> res) {
            Node cur = root.left;
            while (cur != null) {
                if (isLeaf(cur) == false) res.add(cur.data);
                if (cur.left != null) cur = cur.left;
                else cur = cur.right;
            }
        }
        void addRightBoundary(Node root, ArrayList<Integer> res) {
            Node cur = root.right;
            ArrayList<Integer> tmp = new ArrayList<Integer>();
            while (cur != null) {
                if (isLeaf(cur) == false) tmp.add(cur.data);
                if (cur.right != null) cur = cur.right;
                else cur = cur.left;
            }
            int i;
            for (i = tmp.size()-1; i >= 0; --i) {
                res.add(tmp.get(i));
            }
        }

        void addLeaves(Node root, ArrayList<Integer> res) {
            if (isLeaf(root)) {
                res.add(root.data);
                return;
            }
            if (root.left != null) addLeaves(root.left, res);
            if (root.right != null) addLeaves(root.right, res);
        }
    }

}

