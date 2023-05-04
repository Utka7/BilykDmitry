public class PalindromeChecker {
    public static boolean isPalindrome(long number){
        if(number < 0){
            return false;
        }

        long reversedNumber = 0;
        long tmpNumber = number;

        while (tmpNumber != 0){
            long digit = tmpNumber % 10;
            reversedNumber = reversedNumber * 10 + digit;
            tmpNumber = tmpNumber / 10;
        }

        return reversedNumber == number;
    }
}
