public class PalindromeChecker {
    public boolean isPalindrome(String str){
        StringBuilder reversedTextBuilder = new StringBuilder(str.toLowerCase()).reverse();

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.toLowerCase().charAt(i) != reversedTextBuilder.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
