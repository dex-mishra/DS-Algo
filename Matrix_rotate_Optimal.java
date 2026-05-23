public class Matrix_rotate_Optimal 
{
    public int[][] swap(int i,int j, int[][] nums)
    {   
        int n = nums.length-1;
        int t =nums[i][j];
        nums[i][j]=nums[n-j][i];
        nums[n-j][i]=nums[n-i][n-j];
        nums[n-i][n-j] = nums[j][n-i];
        nums[j][n-i] =t;
        return nums;
    }
    public void rotate(int[][] matrix) {
        int i=0,j=0;
        int n= matrix.length-1;
        while(i<=Math.floor(n+1/2)-1)
        {
            while(j<=n-i-1)
                {
                    matrix = swap(i,j,matrix);
                    j++;
                }
                i++;
                j=i;
        }
    }
        
}
