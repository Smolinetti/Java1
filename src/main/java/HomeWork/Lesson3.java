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
        System.out.println("?????????? ??????????????: " + arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + i + "-" + arr[i] + "; \n");
        }
        System.out.println();
    }

    private static void scanerExample() {
        Scanner sc = new Scanner(System.in);
        System.out.println("?????????????? ??????????:");
        int a = sc.nextInt();
        int b = a * a;
        System.out.printf("?????????????????? ?????????? %s ???? 2???? ?????????????? ??????????: %s", a, b);
        sc.close();
    }

    private static void getScaner() {
        int d = getNumberFromScanner("?????????????? ?????????? ?? ???????????????? ???? 5 ???? 10", 5, 10);
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
        System.out.print("?????????????? ?????????? ??????????????: ");
        int arrLength = sc.nextInt();
        System.out.print("?????????????? ???????????????? ?????? ???????? ??????????: ");
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
        System.out.println("???????????? ?????????????? ???? " + FIX_LEGTH + " ??????????.");
        int min = arr[0];
        for (int i = 0; i < FIX_LEGTH; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("?????????????????????? ?????????? ???? ?????????????? ??????????: " + min);

        int max = arr[0];
        for (int i = 0; i < FIX_LEGTH; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("???????????????????????? ?????????? ???? ?????????????? ??????????: " + max);
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
                System.out.println("?????? - ???????? ?????????????????????? ?????????? ?????????? ?????????????? !");
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
                System.out.println("?????????? ??????????????: " + rightSumEnd);
                System.out.println("??????, ???????? ???????????? ?? ???????????? ??????????: " + leftsum + " ?? " + rightsum);
                System.out.println();
                return true;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("?????????? ??????????????: " + rightSumEnd);
        System.out.println("?????? ?????????????? ?????????? !");
        System.out.println();
        return false;

    }


}