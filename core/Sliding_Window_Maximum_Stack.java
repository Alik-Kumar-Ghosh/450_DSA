import java.util.Scanner;
import java.util.Stack;

public class Sliding_Window_Maximum_Stack {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=s.nextInt();
        }
        int k = s.nextInt();
        int nge[]=new int[n];
        nge[n-1]=arr.length;
        Stack<Integer> st = new Stack<>();
        st.push(arr.length-1);
        for (int i = n-2; i >=0; i--) {
            while (st.size()!=0 && arr[i]>=arr[st.peek()]){
                st.pop();
            }
            if (st.size()==0){
                nge[i]=arr.length;
            }
            else
                nge[i]=st.peek();
            st.push(i);
        }
      /*  int a=-1;
        for (int index:
             nge) {
            a++;
            System.out.println(a+" = "+arr[index]);
        }*/
        for (int i = 0; i <= arr.length-k ;i++) {
            int j=i;
            while (nge[j]<i+k){
                j=nge[j];
            }
            System.out.print(arr[j]+" ");
        }
    }
}
