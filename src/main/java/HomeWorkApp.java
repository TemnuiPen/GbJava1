import java.util.Arrays;

public class HomeWorkApp {
    public static void main(String[] args) {
        firstTask();
        secondTask();
        thirdTask();
        fourthTask();
    }

    private static void fifthTask() {

    }

    private static void fourthTask() {
        int [][] arr = new int [4][4];
        int arrLength = arr.length;
        int counter = arrLength - 1;
        for (int i = 0; i < arrLength; i++) {
            for (int j = 0; j < arrLength; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
                if(counter == j) {
                    arr[i][j] = 1;
                    counter--;
                }
            }
        }

        System.out.println("");
        System.out.println("Here fourth task begins");
        for (int i = 0; i < arrLength; i++) {
            for (int j = 0; j < arrLength; j++) {
                System.out.print(" " + arr[i][j] + " ");
            }
            System.out.println("");
        }
    }

    private static void thirdTask() {
        int [] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int arrLength = arr.length;
        for (int i = 0; i < arrLength; i++) {
            if(arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println("");
        System.out.println("Here third task begins");
        System.out.println(Arrays.toString(arr));
    }

    private static void secondTask() {
        int arrLength = 100;
        int [] arr = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            arr[i] = i + 1;
        }
        System.out.println("");
        System.out.println("Here second task begins");
        System.out.println(Arrays.toString(arr));
    }

    private static void firstTask() {
        int [] a = {1, 0, 0, 1, 0, 1, 0, 1};
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                a[i] = 1;
            }
            else a[i] = 0;
        }
        System.out.println("Here first task begins");
        System.out.println(Arrays.toString(a));
    }
}
