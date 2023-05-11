public class AnagramSearcher {
    final static int ALPHABET_SIZE = 26;

    public boolean isAnagram(String firstString, String secondString){
        if (firstString.length() != secondString.length()){
            return false;
        }

        var countLetterArray = new int[ALPHABET_SIZE];

        for (int i = 0; i < firstString.length(); i++){
            var c1 = firstString.charAt(i);
            var c2 = secondString.charAt(i);
            countLetterArray[c1 - 'a']++;
            countLetterArray[c2 - 'a']--;
        }

        for (int i = 0; i < ALPHABET_SIZE; i++){
            if (countLetterArray[i] != 0){
                return false;
            }
        }

        return true;
    }
}
