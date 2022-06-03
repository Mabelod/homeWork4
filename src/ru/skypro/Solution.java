package ru.skypro;

import java.util.Arrays;

public class Solution {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        task2();
        task6();
    }

    static void lecture() {
        int[] weights = {90, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};
        int[] weightsCopy = {902, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};
        int januaryWeight = weights[0];
        System.out.println(januaryWeight);
        System.out.println(weights[0]);
        System.out.println(weights[4]);
        int january = 0;
        System.out.println(weights[january]);
        for (int i = 0; i < weights.length; i++) {
            System.out.println(weights[i]);
        }
        boolean arrayAreEqual = true;
        arrayAreEqual = weights.length == weightsCopy.length;
        if (arrayAreEqual) {
            for (int i = 0; i < weights.length; i++) {
                if (weights[i] != weightsCopy[i]) {
                    arrayAreEqual = false;
                }
            }
        }
        if (arrayAreEqual) {
            System.out.println("Массивы одинаковые");
        } else {
            System.out.println("Массивы разные");
        }
        int maxWeight = -1;
        for (final int current : weights) {
            if (current > maxWeight) {
                maxWeight = current;
            }
        }
        System.out.println(maxWeight);
        for (int i = 0; i < weights.length - 1 && weights[i + 1] != 0; i++) {
            System.out.println(weights[i + 1] - weights[i]);
        }
    }

    static void task1() {
        int[] payments = generateRandomArray();
        int sum = 0;
        for (int cell : payments) {
            sum += cell;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");
    }

    static void task2() {
        int[] payments = generateRandomArray();
        int min = payments[0]; // приравнял к первому элементу массива
        int max = payments[0];
        for (int cell : payments) {
            if (cell < min) {
                min = cell;
            } else if (cell > max) {
                max = cell;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей");
    }

    static void task3() {
        int[] payments = generateRandomArray();
        int sum = 0;
        double mean;
        for (int cell : payments) {
            sum += cell;
        }
        mean = (double) sum / payments.length;
        double i = mean * 10;

        if (i % 10 == 0) // это для того чтобы проверить остаток от деления числа, если число целое вивести значение int, если нет вывести double
            System.out.println("Средняя сумма трат за месяц составила " + (int) mean + " рублей");
        else
            System.out.println("Средняя сумма трат за месяц составила " + mean + " рублей");
    }

    static void task4() {
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }

    static void task5() { // сделал для любой длинны массива
        int[][] matrix = new int[6][6];
        int number = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j) {
                    matrix[i][j] = number;
                    System.out.print(matrix[i][j]);
                } else {
                    System.out.print(matrix[i][j]);
                }
            }
            System.out.println();
        }
    }


    static void task6() {
        int[] number = {5, 4, 3, 2, 1};
        int[] number2 = new int[number.length]; // приравнял к длинне массива
        int j = 0;
        System.out.println(Arrays.toString(number));
        for (int i = number.length - 1; i >= 0; i--) {
            number2[j] = number[i];
            j++;
        }
        System.out.println(Arrays.toString(number2));
    }

    static void task7() {
        int[] number = {5, 8, 3, 2, 9};
        int j = number.length - 1;
        System.out.println(Arrays.toString(number));
        for (int i = 0; i < 2; i++) {
            int a = number[i];
            int b = number[j];
            number[i] = b;
            number[j] = a;
            j--;
        }
        System.out.println(Arrays.toString(number));
        }
        static void task8(){
        int[] number = {-6, 2, 5, -8, 8, 10, 4, -7, 12,1};
        int a = 0;
        int b = 0;
            for (int i = 0; i < number.length; i++) {
                for (int j = i + 1; j < number.length; j++) {
                    if(number[i] + number[j] == -2){
                        a = number[i];
                        b = number[j];
                    }
                }
                if (a + b == -2) {
                    System.out.println(a + " + " + b + " = -2");
                    break;
                }
            }
        }

        static void task9(){
            int[] number = {-6, 2, 5, -8, 8, 10, 4, -7, 12,1};
            for (int i = 0; i < number.length; i++) {
                for (int j = i + 1; j < number.length; j++) {
                    if(number[i] + number[j] == -2){
                        System.out.println(number[i] + " + " + number[j] + " = -2");
                    }
                }
            }
        }
    }