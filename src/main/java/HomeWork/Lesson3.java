package HomeWork;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lesson3 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        final int SEASON_NUMBER = 3;

        /*seasons(SEASON_NUMBER);
        arraysPrint();
        arraysFor();
        doubleArrays();
        arraysPrintDouble();
        arrLenght();
        scanerExample();
        getScaner();*/

        arrChange();
        arraysFill();
        arraysUp();
        arraysDoubleDiagonal();
//        inputArray();
        arraysRandom();


    }

    private static void seasons(int seasonNumber) {
        String season = switch (seasonNumber) {
            case 1 -> "Winter";
            case 2 -> "Spring";
            case 3 -> "Summer";
            case 4 -> "Fall";
            default -> "UnKnow season";
        };

        System.out.println(season);

    }

    private static void arraysPrint() {
        String arr[] = {"A", "B", "C", "D", "E"};
        System.out.println(Arrays.toString(arr));
    }

    private static void arraysFor() {
        int arr[] = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println();
    }

    private static void doubleArrays() {
        int count = 1;
        int table[][] = new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                table[i][j] = count;
                System.out.print(table[i][j] + " ");
                count++;
            }
            System.out.println();
        }
        System.out.println();

    }

    public static void arraysPrintDouble() {
        int count = 10;
        int[][] arr = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = count;
                count = count + 10;
            }
        }
        System.out.println(Arrays.deepToString(arr));
        System.out.println();
    }

    private static void arrLenght() {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Длина массива: " + arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + i + "-" + arr[i] + "; \n");
        }
        System.out.println();
    }

    private static void scanerExample() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int a = sc.nextInt();
        int b = a * a;
        System.out.printf("Введенное число %s во 2ой степени равно: %s", a, b);
        sc.close();
    }

    private static void getScaner() {
        int d = getNumberFromScanner("Введите число в пределах от 5 до 10", 5 , 10);
        System.out.println("d = " + d);

    }

    public static int getNumberFromScanner(String message, int min, int max) {
        int x;
        do {
            System.out.println(message);
            x = sc.nextInt();
        } while (x < min || x > max);
        return x;
    }

    private static void arrChange() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }


    private static void arraysFill() {
        int [] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void arraysUp() {
        int arr[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void arraysDoubleDiagonal() {
        int arr [][] = new int[7][7];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j || (i + j == arr.length - 1)) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    }

    private static void inputArray() {
        System.out.print("Введите длину массива: ");
        int arrLength = sc.nextInt();
        System.out.print("Введите значение для всех ячеек: ");
        int arrWord = sc.nextInt();

        int[] arr = new int [arrLength];
        for (int i = 0; i < arrLength; i++) {
            arr[i] = arrWord;
        }
        System.out.println(Arrays.toString(arr));
        sc.close();
    }

    private static void arraysRandom() {
        final int FIX_LEGTH = 15;
        Random random = new Random();

        int[] arr = new int [FIX_LEGTH];
        for (int i = 0; i < FIX_LEGTH; i++) {
            arr[i] = random.nextInt(0, 16);
        }
        System.out.println(Arrays.toString(arr));

        for (int num : arr) {
            if (num < Math.max(num, num)) {
                System.out.println(num);


            }
        }
    }






}
