public class IntersectionPoint_Y_Shapped_LinkedLists {
    /*
    * CheatCode book GFG
    * https://practice.geeksforgeeks.org/problems/intersection-point-in-y-shapped-linked-lists/1
    * Intersection Point in Y Shapped Linked Lists
    * */
    class Intersect
    {
        //Function to find intersection point in Y shaped Linked Lists.
        int intersectPoint(Node head1, Node head2)
        {
            // code here
            int size1=0,size2=0;
            Node temp=head1;
            while(temp!=null){
                temp=temp.next;
                size1++;
            }
            temp=head2;
            while(temp!=null){
                temp=temp.next;
                size2++;
            }
            Node temp1=head1;
            Node temp2=head2;
            int dif=0;
            if(size1>size2){
                dif=size1-size2;
                for(int i=1;i<=dif;i++){
                    temp1=temp1.next;
                }
            }
            else if(size2>size1){
                dif=size2-size1;
                for(int i=1;i<=dif;i++){
                    temp2=temp2.next;
                }
            }
        /* System.out.println(size1);
         System.out.println(size2);
           System.out.println(dif);
          */
            while(temp1!=temp2){
                // System.out.println(temp1.data);
                //System.out.println(temp2.data);
                temp1=temp1.next;
                temp2=temp2.next;
            }
            return temp1.data;
        }
    }
}
