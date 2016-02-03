package no.horsevalley;

import java.util.*;

/*  12.13 (Count characters, words, and lines in a file)
    Write a program that will count the number of characters,
    words, and lines in a file. Words are separated by whitespace characters.
    The file name should be passed as a command-line argument, as shown in Figure 12.13.
*/

public class CountCharactersWordsAndLinesInAFile {

    public static void main(String[] args) throws Exception{

        java.io.File file = new java.io.File("count.txt");
        if (file.exists()){
            System.out.println("File already exists");
            System.exit(0);
        }

        java.io.PrintWriter output = new java.io.PrintWriter(file);

        output.print("John T Smith ");
        output.println(90);
        output.print("Eric K Jones ");
        output.println(85);

        output.close();


    }
}
