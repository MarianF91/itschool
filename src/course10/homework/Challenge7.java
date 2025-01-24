package course10.homework;

import java.util.ArrayList;

public class Challenge7 {

    public static void main(String[] args) {

        fruits();
    }

    public static void fruits() {

        ArrayList<String> fruitsList = new ArrayList<>();
        fruitsList.add("apple");
        fruitsList.add("banana");
        fruitsList.add("blueberry");
        fruitsList.add("strawberry");
        fruitsList.add("blackberry");
        fruitsList.add("pineapple");
        fruitsList.add("orange");
        fruitsList.add("grapes");

        System.out.println("Your original fruits list is: " + fruitsList);

        fruitsList.sort((firstFruit, secondFruit) -> {

            int compareByLength = Integer.compare(secondFruit.length(), firstFruit.length());

            if (compareByLength != 0) {
                return compareByLength;
            }
            return firstFruit.compareTo(secondFruit);
        });

        System.out.println("Your arranged fruits list is: " + fruitsList);
    }
}