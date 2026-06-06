public class Keypad_Combination {
    public static void printCombinations(String digits, String[] mapping, int index, String current) {
        if (index == digits.length()) {
            System.out.println(current);
            return;
        }
        String letters = mapping[digits.charAt(index) - '0'];
        for (int i = 0; i < letters.length(); i++) {
            printCombinations(digits, mapping, index + 1, current + letters.charAt(i));
        }
    }
    public static void main(String[] args) {
        String digits = "23";
        String[] mapping = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        printCombinations(digits, mapping, 0, "");
    }
}
