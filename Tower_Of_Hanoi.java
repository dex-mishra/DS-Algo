public class Tower_Of_Hanoi {
    public static void towerOfHanoi(int n,char src,char dest,char helper)
    {
        if (n==1) {
            System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
            return;
        }
        towerOfHanoi(n-1, src, helper, dest); 
        //Step 1: Move n-1 disks from source to helper
        System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
        //Step 2: Move the nth disk from source to destination
        towerOfHanoi(n-1, helper, dest, src);
        //Step 3: Move n-1 disks from helper to destination
    }
    public static void main(String[] args) {
        int n = 3;
        towerOfHanoi(n, 'A', 'C', 'B');
    }
}
