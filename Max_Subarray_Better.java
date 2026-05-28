

public class Max_Subarray_Better {
    
    public int maxSubArray(int[] nums) {
        int maxsum=Integer.MIN_VALUE ,ssum;
        int n = nums.length;
        int i,j,k;
        
        
        for(i=0;i<n;i++)
        {
            ssum=nums[i];
            for(j=i+1;j<n;j++)
            {   
                if(ssum>maxsum)
                {
                    maxsum=ssum;
                }
                ssum+=nums[j];
            }
        
        }
        
        return maxsum;
    
    }
}


