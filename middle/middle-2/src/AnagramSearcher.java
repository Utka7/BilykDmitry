public class AnagramSearcher {
    public boolean isAnagram(String firstString, String secondString){
        if (firstString.length() != secondString.length()){
            return false;
        }
        var alphabetSize = 26;
        int[] countLetterArray = new int[alphabetSize];

        for (int i = 0; i < firstString.length(); i++){
            char c1 = firstString.charAt(i);
            char c2 = secondString.charAt(i);
            countLetterArray[c1 - 'a']++;
            countLetterArray[c2 - 'a']--;
        }

        for (int i = 0; i < alphabetSize; i++){
            if (countLetterArray[i] != 0){
                return false;
            }
        }

        return true;
    }
}
