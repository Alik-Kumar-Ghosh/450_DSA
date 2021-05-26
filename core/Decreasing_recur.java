import java.util.Scanner;

public class Decreasing_recur {
    public static int desc(int n){
        System.out.println(n);
        if(n==1)
            return 1;
        return desc(n-1);
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        desc(n);
    }
}
