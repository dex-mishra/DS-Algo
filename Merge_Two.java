import java.util.*;

public class Merge_Two {
    public void merge(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int left=m-1,right=0;
        for(int i=0;i<m;i++)
        {
            if(nums1[left]>nums2[right])
            {
                int t= nums1[left];
                nums1[left] = nums2[right];
                nums2[right]=t;
            }
            else
                break;
        }
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
    }
}
