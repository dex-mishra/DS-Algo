import java.util.Arrays;
import java.util.Scanner;

public class Next_permutation_Optimal {
    public void nextPermutation(int[] nums) {
        int i;
        int idx= -1;
        int n= nums.length;
        for(i =n-2; i>0; i--)
        {
            if(nums[i]<nums[i+1])
            {    
            idx =i;
            break;
            }
        }
        if(idx!= -1)
        {    
        for(i=n-1;i>idx;i--)
        {
            if(nums[i]>nums[idx])
            {
                int t = nums[i];
                nums[i]=nums[idx];
                nums[idx]=t;
                break;
            }
        }
        int arr[] = new int[n-idx-1];
        int c=0;
        for(i=idx+1;i<n;i++)
        {
            arr[c]=nums[i];
            c++;
        }
        Arrays.sort(arr);
        c=0;
        for(i=idx+1;i<n;i++)
        {
            nums[i]=arr[c];
            c++;
        }
        }
        else
        {
            Arrays.sort(nums);
        }
        System.out.println(Arrays.toString(nums));
    }
    public void main(String[] args) {
        Next_permutation_Optimal s = new Next_permutation_Optimal();
        System.out.print("Enter the size of array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of array: ");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        s.nextPermutation(arr);
    }
    
}
