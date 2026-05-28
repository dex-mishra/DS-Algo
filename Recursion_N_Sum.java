public class Recursion_N_Sum {

    int sum = 0;
    public void summer(int n)
    {
        sum += n;
        if(n == 1)
        {
            return;
        }
        summer(n-1);
        
    }
    public void main(String[] args) {
        int n = 15;
        summer(n);
        System.out.println("Sum : "+sum);
    }
    
}