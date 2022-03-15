//https://practice.geeksforgeeks.org/problems/plus-one/1/#
public class Plus_One {

    class Solution {
        static ArrayList<Integer> increment(ArrayList<Integer> arr , int N) {
            // code here
            ArrayList<Integer> ans=new ArrayList<Integer>();
            if(arr.get(N-1)==9){
                int i=N-1;
                int count=0;
                while(i>=0&&arr.get(i)==9){
                    // System.out.println("-"+i);
                    ans.add(0,0);
                    i--;
                    count++;
                }
           /*  System.out.println("-"+i);
            for(int k:ans)
           System.out.println("+"+k);*/
                if(count==N){
                    ans.add(0,1);
                }
                else{
                    for(int z=0;z<=i;z++){
                        if(z==i){
                            ans.add(z,arr.get(z)+1);
                        }
                        else{
                            ans.add(z,arr.get(z));
                        }
                    }
                }
            }
            else {
                for(int i:arr){
                    ans.add(i);
                }
                ans.set(N-1,ans.get(N-1)+1);
            }
            return ans;
        }
    };
}
