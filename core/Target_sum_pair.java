import java.util.Arrays;
import java.util.Scanner;

public class Target_sum_pair {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= s.nextInt();
        }
        int k=s.nextInt();
        Arrays.sort(arr);
        /*for (int index:
             arr) {
            System.out.println(index);
        }*/
        int li=0,ri= arr.length-1;
        while (li<ri){
           // System.out.println("else if"+ li);
            if(arr[li]+arr[ri]>k){
                ri--;
             //   System.out.println("if");
            }
            else if (arr[li]+arr[ri]<k){
                li++;

            }
            else {
                System.out.println(arr[li] + " , " + arr[ri]);
                li++;
                ri--;
            }
        }
    }
}
