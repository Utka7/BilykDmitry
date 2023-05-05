import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var text = scanner.nextLine();
        var palindromeChecker  = new PalindromeChecker();
        var isPalindrome = palindromeChecker.isPalindrome(text);
        System.out.println(isPalindrome);
    }
}