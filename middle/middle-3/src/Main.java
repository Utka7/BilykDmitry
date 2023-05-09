public class Main {
    public static void main(String[] args) {

        String string = "hello";
        var firstNonRepeatedCharacterFinder = new FirstNonRepeatedCharacterFinder();
        var nonRepeatCharacter = firstNonRepeatedCharacterFinder.find(string);
        System.out.println(nonRepeatCharacter);
    }
}