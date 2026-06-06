public class Recursion_PowerN_Optimal {
    public static int PowerN(int x,int n)
    {
        if(x==0)
        {
            return 0;
        }
        if (n==0) {
            return 1;
        }
        else if (n%2==0) {
            int halfPower = PowerN(x, n/2);
            return halfPower*halfPower;
        }
        else
        {
            int halfPower = PowerN(x, n/2);
            return x*halfPower*halfPower;
        }
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        System.out.println(PowerN(x, n));
    }
}
