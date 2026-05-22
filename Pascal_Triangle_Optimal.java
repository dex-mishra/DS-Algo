import java.util.Scanner;

class Pascal_Triangle_Optimal {
    public void generate(int N) {
        for(int i=1;i<=N;i++)
        {
            int x =1;
            for(int j =1;j<=i;j++)
            {
            if(j==i)
                System.out.print(x);
            else
                System.out.print(x + ", ");
            x=x*(i-j)/j;
            }
             System.out.println();}
    }

    public static void main(String[] args) {
        Pascal_Triangle_Optimal s = new Pascal_Triangle_Optimal();
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        s.generate(row);
    }
}
