import java.util.Scanner;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int n) {
        if (food < n) {
            System.out.println("В тарелке мало еды! Неси ещё!!");
            setFood();
            return false;
        }
        else {
            food = food - n;
            return true;
        }
    }

    public void info() {
        System.out.println("plate: " + food);
    }

    private void setFood() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите, пожалуйста, количество еды, которое вы хотите положить в тарелку коту:");
        food = sc.nextInt();
    }
}
