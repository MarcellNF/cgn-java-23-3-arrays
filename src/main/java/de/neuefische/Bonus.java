package de.neuefische;

import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bitte gib einen Text ein: ");
        String inputText = sc.nextLine();
        sc.close();

        for(char c : inputText.toCharArray()){
            System.out.println(c);
        }
    }
}
