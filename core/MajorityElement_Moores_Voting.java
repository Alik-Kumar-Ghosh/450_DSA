//https://practice.geeksforgeeks.org/problems/majority-element-1587115620/1/

public class MajorityElement_Moores_Voting {
    static int majorityElement(int a[], int size)
    {
        // your code here
        int curr=a[0];
        int count=0;
        for(int i=0;i<size;i++){
            if(curr==a[i])
                count++;
            else{
                count--;
                if(count==0){
                    curr=a[i];
                    count=1;
                }
            }
        }
        int maincount=0;
        for(int i=0;i<size;i++)
        {
            if(curr==a[i])
                maincount++;
        }
        if(maincount>size/2)
            return curr;
        else
            return -1;
    }
}
