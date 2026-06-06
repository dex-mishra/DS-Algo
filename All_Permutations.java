public class All_Permutations {
    public void allPermutations(String s, String ans)
    {
        if(s.length()==0)
        {
            System.out.println(ans);
            return;
        }
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            String ros = s.substring(0,i)+s.substring(i+1);
            allPermutations(ros, ans+ch);
        }
    }   
    public static void main(String[] args) {
        All_Permutations s = new All_Permutations();
        String str = "abc";
        s.allPermutations(str, "");
    }
}
