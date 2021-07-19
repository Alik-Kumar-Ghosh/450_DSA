import java.util.Scanner;

public class Single_LinkedList {
    static class Node{
        int data;
        Node next;
    }
    static Node head;
    static Node tail;
    static int size;

    public static void addLast(int val){
        Node temp=new Node();
        temp.data=val;
        temp.next=null;
        if(size==0){
            head=tail=temp;
        }
        else{
            tail.next=temp;
            tail=temp;
        }
           // System.out.println(head);
            size++;
        }
        public static void display(){
            Node temp=head;
            //System.out.println(head);
            while (temp!=null){
               System.out.print(temp.data+" -> ");
               temp=temp.next;
           }
    }
    public static void removeFirst(){
        if (size==1){
            head=tail=null;
        }
        else if (size==0){
            System.out.println("The list is empty");
        }
        else {
            head=head.next;
            size--;
            System.out.println("The First Element deleted");
        }
    }
    public static int getFirst(){
        if(size==0){
            System.out.println("the list empty");
            return -1;
        }
        else {
            return head.data;
        }
    }
    public static int getAtIndex(int n){
        if(size==0){
            System.out.println("the list empty");
            return -1;
        }
        if(size<n){
            System.out.println("OverFlow");
            return -1;
        }
        else {
            Node temp=head;
        for (int i = 0; i < n; i++) {
            temp=temp.next;
        }
            return temp.data;
        }
    }
    public static int getLast(){
        if(size==0){
            System.out.println("the list empty");
            return -1;
        }
        else {
            return tail.data;
        }
    }
    public static void addFirst(int val){
        Node temp=new Node();
        temp.data=val;
        temp.next=head;
        head=temp;
        size++;
    }
    public static void addAtIndex(int val,int n){
        Node temp=new Node();
        temp.data=val;
        Node prev=head;
        for (int i = 0; i < n-1; i++) {
            prev=prev.next;
        }
        temp.next=prev.next;
        prev.next=temp;
        size++;
    }
    public static void removeLast(){
        if(size==0){
            System.out.println("empty list");
        }
        else {
            Node temp = head;
            for (int i = 0; i < size - 1 - 1; i++) {
                temp = temp.next;
            }
            tail = temp;
            temp.next = null;
            size--;
        }
    }
    public static void removeAtIndex(int n){
        if(size<n){
            System.out.println("Enter valid index");
        }
        else if(n==size-1){
            removeLast();
        }
        else{
            Node temp=head;
            for (int i = 0; i < n-1; i++) {
                temp=temp.next;
            }
            temp.next=temp.next.next;
            size--;
        }
    }
    private static Node getNodeAt(int n){
        Node temp=head;
        for (int i = 0; i < n; i++) {
            temp=temp.next;
        }
        return temp;
    }
    public static void reverseLinkedListSwap(){
        if(size==0){
            System.out.println("List is Empty");
        }
        else if(size==1){
        }
        else {
            int ri=size-1;
            int le=0;
            while (ri>le){
                Node left=getNodeAt(le);
                Node right=getNodeAt(ri);
                int temp=left.data;
                left.data=right.data;
                right.data=temp;
                le++;
                ri--;
            }
        }
    }
    public static void reverseLinkedList(){
        Node prev=null;
        Node curr=head;

        while (curr!=null){
            Node currNext = curr.next;
            curr.next=prev;
            prev=curr;
            curr=currNext;
        }
        Node temp=head;
        head=tail;
        tail=temp;
    }
    public static int kthFromLast(int n){
        Node fast=head;
        Node slow=head;
        for (int i = 0; i <n ; i++) {
            fast=fast.next;
        }
        while(fast!=tail){
            slow=slow.next;
            fast=fast.next;
        }
        return slow.data;
    }
    public static int getMiddleEle(){
        Node f=head;
        Node s=head;
        while(f.next!=null&&f.next.next!=null){
            f=f.next.next;
            s=s.next;
        }
        return s.data;
    }
    public static void removeDuplicates(){
        if(size==0){
            System.out.println("Empty List");
        }
        else{
            Node cur=head;
            while(cur!=null&&cur.next!=null){
                if (cur.data==cur.next.data){
                    cur.next=cur.next.next;
                }
                else {
                    cur=cur.next;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        char ch;
        do {
            System.out.println("Enter 1 to add at last");
            System.out.println("Enter 2 to display");
            System.out.println("Enter 3 to delete from the first");
            System.out.println("Enter 4 to get the first");
            System.out.println("Enter 5 to at index first");
            System.out.println("Enter 6 to get from the last");
            System.out.println("Enter 7 to add in first");
            System.out.println("Enter 8 to add at index");
            System.out.println("Enter 9 to remove from last");
            System.out.println("Enter 10 to remove at index");
            System.out.println("Enter 11 to reverse list swap value");
            System.out.println("Enter 12 to reverse list");
            System.out.println("Enter 13 to Kth element from last");
            System.out.println("Enter 14 to get middle element");
            System.out.println("Enter 15 remove duplicates");
            int cho=s.nextInt();
            if(cho==1){
                int val=s.nextInt();
                addLast(val);
            }
            else if(cho==2){
                display();
            }
            else if(cho==3){
                removeFirst();
            }
            else if(cho==4){
                System.out.println(getFirst());
            }
            else if(cho==5){
                int n=s.nextInt();
                System.out.println(getAtIndex(n));
            }
            else if(cho==6){
                System.out.println(getLast());
            }
            else if(cho==7){
                int n=s.nextInt();
                addFirst(n);
            }
            else if(cho==8){
                int val=s.nextInt();
                int n=s.nextInt();
                addAtIndex(val,n);
            }
            else if(cho==9){
                removeLast();
            }
            else if(cho==10){
                int n=s.nextInt();
                removeAtIndex(n);
            }
            else if(cho==11){
               reverseLinkedListSwap();
            }
            else if(cho==12){
                reverseLinkedList();
            }
            else if(cho==13){
                int n=s.nextInt();
                System.out.println(kthFromLast(n));
            }
            else if(cho==14){
                System.out.println(getMiddleEle());
            }
            else if(cho==15){
                removeDuplicates();
            }
            else {
                System.out.println("Enter Valid input ");
            }
            System.out.println("y to cont");
            ch= s.next().charAt(0);
        }
        while (ch=='y');
    }
}
