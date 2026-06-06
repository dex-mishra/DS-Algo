public class Recursion_PowerN_brute {
    public static int PowerN(int x,int n)
    {
        if (n==0) {
            return 1;
        }
        else
        {
            return x*PowerN(x, n-1);
        }
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        System.out.println(PowerN(x, n));
    }
}
