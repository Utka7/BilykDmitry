public class PalindromeChecker {
    public boolean isPalindrome(String str) {
        return str.toLowerCase().equals(new StringBuilder(str.toLowerCase()).reverse().toString());
    }
}
