package recap.lists;

import java.util.ArrayList;

public class Recap7 {

    public static void main(String[] args) {

        arrayPrinting();

    }

    public static void arrayPrinting() {

        int[] numbers = {1, 10, 2, 3, 5, 100, 19, 2500, 17, 9};
        ArrayList<Integer> intList = new ArrayList<>();

        for (int number : numbers) {
            intList.add(number);
        }

        for (int number : intList) {

            System.out.println("List element: " + number);
        }
    }
}