public class FirstNonRepeatedCharacterFinder {
    final static int ALPHABET_SIZE = 26;

    public char find(String string) {
        var countCharArray = new int[ALPHABET_SIZE];

        for (var i = 0; i < string.length(); i++) {
            var ch = string.charAt(i);
            countCharArray[ch - 'a']++;
        }

        for (var i = 0; i < string.length(); i++) {
            var ch = string.charAt(i);
            if (countCharArray[ch - 'a'] == 1) {
                return ch;
            }
        }

        throw new RuntimeException("No non-repeated character found in the string");
    }

}
