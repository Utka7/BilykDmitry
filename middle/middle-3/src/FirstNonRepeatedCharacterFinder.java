import java.util.HashMap;

public class FirstNonRepeatedCharacterFinder {
    public char find(String string){
        var charCountMap = new HashMap<Character, Integer>();

        for (char ch : string.toCharArray()){
            charCountMap.put(ch, charCountMap.getOrDefault(ch,0 ) + 1);
        }

        for (char ch : string.toCharArray()) {
            if (charCountMap.get(ch) == 1) {
                return ch;
            }
        }

        throw new RuntimeException("a non-repeatable character was not found in the string");
    }

    public int find(int[] array){
        var numberCountMap = new HashMap<Integer, Integer>();

        for (int number : array){
            numberCountMap.put(number, numberCountMap.getOrDefault(number, 0) + 1);
        }

        for (int number : array){
            if (numberCountMap.get(number) == 1){
                return number;
            }
        }

        throw new RuntimeException("a non-repeatable character was not found in the array");
    }
}
