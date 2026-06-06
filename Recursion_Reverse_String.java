public class Recursion_Reverse_String {
    public static void Reverse(String str,int idx)
    {
        if (idx==0) {
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        Reverse(str, idx-1);
    }
    public static void main(String[] args) {
        String str = "Hello";
        Reverse(str, str.length()-1);
    }
}
