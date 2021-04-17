import java.util.Scanner;

public class _8kadane_algo {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int sum=0,max=arr[0];
        for (int i = 0; i < n; i++) {
            sum+=arr[i];
            if(max<sum){
                max=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        System.out.println(max);
    }
}
