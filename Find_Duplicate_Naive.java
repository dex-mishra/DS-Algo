import java.util.Arrays;

public class Find_Duplicate_Naive {
    public int findDuplicate(int[] nums) 
    {
        Arrays.sort(nums); 
        int d=0;
        for(int i=1; i<nums.length;i++)
            {
                if(nums[i]==nums[i-1])
                    d=nums[i];
            } 
        return d;
    }
}
