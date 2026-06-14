import java.util.*;

public class Backtracking_NQueens_prac {
    public static List<List<String>> Nqueen_solver(int n)
    {
        List<List<String>> fin = new ArrayList<>();
        char [][] Board = new char[n][n];
        for(int i =0;i<n;i++)
            for(int j=0;j<n;j++)
                Board[i][j]='.';
        helper(Board,fin,0);
        return fin;
    }
    public static void helper(char [][]Board,List<List<String>> fin, int col)
    {
        if(col==Board.length)
        {
            SaveBoard(Board,fin);
            return;
        }
        for (int row = 0; row < Board.length; row++) {
            if (safe(Board, row, col)) {
                // Place the queen
                Board[row][col] = 'Q';
                
                // Recurse for the next column
                helper(Board, fin, col + 1);
                
                // BACKTRACK: Remove the queen and try the next row
                Board[row][col] = '.';
            }}
}

public static void SaveBoard(char [][]Board,List<List<String>> fin)
{
    List<String> s = new ArrayList<>();
    for(int i =0; i< Board.length ;i++)
    {
        String S = "";
        for(int j=0;j<Board.length;j++)
        {
            S=S+Board[i][j];
        }
        s.add(S);
        
    }
    fin.add(s);
}
    public static boolean safe(char [][]Board, int row, int col)
    {
        int i=0;int j=0;
        for(i=0;i<col;i++)
        {
            if(Board[row][i]=='Q')
                return false;
        }
        for(j=0;j<row;j++)
        {
            if(Board[j][col]=='Q')
                return false;
        }
        for(i=row,j=col; i>=0 && j>=0; i--,j--)
        {
            if(Board[i][j]=='Q')
                return false;
        }
        for(i=row,j=col; i<Board.length && j>=0; i++,j--)
        {
            if(Board[i][j]=='Q')
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        
        int n = 4;
        List<List<String>> res = Nqueen_solver(n);
        System.out.println(res);
    }
}

