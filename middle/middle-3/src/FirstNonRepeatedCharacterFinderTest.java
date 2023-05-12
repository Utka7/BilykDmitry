import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstNonRepeatedCharacterFinderTest {

    @Test
    void find_NonRepeatedCharacter_ReturnExpectedResult() {
        var finder = new FirstNonRepeatedCharacterFinder();
        assertEquals('l', finder.find("alphabet"));
    }

    @Test
    void find_RepeatedCharacter_ThrowRuntimeException(){
        var finder = new FirstNonRepeatedCharacterFinder();
        assertThrows(RuntimeException.class, () -> finder.find("qqqqqqqqqq"));
        assertThrows(RuntimeException.class, () -> finder.find(""));
    }

    @Test
    void find_EmptyString_ThrowRuntimeException(){
        var finder = new FirstNonRepeatedCharacterFinder();
        assertThrows(RuntimeException.class, () -> finder.find(""));
    }
}