
public class Find_Duplicate_and_Repeating_Better{
    public int[] findDuplicate(int[] nums) 
    {
        int r=-1, m=-1;
        int[] freq = new int[nums.length];
        for(int i=0; i<nums.length;i++)
            {
                    freq[nums[i]-1]++;
            } 
        for(int i=0; i<nums.length;i++)
        {
            if(freq[i]==2)
                r = i+1;
            else if(freq[i]==0)
                m = i+1;
        }
        return new int[]{r,m};
    }
}
