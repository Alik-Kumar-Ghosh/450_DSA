import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionTwoSorted {
    public static void main(String[] args) {
        int arr1[]={21, 34, 41, 22, 35};
        int arr2[]={61, 34, 45, 21, 11};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i=0,j=0;
        ArrayList<Integer> ans=new ArrayList<>();
        while(i<arr1.length&&j<arr2.length){
            if(arr1[i]==arr2[j]){
                ans.add(arr1[i]);
                i++;
                j++;
            }
            else if(arr1[i]>arr2[j]){
                j++;
            }
            else{
                i++;
            }
        }
        if(ans.size()==0)
            ans.add(-1);
        System.out.println(ans.toString());
    }
}
