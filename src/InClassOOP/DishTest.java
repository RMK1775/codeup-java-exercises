package InClassOOP;

import static InClassOOP.DishTools.*;

public class DishTest {
    public static void main(String[] args) {
        Dish dish1 = new Dish();
        dish1.costInCents = 1279;
        dish1.nameOfDish = "Rainbow Roll";
        dish1.wouldRecommend = true;

        dish1.printSummary();
        System.out.println("******");
        shoutDishName(dish1);
        analyzeDishCost(dish1);
        flipRecommendation(dish1);
    }
}
