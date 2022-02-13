/*https://practice.geeksforgeeks.org/problems/zigzag-tree-traversal/1#*/

    // { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.util.HashMap;
import java.io.*;

    class Node
    {
        int data;
        Node left,right;
        Node(int data){
            this.data = data;
            left=null;
            right=null;
        }
    }
public class ZigZag_Traversal

    {
        static Node buildTree(String str){

            if(str.length()==0 || str.charAt(0)=='N'){
                return null;
            }

            String ip[] = str.split(" ");
            // Create the root of the tree
            Node root = new Node(Integer.parseInt(ip[0]));
            // Push the root to the queue

            Queue<Node> queue = new LinkedList<>();

            queue.add(root);
            // Starting from the second element

            int i = 1;
            while(queue.size()>0 && i < ip.length) {

                // Get and remove the front of the queue
                Node currNode = queue.peek();
                queue.remove();

                // Get the current node's value from the string
                String currVal = ip[i];

                // If the left child is not null
                if(!currVal.equals("N")) {

                    // Create the left child for the current node
                    currNode.left = new Node(Integer.parseInt(currVal));
                    // Push it to the queue
                    queue.add(currNode.left);
                }

                // For the right child
                i++;
                if(i >= ip.length)
                    break;

                currVal = ip[i];

                // If the right child is not null
                if(!currVal.equals("N")) {

                    // Create the right child for the current node
                    currNode.right = new Node(Integer.parseInt(currVal));

                    // Push it to the queue
                    queue.add(currNode.right);
                }
                i++;
            }

            return root;
        }

        public static void inorder(Node root)
        {
            if(root==null)
                return;
            inorder(root.left);
            System.out.print(root.data);
            inorder(root.right);
        }
        /* Drier program to test above functions */
        public static void main(String args[]) throws IOException
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int t=Integer.parseInt(br.readLine());

            while(t > 0){
                String s = br.readLine();
                Node root = buildTree(s);
                GFG g = new GFG();

                ArrayList<Integer> res = g.zigZagTraversal(root) ;
                for (int i = 0; i < res.size (); i++)
                    System.out.print (res.get (i) + " ");
                System. out. println();

                t--;

            }
        }
    }// } Driver Code Ends


//User function Template for Java

/*class Node
{
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=right=null;
    }
}*/

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
