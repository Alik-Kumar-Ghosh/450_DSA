import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int arr[]={1,21,5,12,61,9,52,40};
        arr= merge(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static int[] merge(int arr[],int l,int h){
        if (l == h) {
            int[]na = new int[1];
            na[0] = arr[l];
            return na;
        }
        int mid= (l+h)/2;
        int first[]=merge(arr,l,mid);
        int second[]=merge(arr, mid+1, h);
        int fin[]=merger(first,second);
        return fin;
    }

    static int[] merger(int[] first, int[] second) {
        int l=0;
        int r=0;
        int i=0;
        int narr[]=new int[first.length+second.length];
        while(l< first.length&&r< second.length){
            if(first[l]<=second[r]){
                narr[i]=first[l];
                l++;
                i++;
            }
            else{
                narr[i]=second[r];
                r++;
                i++;
            }
        }
        while (l<first.length){
            narr[i]=first[l];
            l++;
            i++;
        }
        while (r< second.length){
            narr[i]=second[r];
            r++;
            i++;
        }
       // System.out.println(Arrays.toString(narr));
        return narr;
    }
}
