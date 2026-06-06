public class Recursion_Subsequences {
    public static void printSubsequences(String str, int index, String current) {
        if (index == str.length()) {
            System.out.println(current);
            return;
        }
        // Include the current character
        printSubsequences(str, index + 1, current + str.charAt(index));
        // Exclude the current character
        printSubsequences(str, index + 1, current);
    }
    public static void main(String[] args) {
        String str = "abcde";
        printSubsequences(str, 0, "");
    }   
}
