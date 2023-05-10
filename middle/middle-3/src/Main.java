public class Main {
    public static void main(String[] args) {
        var string = "hello";
        var firstNonRepeatedCharacterFinder = new FirstNonRepeatedCharacterFinder();
        var nonRepeatCharacter = firstNonRepeatedCharacterFinder.find(string);
        System.out.println(nonRepeatCharacter);
    }
}