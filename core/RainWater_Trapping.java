/*
* https://practice.geeksforgeeks.org/problems/trapping-rain-water-1587115621/1
* */
public class RainWater_Trapping {


    class Solution{

        // arr: input array
        // n: size of array
        // Function to find the trapped water between the blocks.
        static long trappingWater(int arr[], int n) {
            // Your code here
            int maxl[]=new int[n];
            int maxr[]=new int[n];
            maxl[0] = arr[0];
            for(int i = 1;i<=n-1;i++){
                maxl[i]=Math.max(maxl[i-1],arr[i]);

            }
            maxr[n-1]=arr[n-1];
            for(int i = n-2;i>=0;i--){
                maxr[i]=Math.max(maxr[i+1],arr[i]);

            }
            long water[]=new long[n];
            for(int i=0;i<n;i++)
            {
                water[i]=Math.min(maxl[i],maxr[i])-arr[i];
            }
            long ans=0;
            for(long i : water)
                ans=ans+i;
            return ans;
        }
    }



}
