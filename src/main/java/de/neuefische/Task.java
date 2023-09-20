package de.neuefische;

public class Task {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        int[] numbersTwo = new int[10];
        //int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
            numbersTwo[i] = i + 11;
        }

        System.out.println("Summe des Arrays: " + sumArray(numbers));
        System.out.println("Biggest number: " + biggestNumberInArray(numbers));

        int[] sumUpArrays = sumUpTwoArrays(numbers, numbersTwo);
        for (int number : sumUpArrays) {
            System.out.println(number);
        }
    }

    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            //sum += arr[i];
        }
        return sum;
    }

    public static int biggestNumberInArray(int[] arr) {
        int biggestNumber = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > biggestNumber) {
                biggestNumber = arr[i];
            }
        }
        return biggestNumber;
    }

    public static int[] sumUpTwoArrays(int[] arrA, int[] arrB) {
        if (arrA.length == arrB.length) {
            int[] sumUpArray = new int[arrA.length];
            for (int i = 0; i < arrA.length; i++) {
                sumUpArray[i] = arrA[i] + arrB[i];
            }
            return sumUpArray;
        }
        return new int[0];
    }
}
