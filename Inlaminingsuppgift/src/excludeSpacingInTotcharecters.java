import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class excludeSpacingInTotcharecters {

    @Test
    public void testIgnoreWhitespaceInCharacterCount() {
        textProcessor processor = new textProcessor();

        // Testa en rad med mellanslag
        processor.processLine("1 2 3 4");
        assertEquals(7, processor.totalCharacters);
    }
}