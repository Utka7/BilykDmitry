public class PalindromeChecker {
    public boolean isPalindrome(String str) {
        String lowerCaseStr = str.toLowerCase();
        String reversedStr = new StringBuilder(lowerCaseStr).reverse().toString();
        var isPalindrome = lowerCaseStr.equals(reversedStr);
        return isPalindrome;
    }
}
