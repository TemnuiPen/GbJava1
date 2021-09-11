package Animals;

public class Dog extends Animal{
    @Override
    public void run(int distance, String name) {
        System.out.println("Dog " + name + " run " + distance);
    }

    @Override
    public void swim(int distance, String name) {
        System.out.println("Dog " + name + " swim " + distance);
    }
}
