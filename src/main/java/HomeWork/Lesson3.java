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
        sumBoolean();
        checkBalanceTrue(new int[] {1, 2, 3, 5, 1});
        checkBalanceTrue(new int[] {6, 5, 4, 6, 10});
        shiftArray(new int[]{1, 2, 3, 4, 5}, 1);
        shiftArray(new int[]{1, 2, 3, 4, 5}, -1);
        shiftArray(new int[]{1, 2, 3, 4, 5}, 3);




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
        int d = getNumberFromScanner("Введите число в пределах от 5 до 10", 5, 10);
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
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
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
        int[] arr = new int[100];
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
        int arr[][] = new int[7][7];
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

        int[] arr = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            arr[i] = arrWord;
        }
        System.out.println(Arrays.toString(arr));
        sc.close();
    }

    private static void arraysRandom() {
        Random random = new Random();
        final int FIX_LEGTH = random.nextInt(10, 26);


        int[] arr = new int[FIX_LEGTH];
        for (int i = 0; i < FIX_LEGTH; i++) {
            arr[i] = random.nextInt(-100, 101);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Массив состоит из " + FIX_LEGTH + " ячеек.");
        int min = arr[0];
        for (int i = 0; i < FIX_LEGTH; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Минимальное число из массива равно: " + min);

        int max = arr[0];
        for (int i = 0; i < FIX_LEGTH; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Максимальное число из массива равно: " + max);
        System.out.println();
    }

    private static void sumBoolean() {
        Random random = new Random();
        final int FIX_LEGTH = random.nextInt(6, 8);
        int[] arr = new int[FIX_LEGTH];
        for (int i = 0; i < FIX_LEGTH; i++) {
            arr[i] = random.nextInt(1, 3);
        }
        System.out.println(Arrays.toString(arr));

        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < arr.length; i++) {
            rightSum = rightSum + arr[i];
        }
        System.out.println(rightSum);

        for (int i = 0; i < arr.length; i++) {
            leftSum = leftSum + arr[i];
            rightSum = rightSum - arr[i];

            if (leftSum == rightSum) {
                System.out.println("Ура - есть симетричные суммы ячеек массива !");
                break;
            }
        }
        System.out.println(leftSum + " -- " + rightSum);
        System.out.println();
    }

    private static boolean checkBalanceTrue(int[] arr) {
        int leftsum = 0;
        int rightsum = 0;

        for (int i = 0; i < arr.length; i++) {
            rightsum = rightsum + arr[i];
        }
        int rightSumEnd = rightsum;

        for (int i = 0; i < arr.length; i++) {
            leftsum = leftsum + arr[i];
            rightsum = rightsum - arr[i];

            if (leftsum == rightsum) {
                System.out.println(Arrays.toString(arr));
                System.out.println("Сумма массива: " + rightSumEnd);
                System.out.println("Ура, есть баланс в суммах ячеек: " + leftsum + " и " + rightsum);
                System.out.println();
                return true;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Сумма массива: " + rightSumEnd);
        System.out.println("Нет баланса ячеек !");
        System.out.println();
        return false;

    }

    private static void shiftArray(int[] array, int n) {
        int shiftNumber = n % array.length;
        if (shiftNumber < 0) {
            shiftLeft(array, shiftNumber);
        } else {
            shiftRight(array, shiftNumber);
        }
        System.out.println(Arrays.toString(array) + "; shiftNumber = " + n);
    }

    private static void shiftRight(int [] array, int n) {
        for (int i = 0; i < n; i++) {
            int lastValue = array[array.length - 1];
            for (int j = array.length - 1; j > 0; j--) {
                array[j] = array[j - 1];
            }
            array[0] = lastValue;
        }
    }

    private static void shiftLeft(int [] array, int n) {
        for (int i = 0; i < Math.abs(n); i++) {
            int firstValue = array[0];
            for (int j = 0; j < array.length - 1; j++) {
                array[j] = array[j + 1];
            }
            array[array.length - 1] = firstValue;
        }
    }


}