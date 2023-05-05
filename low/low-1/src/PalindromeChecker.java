public class PalindromeChecker {
    public boolean isPalindrome(String str) {
        var lowerCaseStr = str.toLowerCase();
        var reversedStr = new StringBuilder(lowerCaseStr).reverse().toString();
        var isPalindrome = lowerCaseStr.equals(reversedStr);
        return isPalindrome;
    }
}
