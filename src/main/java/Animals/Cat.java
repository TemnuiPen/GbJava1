package Animals;

public class Cat extends Animal{
    int runBarrier = 200;
    @Override
    public void run(int distance, String name) {
        if (distance <= runBarrier) {
            System.out.println("Cat " + name + " run " + distance);
        }
        else {
            System.out.println("Distance " + distance + " is too big for  " + name);
        }
    }

    @Override
    public void swim(int distance, String name) {
        System.out.println("Cat cannot swim!!");
    }
}
