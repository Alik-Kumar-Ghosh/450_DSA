import java.util.Scanner;

public class Print_dec_inc {
    public static void desc(int n) {
        System.out.println(n);
        if(n==1)
            return ;
        desc(n-1);
        System.out.println(n);
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        desc(n);
    }
}
