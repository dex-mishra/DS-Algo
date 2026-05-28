

public class Find_Duplicate_and_Repeating_Optimal_Math
{
    public int[] findMissingRepeatingNumbers(int[] nums) 
    {
        long r=-1,m=-1;
        long n = nums.length;
        long sumdif=0,sumsqrdif=0;
       for(int i=1;i<=n;i++)
       {
        sumdif += nums[i-1]-i;
        sumsqrdif += (long)nums[i-1]*(long)nums[i-1]-i*i;
       }
       long sum = sumsqrdif/sumdif;
       r = (sum +sumdif)/2;
       m= (sum -sumdif)/2;
        return new int[]{(int) r, (int) m};
    }

    public class Main {
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 5, 4, 6, 7, 5};

        // Create an instance of Solution class
        Find_Duplicate_and_Repeating_Optimal_Math sol = new Find_Duplicate_and_Repeating_Optimal_Math();

        int[] result = sol.findMissingRepeatingNumbers(nums);

        // Print the repeating and missing numbers found
        System.out.printf("The repeating and missing numbers are: {%d, %d}\n", result[0], result[1]);
    }
}
}