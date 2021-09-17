public class Cat {
    private String name;
    private int appetite;
    private boolean isHungry = true;
     public Cat (String name, int appetite) {
         this.name = name;
         this.appetite = appetite;
     }
     public void eat(Plate plate){
         isHungry = plate.decreaseFood(appetite);
         System.out.println(name + " сыт: " + isHungry);
         if (!isHungry) {
             isHungry = plate.decreaseFood(appetite);
         }
     }
}
