
public class Find_Duplicate_Better{
    public int findDuplicate(int[] nums) 
    {
        int d=0;
        int[] freq = new int[nums.length];
        for(int i=0; i<nums.length;i++)
            {
                if(freq[nums[i]]==1)
                    d=nums[i];
                else
                    freq[nums[i]]++;
            } 
        return d;
    }
}
