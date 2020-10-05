package InClassOOP;

public class DishTest {
    public static void main(String[] args) {
        Dish dish1 = new Dish();
        dish1.costInCents = 12.79;
        dish1.nameOfDish = "RainbowRoll";
        dish1.wouldRecommend = true;
        
        dish1.printSummary();
    }
}
