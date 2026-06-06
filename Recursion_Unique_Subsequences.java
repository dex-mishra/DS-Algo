import java.util.HashSet;
import java.util.Set;

public class Recursion_Unique_Subsequences {
    public static Set<String> printSubsequences(String str, int index, Set<String> uniqueSubsequences, String current) {
        if (index == str.length()) {
            uniqueSubsequences.add(current);
            return uniqueSubsequences;
        }
        // Include the current character
        printSubsequences(str, index + 1,uniqueSubsequences ,current + str.charAt(index));
        // Exclude the current character
        printSubsequences(str, index + 1,uniqueSubsequences, current);
        return uniqueSubsequences;
    }
    public static void main(String[] args) {
        String str = "aaa";
        Set<String> usb= printSubsequences(str, 0, new HashSet<>(), "");
        System.out.println(usb);
    }   
}
