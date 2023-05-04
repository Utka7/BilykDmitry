public class PalindromeChecker {
    public boolean isPalindrome(String str){
        String cleanStr = str.replace(" ","").toLowerCase();

        for (int i = 0; i < str.length() / 2; i++){
            if(cleanStr.charAt(i) != cleanStr.charAt(cleanStr.length() - i - 1)){
                return false;
            }
        }
        return true;
    }
}
