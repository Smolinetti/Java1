package HomeWork;

import java.util.Random;
import java.util.Scanner;

public class Lesson4 {
    private static final int SIZE = 3;

    private static final char DOT_EMPTY = '•';
    private static final char DOT_HUMAN = 'X';
    private static final char DOT_AI = '0';

    private static final char[][] MAP = new char[SIZE][SIZE];
    private static transient final Scanner in = new Scanner(System.in);
    private static transient final Random random = new Random();

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
            turnHuman();
            printMap();
            if (checkEnd(DOT_HUMAN)) {
                break;
            }

            turnAI();
            printMap();
            if (checkEnd(DOT_AI)) {
                break;
            }
        }

    }

    private static void turnHuman() {
        System.out.println("ХОД ЧЕЛОВЕКА");
        int rowNumber, columnNumber;

        while (true) {
            rowNumber = in.nextInt() - 1;
            columnNumber = in.nextInt() - 1;
            if (isCellFree(rowNumber, columnNumber)) {
                break;
            }
            System.out.println("\nВы выбрали занятую ячейку !");
        }

        MAP[rowNumber][columnNumber] = DOT_HUMAN;


    }

    private static void turnAI() {
        System.out.println("ХОД КОМПЬЮТЕРА");
        int rowNumber, columnNumber;

        do {
            rowNumber = random.nextInt(SIZE);
            columnNumber = random.nextInt(SIZE);

        } while (!isCellFree(rowNumber, columnNumber));

        MAP[rowNumber][columnNumber] = DOT_AI;


    }

    private static boolean checkEnd(char symbol) {
        if (checkWin(symbol)) {
            if (symbol == DOT_HUMAN) {
                System.out.println("\nУрааааа, ты победил !");
            } else {
                System.out.println("\nМашина победила :(");
            }
            return true;
        }

        if (checkDraw()) {
            System.out.println("\nНичья !");
            return true;
        }

        return false;
    }

    private static boolean checkDraw() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (MAP[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean checkWin(char symbol) {
        if (MAP[0][0] == symbol && MAP[0][1] == symbol && MAP[0][2] == symbol) {
            return true;
        }
        if (MAP[1][0] == symbol && MAP[1][1] == symbol && MAP[1][2] == symbol) {
            return true;
        }
        if (MAP[2][0] == symbol && MAP[2][1] == symbol && MAP[2][2] == symbol) {
            return true;
        }
        if (MAP[0][0] == symbol && MAP[1][0] == symbol && MAP[2][0] == symbol) {
            return true;
        }
        if (MAP[0][1] == symbol && MAP[1][1] == symbol && MAP[2][1] == symbol) {
            return true;
        }
        if (MAP[0][2] == symbol && MAP[1][2] == symbol && MAP[2][2] == symbol) {
            return true;
        }
        if (MAP[0][0] == symbol && MAP[1][1] == symbol && MAP[2][2] == symbol) {
            return true;
        }
        if (MAP[0][2] == symbol && MAP[1][1] == symbol && MAP[2][0] == symbol) {
            return true;
        }

        return false;
    }

    private static boolean isCellFree(int rowNumber, int columnNumber) {
        return MAP[rowNumber][columnNumber] == DOT_EMPTY;
    }


}
