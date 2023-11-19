public class textProcessor {


    // Deklarera 2 publica variabler
    public int lineCount = 0, totalCharacters = 0;


    // Metod för att behandla en inmatad rad i TextProcessor objektet
    public void processLine(String line) {

         // Räkna tecken och/utan mellanslag
        int lineLength = line.length();
        //int lineLength = line.replaceAll("\\s", "").length();
        totalCharacters += lineLength;

        // Räknar rader  (kan räkna tomma rader)
        //if (!line.trim().isEmpty())
        {
            lineCount++;
        }
    }

}

