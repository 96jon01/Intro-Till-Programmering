import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class excludeStopTest {

    @Test
    public void testExcludeStopWord() {
        // Skapa ett objekt av typen TextProcessor
        textProcessor processor = new textProcessor();

        // Simulerar input med några rader, inklusive ordet "stop"
        processInput(processor, "Hello");
        processInput(processor, "123456");
        processInput(processor, "gggg ff");
        processInput(processor, "stop");

        // Kontrollera antalet rader som förväntas.
        assertEquals(3, processor.lineCount);
    }

    private void processInput(textProcessor processor, String input) {
        // Användaren ombeds att skriva in en rad och det inmatade värdet tilldelas variabeln "line".
        String[] lines = input.split("\n");
        for (String line : lines) {
            if (line.equalsIgnoreCase("stop")) {
                break;
            }
            // Inmatade raden behandlas av TextProcessor objektet
            processor.processLine(line);
        }
    }
}
