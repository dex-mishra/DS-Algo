import java.util.Scanner;

class Pascal_Triangle_nth {
    public int ncr(int n, int r)
    { int x=1;
        for (int i=1; i<=r; i++)
        {
            x = x * (n - i + 1) / i;
        }
        return x;
    }
    
    public void generate(int N) {
        for(int i=1;i<=N;i++)
        {
            if(i==N)
                System.out.print(ncr(N-1, i-1));
            else
                System.out.print(ncr(N-1, i-1) + ", ");
        }
    }

    public static void main(String[] args) {
        Pascal_Triangle_nth s = new Pascal_Triangle_nth();
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        s.generate(row);
    }
}
