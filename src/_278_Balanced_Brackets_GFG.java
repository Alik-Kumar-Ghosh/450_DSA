import java.util.Scanner;
import java.util.Stack;

public class Balanced_Brackets_GFG {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int flag=0;
        Stack<Character> st = new Stack<>();
        for (int i = 0; i <str.length() ; i++) {
            char ch=str.charAt(i);
            if(ch == ')'&&st.size()!=0){
                if(st.peek()=='('){
                    st.pop();
                }
                else{
                    flag=1;
                }
            }
            else if(ch == ']'&&st.size()!=0){
                if(st.peek()=='['){
                    st.pop();
                }
                else{
                    flag=1;
                }
            }
            else if(ch == '}'&&st.size()!=0){
                if(st.peek()=='{'){
                    st.pop();
                }
                else{
                    flag=1;
                }
            }
            else
                st.push(ch);
        }
        if (!st.empty()){
            flag=1;
        }
        if(flag==1)
            System.out.println("false");
        else
            System.out.println(true);
    }
}
