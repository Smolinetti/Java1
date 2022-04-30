package HomeWork;

public class Lesson1 {
    public static void main(String[] args) {
        printTreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        drawSquare();


    }

    public static void printTreeWords() {
        System.out.println("Orange\nBanana\nApple");

    }

    public static void checkSumSign() {
        int a = 2019, b = -2018, c = a + b;
        if (c >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }

    private static void printColor() {
        int value = 1;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value < 100 && value >= 1) {
            System.out.println("Желтый");
        }
        if (value >= 100) {
            System.out.println("Зелёный");
        }
    }

    private static void compareNumbers() {
        int a = 25, b = 45;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    private static void drawSquare() {
        System.out.println(" -----");
        System.out.println("|     |");
        System.out.println("|     |");
        System.out.println(" -----");

    }


}
