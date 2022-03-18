//https://leetcode.com/problems/rotate-array/

public class RotateArray_By_K {
    class Solution {
        public void rotate(int[] arr, int d) {
            int n=arr.length;
            d=d%n;
            rev(arr,0,n-1);
            rev(arr,0,d-1);
            rev(arr,d,n-1);
        }
        void rev(int arr[],int start,int end){
            // int l=start;
            // int r=end;
            // while(l<r){
            //     int temp;
            //     temp=arr[l];
            //     arr[r]=arr[l];
            //     arr[l]=temp;
            //     l++;
            //     r--;
            // }
            for(int i=start,j=end;i<j;i++,j--){
                int temp =arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }

}
