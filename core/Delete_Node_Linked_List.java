public class Delete_Node_Linked_List {
    /*
    * Striver (Take u Forward) * DSA sheet
    * 237. Delete Node in a Linked List
    * https://leetcode.com/problems/delete-node-in-a-linked-li0.00.st/
    * */
    class Solution {
        public void deleteNode(ListNode node) {
            node.val=node.next.val;
            node.next=node.next.next;
        }
    }
}
