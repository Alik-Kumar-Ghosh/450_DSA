import java.util.*;

public class FirstRepeating {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> arr=new ArrayList<>();
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        int min=0;
        Set<Integer> k=new HashSet<>();
        for (int i = n-1; i >= 0; i--) {
            if(k.contains(arr.get(i))){
                min=arr.get(i);
            }
            else{
                k.add(arr.get(i));
            }
        }
        System.out.println(min);
    }
}
