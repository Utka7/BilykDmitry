import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AnagramSearcherTest {

    @org.junit.jupiter.api.Test
    void isAnagram() {
        var searcher = new AnagramSearcher();
        var firstString = "race";
        var secondString = "care";
        var result = searcher.isAnagram(firstString, secondString);
        assertTrue(result);

        firstString = "car";
        secondString = "care";
        result = searcher.isAnagram(firstString, secondString);
        assertFalse(result);

        firstString = "listen";
        secondString = "silent";
        result = searcher.isAnagram(firstString, secondString);
        assertTrue(result);

        firstString = "hello";
        secondString = "oelhl";
        result = searcher.isAnagram(firstString, secondString);
        assertTrue(result);

        firstString = "qwerty";
        secondString = "ytrewq";
        result = searcher.isAnagram(firstString, secondString);
        assertTrue(result);
    }
}