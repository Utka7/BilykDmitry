import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextInt();
        PalindromeChecker palindromeChecker  = new PalindromeChecker();
        boolean isPalindrome = palindromeChecker.isPalindrome(number);
        System.out.println(isPalindrome);
    }
}