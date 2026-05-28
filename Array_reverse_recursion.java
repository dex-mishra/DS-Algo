public class Array_reverse_recursion {
    public void reverse(int arr[], int start, int end)
    {
        if(start >= end)
        {
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverse(arr, start+1, end-1);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        Array_reverse_recursion obj = new Array_reverse_recursion();
        obj.reverse(arr, 0, n-1);
        for(int i =0; i < n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
