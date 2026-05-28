

public class Max_Subarray_Brute {
    
    public int maxSubArray(int[] nums) {
        int maxsum=0 ,ssum =0;
        int n = nums.length;
        int i,j,k;
        
        
        for(i=0;i<n;i++)
        {
            for(j=i;j<n;j++)
            {
                
                for(k=i;k<=j;k++)
                    {
                        ssum += nums[k];
                    }
                if(ssum>maxsum)
                {
                    maxsum=ssum;
                }
                ssum =0;
            }
        
        }
        
        return maxsum;
    
    }
}

