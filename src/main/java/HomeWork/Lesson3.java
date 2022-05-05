package HomeWork;

import java.util.Arrays;

public class Lesson3 {
    public static void main(String[] args) {
        final int SEASON_NUMBER = 3;

        seasons(SEASON_NUMBER);
        arraysPrint();
        arraysFor();
        doubleArrays();
        arraysPrintDouble();


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

}
