import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharacterFinder {
    public char find(String string){

        char resultCharacter = ' ';
        var charCountMap = new LinkedHashMap<Character, Integer>();

        for (int i = 0; i < string.length(); i++){
            var ch = string.charAt(i);
            charCountMap.put(ch, charCountMap.getOrDefault(ch,0 ) + 1);
        }

        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()){
            if (entry.getValue() == 1){
                return entry.getKey();
            }
        }

        throw new RuntimeException("a non-repeatable character was not found in the string");
    }
}
