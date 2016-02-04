package no.horsevalley.Oblig_1.Oppgave_3;

import java.util.*;


public class ArrayIndexOutOfBoundsException {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }


        System.out.print("Enter an index between 1 and 100: ");

        try {
            int index = input.nextInt();
            System.out.println("array[" + index + "] = " + array[index]);
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Index " + ex.getLocalizedMessage() + " out of bounds");
        }

        }
    }

