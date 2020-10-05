package InClassOOP;

public class Dish {

    public int costInCents = 0;
    public String nameOfDish;
    public Boolean wouldRecommend;

    public void printSummary(){
        System.out.printf("Cost: %d\nName: %s\nRecommended: %s\n", this.costInCents, this.nameOfDish, this.wouldRecommend );
    }

}

