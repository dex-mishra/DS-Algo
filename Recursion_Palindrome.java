public class Recursion_Palindrome {
    static int x = 0;
    public static void reverse(int arr[], int start, int end)
    {
        
        if(start >= end)
        {
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverse(arr, start+1, end-1);
        if(arr[start] != arr[end])
        {
            x=1;
            return;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        Recursion_Palindrome.reverse(arr, 0, n-1);
        if(x == 0)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
    }
}
