import java.util.Scanner;

public class _5Move_negatives_left {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int loc =0;
        for (int i = 0; i < n; i++) {
            if(arr[i]<0){
                if(i!=loc){
                int temp = arr[i];
                arr[i]=arr[loc];
                arr[loc]=temp;
                }
                loc++;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }
}
