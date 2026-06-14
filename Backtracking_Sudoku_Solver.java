import java.util.HashMap;

public class Backtracking_Sudoku_Solver {
    public static void Solver(char [][] Board)
    {
        helper(Board, 0, 0);
        
    }
    
    public static boolean helper(char[][] Board,int row,int column)
    {  
        if(row == Board.length)
        {
            for(int i=0;i<Board.length;i++)
            {
                for(int j=0;j<Board.length;j++)
                    if(j!=Board.length-1)
                    {
                    System.out.print(Board[i][j]+" ,");
                    }
                    else
                    System.out.print(Board[i][j]);
                System.err.println();
                }
            return true;
            
        }
        
        int nextRow = row;
        int nextCol = column + 1;
        
        if (column == Board[0].length - 1)
        {
            nextRow = row + 1;
            nextCol = 0;
        }
        
        if(Board[row][column] != '.')
        {
            return helper(Board, nextRow, nextCol);
        }
        else
        {
            for(int i = 1; i <= 9; i++)
            {
                char val = (char) ('0' + i);
                if(isSafe(Board, row, column, val))
                {
                    Board[row][column] = val;
                    if(helper(Board, nextRow, nextCol)) {
                        return true;
                    }
                    Board[row][column] = '.';
                }    
            }
            return false;
        }
    }

    public static boolean isSafe(char[][] Board,int row,int column,char x)
    {
        for(int i = 0; i < Board.length; i++)
        {
            if(Board[i][column] == x)
                return false;
            
            if(Board[row][i] == x)
                return false;
        }
        
        int r = (row / 3) * 3;
        int c = (column / 3) * 3;
        for(int i = r; i < r + 3; i++)
        {
            for(int j = c; j < c + 3; j++)
            {
                if(Board[i][j] == x)
                    return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        char[][] Board = {{'5','3','.','.','7','.','.','.','.'},
                          {'6','.','.','1','9','5','.','.','.'},
                          {'.','9','8','.','.','.','.','6','.'},
                          {'8','.','.','.','6','.','.','.','3'},
                          {'4','.','.','8','.','3','.','.','1'},
                          {'7','.','.','.','2','.','.','.','6'},
                          {'.','6','.','.','.','.','2','8','.'},
                          {'.','.','.','4','1','9','.','.','5'},
                          {'.','.','.','.','8','.','.','7','9'}};
        Backtracking_Sudoku_Solver obj = new Backtracking_Sudoku_Solver();
        obj.Solver(Board);
    }
}
