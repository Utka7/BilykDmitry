import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var number = scanner.nextInt();
        var palindromeChecker  = new PalindromeChecker();
        var isPalindrome = palindromeChecker.isPalindrome(number);
        System.out.println(isPalindrome);
    }
}