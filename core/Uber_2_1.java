import java.util.Arrays;
import java.util.Scanner;

public class Uber_2_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[m];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i]=sc.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        int sum=a[a.length-1]+b[b.length-1];
        int r=2;
        int ptra=a.length-2;
        int ptrb=b.length-2;
        while (r<k){
            if(a[ptra]>=b[ptrb]){
                sum=sum+a[ptra];
                ptra--;
            }
            else{
                sum=sum+a[ptrb];
                ptrb--;
            }
            r++;
        }
        System.out.println(sum);
    }
}
