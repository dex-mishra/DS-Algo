public class Tiling {
    
    public int Place(int n,int m)
    {
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        int vertical = Place(n-m,m);

        int horizontal = Place(n-1,m);
        return vertical + horizontal;
    }
    public static void main(String[] args) {
        Tiling apc = new Tiling();         
        int m = 2;
        int n = 5;
        System.out.println(apc.Place(n,m));
        }
}
