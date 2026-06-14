import java.util.ArrayList;
import java.util.Arrays;    
import java.util.List;
public class Backtracking_Nqueens {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        char[][] board = new char[n][n];
        for (char[] column : board) {
            Arrays.fill(column, '.');
        }
        backtrack(res, board, 0);
        return res;
    }
    public void backtrack(List<List<String>> res, char[][] board, int column) {
       for (int row = 0; row < board.length; row++) {
           if (isSafe(board, row, column)) {
               board[row][column] = 'Q';
               if (column == board.length - 1) {
                   res.add(construct(board));
                   return;
               } else {
                   backtrack(res, board, column + 1);
               }
               board[row][column] = '.';
           }
        }
    }
    public boolean isSafe(char[][] board, int row, int column) {
        for (int i = 0; i < column; i++) {
            if (board[row][i] == 'Q') {
                return false;
            }
        }
        for (int i = row, j = column; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        for (int i = row, j = column; i < board.length && j >= 0; i++, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }
    public List<String> construct(char[][] board) {
        List<String> res = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            String s = new String(board[i]);
            res.add(s);
        }
        return res;
    }
    public static void main(String[] args) {
        Backtracking_Nqueens obj = new Backtracking_Nqueens();
        int n = 4;
        List<List<String>> res = obj.solveNQueens(n);
        System.out.println(res);
    }
}

