import java.util.Arrays;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateFinderTest {

    @org.junit.jupiter.api.Test
    void findDuplicate() {
        var duplicateFinderInteger = new DuplicateFinder<Integer>();
        var listInteger = Arrays.asList(1, 3, 5, 1, 2, 3, 5, 7, 5);
        var expectedResultInteger = new HashMap<Integer,Integer>();
        expectedResultInteger.put(1,2);
        expectedResultInteger.put(3,2);
        expectedResultInteger.put(5,3);
        var resultInteger = duplicateFinderInteger.findDuplicate(listInteger);
        assertEquals(expectedResultInteger, resultInteger);

        var duplicateFinderString = new DuplicateFinder<String>();
        var listString = Arrays.asList("test", "sqrt", "null", "test", "int");
        var expectedResultString = new HashMap<String,Integer>();
        expectedResultString.put("test",2);
        var resultString = duplicateFinderString.findDuplicate(listString);
        assertEquals(expectedResultString,resultString);

        var duplicateFinderChar = new DuplicateFinder<Character>();
        var listChar = Arrays.asList('q','w','e','r');
        var expectedResultChar = new HashMap<Character,Integer>();
        var resultChar = duplicateFinderChar.findDuplicate(listChar);
        assertEquals(expectedResultChar,resultChar);
    }
}