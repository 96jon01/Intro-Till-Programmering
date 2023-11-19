import java.util.Scanner;

public class readWrite {

    public static void main(String[] args) {
        //Skapa ett objekt av typen TextProcessor
        textProcessor processor = new textProcessor();
        processInput(processor);
    }

    // Metod för att behandla inmatning med en while-loop
    public static void processInput(textProcessor processor) {
        Scanner scanner = new Scanner(System.in);

        // Användaren ombeds att skriva in en rad och det inmatade värdet tilldelas variabeln "line".
        while (true) {
            System.out.print("Skriv en rad: ");
            String line = scanner.nextLine();

                // Jämför line mot stop.
                if (line.equalsIgnoreCase("stop")) {
                    break;
                }
                // Inmatade raden behandlas av TextProcessor objektet
                processor.processLine(line);
            }
            // Stäng Scanner
            scanner.close();

            // Skriv ut resultatet
            System.out.println("Antal tecken: " + processor.totalCharacters);
            System.out.println("Antal rader (exklusive raden med 'stop'): " + processor.lineCount);
        }
    }
