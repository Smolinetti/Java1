package HomeWork;

import org.w3c.dom.ls.LSOutput;

public class Lesson2 {
    public static void main(String[] args) {
        System.out.println(summ(5, 5));
        printSomeText();
        printMyText("Java");
        caser();
        doubleCycle();
        startEnd();
        oneCycle();
        arraysFour();
        breakPoint();
        easyCicle();
        counters();
        cycleStop();
        dontZero();
        cycleMod();
        crossTable();
        diagonal();
        testCanva();
        average(7, 9);
        word(7);
        plusMinus(7);
        printWords("Привет", 5);
        years(2022);


    }

    private static void easyCicle() {
        for (int i = 0, j = 15; i < j; i++, j--) {
            System.out.println("i-j: " + i + "-" + j);
        }
    }

    private static void breakPoint() {
        for (int i = 0; i < 10; i++) {
            if (i > 3) {
                break;
            }
            System.out.println("i = " + i);

        }
    }

    private static void arraysFour() {
        String[] sm = {"A", "B", "C", "D"};
        for (String o : sm) {
            System.out.print(o + " ");
        }
    }

    private static void oneCycle() {
        int x;
        for (x = 30; x >= 0; x -= 5) {
            System.out.print(x + " ");
        }
    }

    private static void startEnd() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("i= " + i);
        }
        System.out.println("End");
    }

    private static void doubleCycle() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + i + j);
            }


        }
    }

    private static void caser() {
        int a = 4;
        switch (a) {
            case 1:
                System.out.println("a = 1");
                break;
            case 2:
                System.out.println("a = 2");
                break;
            case 3:
                System.out.println("a = 3");
                break;
            default:
                System.out.println("Ни один case не сработал");

        }
    }

    private static int summ(int a, int b) {
        return a + b;
    }

    private static void printSomeText() {
        System.out.println("Hello Svetlasha !");
    }

    private static void printMyText(String txtToPrint) {
        System.out.println(txtToPrint);
    }

    private static void counters() {
        int counter = 10;
        while (counter > 0) {
            System.out.print(counter + " ");
            counter--;
        }
        System.out.println();
    }

    private static void cycleStop() {
        int list = 15;
        do {
            System.out.print(list + " ");
            list--;
        } while (list > 0);
        System.out.println();
    }

    private static void dontZero() {
        int a = 0, b = 10, c = 2;
        if (c != 0) {
            System.out.print("c не равно нулю: " + c);
            a = b / c;
            System.out.println(". Получается: b / c = " + a);
        } else {
            System.out.println("c расно нулю, делить нельзя");
        }
    }

    private static void cycleMod() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i == 0 || i == 5 || j == 0 || j == 5) {
                    System.out.print("* ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

    }

    private static void crossTable() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void diagonal() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i > j) {
                    System.out.print("* ");
                } else if (j > i) {
                    System.out.print("0 ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

    }

    private static void testCanva() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i == 0 || i == 7 || j == 0 || j == 7) {
                    System.out.print("* ");
                } else if (i == 1 && j == 1) {
                    System.out.print("* ");
                } else if (i == 2 && j == 2) {
                    System.out.print("* ");
                } else if (i == 3 && j == 3) {
                    System.out.print("* ");
                } else if (i == 4 && j == 4) {
                    System.out.print("* ");
                } else if (i == 5 && j == 5) {
                    System.out.print("* ");
                } else if (i == 6 && j == 6) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void average(int a, int b) {
        int c = a + b;
        if (c >= 10 && c <= 20) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        System.out.println();
    }

    private static void word(int i) {
        if (i >= 0) {
            System.out.println("Число: " + i + " - положительное.");
        } else {
            System.out.println("Число: " + i + " - отрицательное.");
        }
        System.out.println();
    }

    private static boolean plusMinus(int a) {
        return a > 0;
    }

    private static void printWords(String word, int i) {
        for (int j = 0; j < i; j++) {
            System.out.println(word);
        }
    }

    private static void years(int year) {
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println(year + " год является високостным.");
        } else {
            System.out.println(year + " год не является високостным.");
        }
        System.out.println();
    }


}
