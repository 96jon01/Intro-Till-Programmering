// CountLinesTest.java

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class countLinesTest {

    @Test
    public void countAmountOfLines() {
        textProcessor processor = new textProcessor();

        // Testa med 100 rader
        for (int i = 1; i <= 1001; i++) {
            String line = "Rad " + i;
            processor.processLine(line);
        }

        assertEquals(1000, processor.lineCount);
    }
}