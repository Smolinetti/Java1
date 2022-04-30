package HomeWork;

public class Lesson2 {
    public static void main(String[] args) {
        System.out.println(summ(5, 5));
        printSomeText();
        printMyText("Java");

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

        for (int i = 0; i <= 5; i++) {
            System.out.println("i= " + i);
        }
        System.out.println("End");

        int x;
        for (x = 30; x >= 0 ; x-=5) {
            System.out.print(x + " ");
        }

        for (int i = 0, j = 15; i < j ; i++, j--) {
            System.out.println("i-j: " + i + "-" + j);
        }

        for (int i = 0; i < 10; i++) {
            if (i > 3) {
                break;
            }
            System.out.println("i = " + i);

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

}
