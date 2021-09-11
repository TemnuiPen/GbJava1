package Animals;

public class Cat extends Animal{
    @Override
    public void run(int distance, String name) {
        System.out.println("Cat " + name + " run " + distance);
    }

    @Override
    public void swim(int distance, String name) {
        System.out.println("Cat cannot swim!!");
    }
}
