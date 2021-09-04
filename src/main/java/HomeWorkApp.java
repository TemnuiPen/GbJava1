import java.util.Arrays;

public class HomeWorkApp {
    public static void main(String[] args) {
        firstTask();
        secondTask();
        thirdTask();
        fourthTask();
        fifthTask(9, 3);
        sixthTask();
        seventhTask();
        eighthTask();
    }
    private static void eighthTask() {
        int [] array = {2, 2, 2, 1, 2, 2, 10, 1};
        int arrayLength = array.length;
        int number = 5;
        array = moveArrayElementsForward(array, number);
        System.out.println("");
        System.out.println("Here eighth task begins");
        System.out.println(Arrays.toString(array));
    }

    private static int[] moveArrayElementsForward(int[] array, int number) {
        int arrayLength = array.length;
        int a = 0;
        int b = 0;
        int counter = 0;
        while (counter < number) {
            for (int i = 0; i < arrayLength; i++) {
                if (i == 0) {
                    b = array[i];
                    array[i] = array[arrayLength - 1];
                    a = b;
                }
                else {
                    b = array[i];
                    array[i] = a;
                    a = b;
                }
            }
            counter++;
        }
        return array;
    }

    private static void seventhTask() {
        int [] array = {2, 2, 2, 1, 2, 2, 10, 1};
        boolean result = checkArraysAmount(array);
        System.out.println("");
        System.out.println("Here seventh task begins");
        System.out.println(result);
    }

    private static boolean checkArraysAmount(int[] array) {
        int leftAmount = 0;
        int rightAmount = 0;
        int arrayLength = array.length;
        for (int i = 0; i < arrayLength; i++) {
            if (i < arrayLength - 2) {
                leftAmount = leftAmount+ array[i];
            }
        }
        rightAmount = rightAmount + array[arrayLength - 2] + array[arrayLength - 1];
        if (rightAmount == leftAmount) {
            return true;
        }
        else return false;
    }

    private static void sixthTask() {
        int [] arr = {0, 2, 3, 10, 11, 12};
        int arrLength = arr.length;
        int max = 0;
        int min = 10000;
        for (int i = 0; i < arrLength; i++){
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("");
        System.out.println("Here sixth task begins");
        System.out.println("Максимальный элемент массива, - " +  max);
        System.out.println("Минимальный элемент массива, - " +  min);
    }

    private static void fifthTask(int len, int initialValue) {
        int [] arr = new int[len];
        System.out.println("");
        System.out.println("Here fifth task begins");
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print(arr[i]);
        }
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
