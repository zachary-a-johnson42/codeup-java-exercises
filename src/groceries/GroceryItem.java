package groceries;

public class GroceryItem {
    private String groceryName;
    private int groceryAmount;

    GroceryItem(String name, int amount){
        this.groceryName = name;
        this.groceryAmount = amount;
    }

    public String getGroceryName() {
        return groceryName;
    }

    public void setGroceryName(String groceryName) {
        this.groceryName = groceryName;
    }

    public int getGroceryAmount() {
        return groceryAmount;
    }

    public void setGroceryAmount(int groceryAmount) {
        this.groceryAmount = groceryAmount;
    }
}
