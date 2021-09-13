package Animals;

public class Dog extends Animal{
    String name;
    public Dog(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    int runBarrier = 500;
    int swimBarrier = 10;

    @Override
    public void run(int distance, String name) {
        if (distance <= runBarrier) {
            System.out.println("Dog " + name + " run " + distance);
        }
        else {
            System.out.println("Distance " + distance + " is too big for " + name);
        }
    }

    @Override
    public void swim(int distance, String name) {
        if (distance <= swimBarrier) {
            System.out.println("Dog " + name + " swim " + distance);
        }
        else {
            System.out.println("Distance " + distance + " is too big for " + name);
        }

    }
}
