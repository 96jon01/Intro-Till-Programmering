import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class totalCharactersTest {

    @Test
        // Totalt angivna tecken
    void testTotalCharacters() {
        textProcessor processor = new textProcessor();

        // Anropa processLine med en parameter
        processor.processLine("1234");
        processor.processLine("1234");

        // Verifiera expected är det actual värdet
        assertEquals(8, processor.totalCharacters);
    }
}





