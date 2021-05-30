import java.util.Scanner;
import java.util.Stack;

public class Stock_Span_Stack {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        int arr[] =  new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=s.nextInt();
        }
        int span[] = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        span[0]=1;
        for (int i = 1; i < n; i++) {
            while (st.size()>0&&arr[i]>st.peek()){
                st.pop();
            }
            if(st.size()==0){
                span[i]=i+1;
            }
            else {
                span[i]=i-st.peek();
            }
            st.push(i);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]+" -> "+span[i]);
        }

    }
}
