package groceries;
import util.Input;
import java.util.ArrayList;
import java.util.HashMap;

public class GroceryApp {
    public static void main(String[] args){
        // Set category hashmap? String will be the category, set by switch.
        // the Array list will be generated and pushed into?

        HashMap<String, ArrayList> categories = new HashMap<>();
        boolean groceryListBool = true;
        boolean addItemBool = true;
        //Prompt to see if they want to create grocery list.
            System.out.println("Would you like to make a grocery list?");
            groceryListBool = Input.yesNo();
            //If they say yes, get into it.
        do {
            if (groceryListBool) {
                //Prompt to add items to list
                System.out.println("Would you like to add an item to the list?");
                Input.getString();
                addItemBool = Input.yesNo();

                //If yes, get into adding an item
                if (addItemBool) {
                    System.out.println("Please choose a category");
                    System.out.println("1: Meat");
                    System.out.println("2: Grains");
                    System.out.println("3: Dairy");
                    System.out.println("4: Vegetables");
                    System.out.println("5: Fruits");
                    System.out.println("6: Other");

                    int categorySelection = Input.getInt();
                    String userCategory;

                    System.out.println(categorySelection);
                    // Set the category, to a hashmap?
                    switch (categorySelection) {
                        case 1:
                            userCategory = "Meat";
                            categories.putIfAbsent("Meat", new ArrayList<GroceryItem>());
                            break;
                        case 2:
                            userCategory = "Grains";
                            categories.putIfAbsent("Grains", new ArrayList<GroceryItem>());
                            break;
                        case 3:
                            userCategory = "Dairy";
                            categories.putIfAbsent("Dairy", new ArrayList<GroceryItem>());
                            break;
                        case 4:
                            userCategory = "Vegetables";
                            categories.putIfAbsent("Vegetables", new ArrayList<GroceryItem>());
                            break;
                        case 5:
                            userCategory = "Fruit";
                            categories.putIfAbsent("Fruit", new ArrayList<GroceryItem>());
                            break;
                        default:
                            userCategory = "Other";
                            System.out.println("Invalid Input. Category will be set to Other");
                            categories.putIfAbsent("Other", new ArrayList<GroceryItem>());
                    }

                    Input.getString();
                    //Push a grocery items into the category array list
                    System.out.println("What would you like to add to your shopping list?");
                    String groceryToAdd = Input.getString();
                    System.out.printf("How many %s would you like to add?%n", groceryToAdd);
                    int groceryAmountToAdd = Input.getInt();

                    // Creating item to push
                    GroceryItem newGroceryItem = new GroceryItem(groceryToAdd, groceryAmountToAdd);

                    //Try to push, looks like it works..
                    categories.get(userCategory).add(newGroceryItem);
                    System.out.println("THE CURRENT VALUE IN CATEGORIES IS");

                    System.out.println(categories.get(userCategory));
                }
            }
        } while(addItemBool);
        //They said no, exit. Or, it's the end, exit.
        System.out.println("Your grocery list is..");
        // I can't drill down into the GroceryItem object name and value..
        // Maybe set up ANOTHER hashmap? key item name, value is quantity??

        System.out.println("Thank you, goodbye!");
    }
}
