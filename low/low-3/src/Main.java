import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var text = scanner.nextLine();
        var stringReverser = new StringReverser();
        var reversedText = stringReverser.reverse(text);
        System.out.println(reversedText);
    }
}