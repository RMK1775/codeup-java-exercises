package InClassOOP;

public class DishTest {
    public static void main(String[] args) {
        Dish dish1 = new Dish();
        dish1.costInCents = 1279;
        dish1.nameOfDish = "Rainbow Roll";
        dish1.wouldRecommend = true;

        dish1.printSummary();
        System.out.println("******");
        DishTools.shoutDishName(dish1);
        DishTools.analyzeDishCost(dish1);
        DishTools.flipRecommendation(dish1);
    }
}
