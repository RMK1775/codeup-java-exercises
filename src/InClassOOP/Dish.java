package InClassOOP;

public class Dish {
    public double costInCents = 0.00;
    public String nameOfDish;
    public Boolean wouldRecommend;

    public void printSummary(){
        System.out.printf("Cost:$ %s\nName: %s\nRecommended: %s\n", this.costInCents, this.nameOfDish, this.wouldRecommend );
    }
}
