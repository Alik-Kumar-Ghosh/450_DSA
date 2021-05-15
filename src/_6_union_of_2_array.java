
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class _6_union_of_2_array {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();int m = s.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }

        int b[] = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = s.nextInt();
        }
      int arr[]=new int[n+m];
        int i=0;
        int j=0;
        int k=0;
        while (i<n&&j<m){
            if(a[i]<=b[j]){
                arr[k]=a[i];
                k++;
                i++;
            }
            else {
                arr[k]=b[j];
                k++;
                j++;
            }
        }
        while (i<n){
            arr[k]=a[i];
            k++;
            i++;
        }
        while (j<m){
            arr[k]=b[j];
            k++;
            j++;
        }
       System.out.println(Arrays.toString(arr));
        HashSet <Integer> unoin = new HashSet<>(n+m);
        for (int index:
             arr) {
            unoin.add(index);
        }
        System.out.println(unoin);
        System.out.println(unoin.size());
    }
}
