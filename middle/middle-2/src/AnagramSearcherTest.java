import static org.junit.jupiter.api.Assertions.*;

class AnagramSearcherTest {

    @org.junit.jupiter.api.Test
    void isAnagram() {
        AnagramSearcher searcher = new AnagramSearcher();
        String firstString = "race";
        String secondString = "care";
        boolean result = searcher.isAnagram(firstString, secondString);
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