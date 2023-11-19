import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class specialCharactersTest {

    @Test
    public void testSpecialCharacters() {
        // Skapa ett TextProcessor objekt
        textProcessor processor = new textProcessor();

        // Mata in specialtecknen
        processor.processLine("!@#$%^&*()");
        assertEquals(11, processor.totalCharacters);
        assertEquals(1, processor.lineCount);
    }
}

