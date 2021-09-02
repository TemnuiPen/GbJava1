import java.util.Arrays;

public class HomeWorkApp {
    public static void main(String[] args) {
        firstTask();
        secondTask();
    }

    private static void fifthTask() {

    }

    private static void fourthTask() {

    }

    private static void thirdTask() {
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
        int [] a = {1,0,0,1,0,1,0,1};
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
