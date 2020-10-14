package groceries;

import java.util.ArrayList;

public class GroceryCategory {
    public String category;
    private ArrayList<GroceryItem> items;

    public GroceryCategory(String aCategory){
        this.category = aCategory;
    }

    public ArrayList<GroceryItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<GroceryItem> items) {
        this.items = items;
    }

    public void addItem(GroceryItem moreCalories){
        items.add(moreCalories);
    }
}
