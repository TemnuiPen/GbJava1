import Animals.Cat;
import Animals.Dog;

import java.util.Arrays;

public class MainApp {
    private static int counter = 0;
    private static String[] animalNames = new String[5];

    public static void main(String[] args) {
        Cat cat = new Cat("Barsik");
        cat.swim(120, cat.getName());
        cat.run(200, cat.getName());
        animalNames[0] = cat.getName();
        Dog dog = new Dog("Bobik");
        dog.swim(120, dog.getName());
        dog.run(220, dog.getName());
        animalNames[1] = dog.getName();
        for (int i = 0; i < animalNames.length; i++) {
            if(animalNames[i] != null) {
                counter++;
            }
        }
        System.out.println("Общее количество животных  - " + counter);


    }

}
