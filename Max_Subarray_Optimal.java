//KADANE'S ALGORITHM
public class Max_Subarray_Optimal {
        public int maxSubArray(int[] nums) {
             int maxsum=Integer.MIN_VALUE ,ssum=0;
        int n = nums.length;
        int i;
        for(i=0;i<n;i++)
        {   
            ssum +=nums[i];
            if(ssum > maxsum)
                maxsum=ssum;
            if(ssum<0)
                ssum=0;
        }
        return maxsum;
        }
}
