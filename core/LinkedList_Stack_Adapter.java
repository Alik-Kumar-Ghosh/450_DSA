import java.util.Scanner;

public class LinkedList_Stack_Adapter {
    static class Node{
        int data;
        Node next;
    }
    static Node head=null;
    static Node tail=null;
    static int size=0;
    public static void pops(){
        if (size==1){
            head=tail=null;
        }
        else if (size==0){
            System.out.println("The list is empty");
        }
        else {
            head=head.next;
            size--;
            //System.out.println("The First Element deleted");
        }
    }
    public static int tops(){
        if(size==0){
            System.out.println("the list empty");
            return -1;
        }
        else {
            return head.data;
        }
    }
    public static void pushs(int val){
        Node temp=new Node();
        if(size==0){
            temp.data=val;
            temp.next=null;
            head=tail=temp;
            size++;
        }
        else {
            temp.data=val;
            temp.next=head;
            head=temp;
            size++;
        }
    }
    public static int size(){
        return size;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        char ch;
        do {
            System.out.println("Enter 1. to push");
            System.out.println("Enter 2. to pop");
            System.out.println("Enter 3. to peek");
            System.out.println("Enter 4. to see size");
            int n=s.nextInt();
            if(n==1){
                int val=s.nextInt();
                pushs(val);
            }
            else if(n==2){
                pops();
            }
            else if(n==3){
                System.out.println(tops());
            }
            else if(n==4){
                System.out.println(size());
            }
            else {
                System.out.println("Enter valid input");
            }
            System.out.println("Enter y to continue");
            ch=s.next().charAt(0);
        }while (ch=='y');
    }
}
