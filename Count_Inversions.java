import java.util.*;

class Count_Inversions
 {
    int inv=0;
    // Function to merge two halves
    public int count_merge(int[] arr, int low, int mid, int high) {
        // Create temp array
        int c=0;
        List<Integer> temp = new ArrayList<>();
        int left = low, right = mid + 1;

        // Merge both sorted parts
        while (left <= mid && right <= high) {
            if (arr[left] > arr[right])
            {
                c += mid-left+1;
                temp.add(arr[right++]);
            }
            else
            {
                temp.add(arr[left++]);
            }
        }

        // Add remaining left elements
        while (left <= mid)
            temp.add(arr[left++]);

        // Add remaining right elements
        while (right <= high)
            temp.add(arr[right++]);

        // Copy back to original array
        for (int i = low; i <= high; i++)
            arr[i] = temp.get(i - low);
       
        return c;
    }

    // Recursive merge sort
    public void inv_count(int[] arr, int low, int high) 
    {
        if (low >= high)
            return;

        // Find mid index
        int mid = (low + high) / 2;

        // Sort left half
        inv_count(arr, low, mid);

        // Sort right half
        inv_count(arr, mid + 1, high);

        // Merge both halves
        inv += count_merge(arr, low, mid, high);
        
    }
    public void main(String[] args) {
        int[] arr = {5, 3, 2, 4, 1};
        inv_count(arr, 0, arr.length-1);
        System.out.println("No. of inversions : "+ inv);
    }
 }
