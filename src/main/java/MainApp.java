
import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {

        Cat[] cat = new Cat[4];
        for (int i = 0; i < cat.length; i++) {
            cat[i] = new Cat("Кот" + (i + 1), 10 + i);
        }
        Plate plate = new Plate(30);

        for (int i = 0; i < cat.length; i++) {
            plate.info();
            cat[i].eat(plate);
        }
        plate.info();
    }

}
