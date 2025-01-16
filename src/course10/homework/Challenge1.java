package course10.homework;


import java.util.Arrays;

public class Challenge1 {

    public static void main(String[] args) {

        System.out.println("Your shopping list is: " + Arrays.toString(shoppingList()));
    }

    public static String[] shoppingList() {

       System.out.println("Add a product to the shopping list.");

        return new String[]{"milk", "cookies", "yogurt", "strawberries", "blueberries", "blackberries"};
    }
}