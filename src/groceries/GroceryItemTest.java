package groceries;

import java.util.ArrayList;

public class GroceryItemTest {
    public static void main(String[] args){
        ArrayList<GroceryItem> groceryList = new ArrayList<GroceryItem>();

        groceryList.add( new GroceryItem("chicken", 1));

        System.out.println(groceryList.get(0).getGroceryName());
        System.out.println(groceryList.get(0).getGroceryAmount());
    }
}
