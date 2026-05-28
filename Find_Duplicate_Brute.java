
public class Find_Duplicate_Brute {
    public int findDuplicate(int[] nums) 
    {
        int d=0;
        for(int i=0; i<nums.length-1;i++)
            {
                for(int j=i+1;j<nums.length;j++)
                {
                    if(nums[i]==nums[j])
                        d=nums[i];
                }
            } 
        return d;
    }
}
