import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextInt();
        System.out.println(isPalindrome(number));
    }

    public static boolean isPalindrome(long num){
        if(num < 0){
            return false;
        }

        long reversed = 0;
        long tmp = num;

        while (tmp != 0){
            long digit = tmp % 10;
            reversed = reversed * 10 + digit;
            tmp = tmp / 10;
        }

        return reversed == num;
    }
}