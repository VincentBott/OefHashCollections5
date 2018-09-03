package com.company;

import java.util.HashMap;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        HashMap<String, Integer> woorden = new HashMap<>();

        Scanner scanner = new Scanner(System.in);


        System.out.print("Geef een tekst: ");

        String invoer[] = scanner.nextLine().split(" ");


        int count = 0;

        for (int i = 0; i < invoer.length; i++)
        {

            if (invoer[i].equals())
                count++;
        }

        for (int i = 0; i < woorden.size() ; i++) {

            System.out.printf("Het woord \"%s\" komt %d voor", woorden.keySet() , woorden.get(i));
        }

    }

}


/*
Geef een tekst: de tekst die de tekst bevat bevat de tekst
het woord "de" komt 3 keer voor
het woord "die" komt 1 keer voor
het woord "bevat" komt 2 keer voor
het woord "tekst" komt 3 keer voor
 */
