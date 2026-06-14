public class All_paths_Count {
    
    public int Counter(int i,int j, int m, int n){

        if(i == m-1 && j == n-1){
            return 1 ;
        }
        if(i==m || j==n){
            return 0;
        }
        int right = Counter(i+1, j, m, n);
        int down = Counter(i, j+1, m, n);
        return right + down;
    }
    public static void main(String[] args) {
        All_paths_Count apc = new All_paths_Count();         
        int m = 3;
        int n = 4;
        System.out.println(apc.Counter(0,0, m, n));
        }
}
