package course11.recap.lists;

import java.util.ArrayList;

public class Recap7 {

    public static void main(String[] args) {

        arrayPrinting();

    }

    public static void arrayPrinting() {

        ArrayList<Integer> intList = new ArrayList<>();

        intList.add(1);
        intList.add(10);
        intList.add(2);
        intList.add(3);
        intList.add(5);
        intList.add(100);
        intList.add(19);
        intList.add(2500);
        intList.add(17);
        intList.add(9);

        Integer[] intArray = intList.toArray(new Integer[intList.size()]);

        for (int number : intArray) {

            System.out.println("List element: " + number);
        }
    }
}