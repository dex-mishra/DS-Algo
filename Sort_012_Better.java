import java.util.Scanner;

public class Sort_012_Better {
    public void sortColors(int[] nums) {
        int c0=0,c1=0,c2=0;
        for(int i =0;i<nums.length;i++)
        {
            if(nums[i]==0)
                c0++;
            if(nums[i]==1)
                c1++;
            if(nums[i]==2)
                c2++;
        }
        for(int i=0;i<c0;i++)
            nums[i]=0;
        for(int i=c0;i<c0+c1;i++)
            nums[i]=1;
        for(int i=c1+c0;i<nums.length;i++)
            nums[i]=2;
    }

    public void main(String[] args) {
        Sort_012_Better s = new Sort_012_Better();
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
