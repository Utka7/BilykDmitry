import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AnagramSearcherTest {

    @Test
    void isAnagram_ValidInput_ReturnsTrue() {
        var searcher = new AnagramSearcher();
        var firstString = "race";
        var secondString = "care";
        var result = searcher.isAnagram(firstString, secondString);
        assertTrue(result);
    }

    @Test
    void isAnagram_InvalidInput_ReturnsFalse() {
        var searcher = new AnagramSearcher();
        var firstString = "car";
        var secondString = "care";
        var result = searcher.isAnagram(firstString, secondString);
        assertFalse(result);
    }
}