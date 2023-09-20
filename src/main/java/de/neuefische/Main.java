package de.neuefische;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        /*numbers[0] = 21;
        numbers[1] = 22;
        numbers[2] = 23;
        numbers[3] = 24;
        numbers[4] = 25;
        numbers[5] = 26;
        numbers[6] = 27;
        numbers[7] = 28;
        numbers[8] = 29;
        numbers[9] = 30;*/

        /*System.out.println(Arrays.toString(numbers));

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);
        System.out.println(numbers[5]);
        System.out.println(numbers[6]);
        System.out.println(numbers[7]);
        System.out.println(numbers[8]);
        System.out.println(numbers[9]);*/

        System.out.println(numbers.length);

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = i * 2;
        }

        /*for(int i = 0; i < numbers.length; i = i + 1){
            System.out.println(numbers[i]);
        }*/

        // Für jede number in meinem numbers-array, führe den nachfolgenden code aus
        for(int number : numbers){
            System.out.println(number);
        }

    }
}