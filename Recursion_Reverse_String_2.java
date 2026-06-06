public class Recursion_Reverse_String_2 {
    public static void Reverse(String str,int idx,String newStr)
    {
        if (idx==0) {
            System.out.println(newStr+str.charAt(idx));
            return;
        }
        Reverse(str, idx-1,newStr+str.charAt(idx));
    }
    public static void main(String[] args) {
        String str = "Hello";
        Reverse(str, str.length()-1,"");
    }
}
