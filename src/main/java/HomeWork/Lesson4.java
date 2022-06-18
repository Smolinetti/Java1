package HomeWork;

import java.util.Random;
import java.util.Scanner;

public class Lesson4 {
    private static final int SIZE = 3;

    private static final char DOT_EMPTY = '•';
    private static final char DOT_HUMAN = 'X';
    private static final char DOT_AI = '0';

    private static final char[][] MAP = new char[SIZE][SIZE];
    private transient final Scanner in = new Scanner(System.in);
    private transient final Random random = new Random();

    private static final String HEADER_FIRST_SYMBOL = "♥";
    private static final String SPACE_MAP = " ";

    public static void turnGame() {
        initMap();
        printMap();
        playGame();
    }

    private static void initMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                MAP[i][j] = DOT_EMPTY;
            }
        }
    }

    private static void printMap() {
        printHeaderMap();
        prinBodyMap();
    }

    private static void printHeaderMap() {
        System.out.print(HEADER_FIRST_SYMBOL + SPACE_MAP);
        for (int i = 0; i < SIZE; i++) {
            printMapNumber(i);
        }
        System.out.println();
    }

    private static void printMapNumber(int i) {
        System.out.print(i + 1 + SPACE_MAP);
    }

    private static void prinBodyMap() {
        for (int i = 0; i < SIZE; i++) {
            printMapNumber(i);

            for (int j = 0; j < SIZE; j++) {
                System.out.print(MAP[i][j] + SPACE_MAP);
            }

            System.out.println();

        }
    }

    private static void playGame() {
        while (true) {
            //Ход человека
            printMap();
            if (false) {
                break;
            }

            //Ход компьютера
            printMap();
            if (false) {
                break;
            }
        }

        //Перейти к следующему ходу
    }


}
