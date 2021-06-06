import java.util.Scanner;
import java.util.Stack;

public class Maximum_Area_Histogram_Stack {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=s.nextInt();
        }
        int nsl[]=new int[n];
        Stack<Integer> st  = new Stack<>();
        st.push(0);
        nsl[0]=-1;
        for (int i = 1; i <n ; i++) {
            while (st.size()!=0&&arr[i]<arr[st.peek()]){
                st.pop();
            }
            if(st.empty()){
                nsl[i]=-1;
            }
            else
                nsl[i]=st.peek();
            st.push(i);
        }
        st = new Stack<>();
        st.push(n-1);
        int nsr[]=new int[n];
        nsr[n-1]= arr.length;
        for (int i = n-1; i >= 0; i--) {
            while (st.size()>0 && arr[i]<arr[st.peek()]){
                st.pop();
            }
            if(st.size()==0){
                nsr[i]= arr.length;
            }
            else
                nsr[i]=st.peek();
            st.push(i);
        }
        int wid=0;
        int maxarea=0;
        for (int i = 0; i < n; i++) {
            wid=nsr[i]-nsl[i]-1;
            int area=wid*arr[i];
            if (area>maxarea){
             maxarea=area;
            }
        }
        System.out.println(maxarea);
    }
}
