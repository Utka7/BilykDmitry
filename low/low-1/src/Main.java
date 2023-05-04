import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        PalindromeChecker palindromeChecker  = new PalindromeChecker();
        System.out.println(palindromeChecker.isPalindrome(text));
    }
}