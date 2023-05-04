import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println(isPalindrome(text));
    }

    public static boolean isPalindrome(String str){
        String cleanStr = str.replace(" ","").toLowerCase();

        for (int i = 0; i < str.length() / 2; i++){
                if(cleanStr.charAt(i) != cleanStr.charAt(cleanStr.length() - i - 1)){
                    return false;
                }
        }
        return true;
    }
}