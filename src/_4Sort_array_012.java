import java.util.Scanner;

public class _4Sort_array_012 {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        int first = 0,last=n-1,prt=0;
        for (int i = 0; prt<last ; i++) {
            if(a[prt]==0){
                int temp;
                temp=a[prt];
                a[prt]=a[first];
                a[first]=temp;
                first++;
                prt++;
            }
            else if (a[prt]==2){
                int temp;
                temp=a[prt];
                a[prt]=a[last];
                a[last]=temp;
                last--;
            }
            else if(a[prt]==1)
            prt++;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }
    }

}


