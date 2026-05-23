
import java.util.*;
public class Sort_012_Optimal {
   
    public int[] swap(int a,int b, int[] nums)
    {   
        
        //System.out.println("Before : "+Arrays.toString(nums));
        int t =nums[a];
        nums[a]=nums[b];
        nums[b]=t;
        //System.out.println("After : "+Arrays.toString(nums));
        return nums;
    }

    public void sortColors(int[] nums) {
        int s=0,e=nums.length-1;
        int mid =0;
        while(mid<=e)
        {
            if(nums[mid]==2)
                {
                    nums = swap(mid,e,nums);
                    e--;
                }
            else if(nums[mid]==0)
                {   
                    nums = swap(mid,s,nums);
                    s++;
                    mid++;
                }
                else
                {
                    mid++;
                }
        }
    }
    public static void main(String[] args) {
        Sort_012_Optimal s = new Sort_012_Optimal();
        System.out.print("Enter the size of array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of array: ");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        s.sortColors(arr);
    }
}
