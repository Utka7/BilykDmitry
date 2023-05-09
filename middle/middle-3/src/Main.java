public class Main {
    public static void main(String[] args) {
        String string = "hello";
        int[] array = {1,1,2,3,5,6,4};
        var firstNonRepeatedCharacterFinder = new FirstNonRepeatedCharacterFinder();
        var nonRepeatCharacter = firstNonRepeatedCharacterFinder.find(string);
        var nonRepeatNumber = firstNonRepeatedCharacterFinder.find(array);
        System.out.println(nonRepeatCharacter);
        System.out.println(nonRepeatNumber);
    }
}