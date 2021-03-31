import java.util.Scanner;
public class _1Reverse_String {
    public static <string> void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str = s.next();
        char[] arr = str.toCharArray();
        int len =str.length();
        for(int i=0;i<len/2;i++){
            char temp= arr[i];
            arr[i]=arr[len - i - 1];
            arr[len - i - 1]=temp;
        }
        str = String.valueOf(arr);
        System.out.println(str);
    }
}
