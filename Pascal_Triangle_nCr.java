import java.util.*;
class Pascal_Triangle_nCr {
    
    public int ncr(int n, int r)
    { int x=1;
        for (int i=1; i<=r; i++)
        {
            x = x * (n - i + 1) / i;
        }
        return x;
    }
    
    public void generate(int row,int col) {
        System.out.print(ncr(row-1, col-1) + " ");
    }

    public static void main(String[] args) {
        Pascal_Triangle_nCr s = new Pascal_Triangle_nCr();
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        s.generate(row, col);
    }
}
