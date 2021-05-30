import java.util.Scanner;
import java.util.Stack;

public class Next_Greater_Element_on_the_Right_Stack {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=s.nextInt();
        }
        Stack<Integer> st = new Stack<>();
        st.push(arr[n-1]);
        int nge[]=new int[n];
        nge[n-1]=-1;
        for (int i = n-1; i >= 0; i--) {
            while (st.size()!=0 && arr[i]>= st.peek()){
                st.pop();
            }
            if(st.size()==0){
                nge[i]=-1;
            }
            else
                nge[i]=st.peek();
            st.push(arr[i]);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]+" -> "+nge[i]);
        }
    }
}
