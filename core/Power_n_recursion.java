import java.util.Scanner;

public class Power_n_recursion {
    public static int power(int n){
        //System.out.println(n);
        if(n==1)
            return 2;
        return 2*power(n-1);
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(power(n));
    }
}
