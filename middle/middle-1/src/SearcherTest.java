import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SearcherTest {

    @Test
    void binarySearch_ValidKeys_ReturnsCorrectIndex() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        var key1 = 1;
        var key2 = 12;
        var key3 = 8;
        var searcher = new Searcher();
        var result1 = searcher.binarySearch(array, key1);
        var result2 = searcher.binarySearch(array, key2);
        var result3 = searcher.binarySearch(array, key3);
        Assertions.assertEquals(0, result1);
        Assertions.assertEquals(11, result2);
        Assertions.assertEquals(7, result3);
    }
}