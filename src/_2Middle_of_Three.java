import java.util.Scanner;

public class _2Middle_of_Three {
    public static int middle(int A,int B, int C){
        //code here//Position this line where user code will be pasted.
        if(A<B&&B<C||A>B&&B>C)
            return B;
        else if(A>C&&B>A||A<C&&B<A)
        {
            return A;
        }
        else
        {
            return C;
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t=s.nextInt();
        while(t>0)
        {
            int A,B,C;
            A=s.nextInt();
            B=s.nextInt();
            C=s.nextInt();
            System.out.println(middle(A,B,C));
            t--;
        }
    }
}
