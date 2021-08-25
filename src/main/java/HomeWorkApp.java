public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    private static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    private static void checkSumSign() {
        int a = -34;
        int b = 3;
        int sum  = a + b;
        if(sum >= 0 ) {
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Сумма отрицательная");
        }
    }
    private static void printColor() {
        int color = -10;
        if (color < 0) {
            System.out.println("Красный");
        }
        else if (color < 101 && color > 0) {
            System.out.println("Жёлтый");
        }
        else if (color > 100) {
            System.out.println("Зелёный");
        }
    }
    private static void compareNumbers() {
        int a = 5;
        int b = 3;
        if (a >= b) {
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }
    }
}
