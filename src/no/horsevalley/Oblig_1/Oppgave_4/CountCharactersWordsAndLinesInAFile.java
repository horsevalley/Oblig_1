package no.horsevalley.Oblig_1.Oppgave_4;

import java.nio.file.Paths;
import java.util.*;

/*  12.13 (Count characters, words, and lines in a file)
    Write a program that will count the number of characters,
    words, and lines in a file. Words are separated by whitespace characters.
    The file name should be passed as a command-line argument, as shown in Figure 12.13.
*/

public class CountCharactersWordsAndLinesInAFile {

    public static void main(String[] args) throws Exception {
        System.out.println(Paths.get(".").toAbsolutePath().normalize().toString());

        java.io.File file = new java.io.File("/Users/jonashestdahl/Dropbox/Develop/Oblig_1/count.txt");
        Scanner sc = new Scanner(file);

        int characterCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        while (sc.hasNextLine()) {
            lineCount++;
            String line = sc.nextLine();
            characterCount += line.length();
            wordCount += new StringTokenizer(line, " ").countTokens();
        }
        System.out.println("The file (" + file + ") has: ");
        System.out.println(+characterCount + " characters");
        System.out.println(+wordCount + " words");
        System.out.println(+lineCount + " lines");
    }
}