import static org.junit.jupiter.api.Assertions.*;

class FirstNonRepeatedCharacterFinderTest {

    @org.junit.jupiter.api.Test
    void find() {
        var finder = new FirstNonRepeatedCharacterFinder();
        assertEquals('l', finder.find("alphabet"));
        assertEquals('e', finder.find("hhello"));
        assertThrows(RuntimeException.class, () -> finder.find("qqqqqqqqqq"));
        assertThrows(RuntimeException.class, () -> finder.find(""));
    }
}