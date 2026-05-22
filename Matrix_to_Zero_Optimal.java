class Matrix_to_Zero_Optimal {
    public void setZeroes(int[][] matrix) {
        int i,j;
        int col0 =1;
        for(i =0; i < matrix.length;i++)
        {
            for(j =0; j < matrix[0].length;j++)
            {
                if(matrix[i][j] == 0)
                {
                    matrix[i][0] = 0;
                    if(j != 0)
                    {
                        matrix[0][j] = 0;
                    }
                    else
                    {
                        col0 = 0;
                    }
                }
            }
        }
        for(i =1; i < matrix.length;i++)
        {
            for(j =1; j < matrix[0].length;j++)
            {
                if(matrix[i][0] == 0 || matrix[0][j] == 0)
                {
                    matrix[i][j] = 0;
                }
            }
        }
        if(matrix[0][0] == 0) //checking first row and first column together because they are sharing the same cell
        {
            for(j =0; j < matrix[0].length;j++)
            {
                matrix[0][j] = 0;
            }
        }
        if(col0 == 0) //checking first column separately because it is sharing the same cell with first row
        {
            for(i =0; i <  matrix.length;i++)
            {
                matrix[i][0] = 0;
            }
        }
    }
}