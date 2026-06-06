public class All_paths_Count {
    int count = 0;
    public void Counter(int i,int j, int m, int n){

        if(i == m-1 && j == n-1){
            count++;
            return ;
        }
        if(i==m || j==n){
            return;
        }
        if(i==m-1 && j<n){
            Counter(i, j+1, m, n);
        }        
        if(i<m && j==n){
            Counter(i+1, j, m, n);
        }
        Counter(i+1, j, m, n);
        Counter(i, j+1, m, n);
        System.out.println(count);
    }
    public static void main(String[] args) {
        All_paths_Count apc = new All_paths_Count();         
        int m = 3;
        int n = 3;
        apc.Counter(0,0, m, n);
            //System.out.println("Total paths from " + "(0,0)" + " to (" + m +","+n + "): " + );
    }
}
