import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWorkApp {
    private static char[][] map;
    private static final int DOTS_TO_WIN = 3;
    private static final int SIZE = 3;

    private static final char DOT_EMPTY = '•';
    private static final char DOT_X = 'X';
    private static final char DOT_O = 'O';

    private static boolean winStatus = false;

    public static void main(String[] args) {
        initMap();
        printMap();
        while(!winStatus) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Удивительно, но вы победили!" );
                break;

            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Победа, победа вместо обеда! Поздравляем вас, вы успешно проиграли!" );
                break;
            }
        }
    }

    private static boolean checkForNextGame() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Если вы хотите продолжить игру, введите 0, если хотите выйти - любое другое число");
        int number = sc.nextInt();
        if (number == 0) {
            return true;
        }
        else  {
            return false;
        }

    }

    private static boolean checkWin(char symb) {
        if(map[0][0] == symb && map[0][1] == symb && map[0][2] == symb) return true;
        if(map[1][0] == symb && map[1][1] == symb && map[1][2] == symb) return true;
        if(map[2][0] == symb && map[2][1] == symb && map[2][2] == symb) return true;
        if(map[0][0] == symb && map[1][0] == symb && map[2][0] == symb) return true;
        if(map[0][1] == symb && map[1][1] == symb && map[2][1] == symb) return true;
        if(map[0][2] == symb && map[1][2] == symb && map[2][2] == symb) return true;
        if(map[0][0] == symb && map[1][1] == symb && map[2][2] == symb) return true;
        if(map[2][0] == symb && map[1][1] == symb && map[0][2] == symb) return true;
        return false;

    }

    private static void aiTurn() {
        boolean status = false;
        int x = 0;
        int y = 0;
        x = generateNumber(x);
        y = generateNumber(y);
        while (!status) {
            if(map[y][x] == '•') {
                map[y][x] = DOT_O;
                status = true;
            }
            else {
                x = generateNumber(x);
                y = generateNumber(y);
            }
        }
    }

    private static int generateNumber(int a) {
        Random random = new Random();
        a = random.nextInt(SIZE);
        return a;
    }

    private static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    private static void humanTurn() {
        int x;
        int y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Сейчас ваш ход. Введите последовательно координаты точки, которую вы хотите занять.");
        System.out.println("Введите номер строки, от 1 до 3:");
        x = sc.nextInt();
        System.out.println("Введите номер столбца, от 1 до 3:");
        y = sc.nextInt();
        map[y - 1][x - 1] = DOT_X;
    }

    private static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");

        for (int i = 0; i < SIZE; i++) {
                System.out.print((i + 1) + " ");
                for (int j = 0; j < SIZE; j++) {
                    System.out.print(map[i][j] + " ");
                }
                System.out.println("");
        }
    }
}
