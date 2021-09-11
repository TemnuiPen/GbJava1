import Animals.Cat;
import Animals.Dog;

public class MainApp {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.swim(120, "Barsik");
        cat.run(200, "Barsik");
        Dog dog = new Dog();
        dog.swim(120,"Bobik");
        dog.run(220, "Bobik");
    }

}
