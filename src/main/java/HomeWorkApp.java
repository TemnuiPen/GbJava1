public class HomeWorkApp {
    public static void main(String[] args) {
        firstTask(2,45);
        secondTask(-12);
        thirdTask(10);
        fourthTask("Hello mazafaka", 8);
        fifthTask(2000);
    }

    private static boolean fifthTask(int year) {
        if(year % 4 == 0 && year % 100 != 0) {
            System.out.println("Год високосный");
            return true;
        }
        else if (year % 400 == 0) {
            System.out.println("Год високосный");
            return true;
        }
        else {
            System.out.println("Год не високосный");
            return false;
        }
    }

    private static void fourthTask(String str, int number) {
        int i = 0;
        while (i < number) {
            System.out.println(str);
            i++;
        }
    }

    private static boolean thirdTask(int a) {
        if (a >= 0) {
            return false;
        }
        else return true;
    }

    private static void secondTask(int a) {
        if (a >= 0) {
            System.out.println("Положительное число");
        }
        else System.out.println("Отрицательное число");
    }

    private static boolean firstTask(int a, int b) {
        if (a + b > 10 && a + b < 20) {
            return true;
        }
        else return false;
    }
}
