import java.util.Scanner;

class Pascal_Triangle_nth_Optimal {
    public void generate(int N) {
        int x =1;
        for(int i=1;i<=N;i++)
        {
            
            if(i==N)
                System.out.print(x);
            else
                System.out.print(x + ", ");
            x=x*(N-i)/i;
        }
    }

    public static void main(String[] args) {
        Pascal_Triangle_nth_Optimal s = new Pascal_Triangle_nth_Optimal();
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        s.generate(row);
    }
}
