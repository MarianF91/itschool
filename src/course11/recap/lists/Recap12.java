package course11.recap.lists;

import java.util.ArrayList;
import java.util.Collections;

public class Recap12 {

    public static void main(String[] args) {

        System.out.println("The original list is: " + firstTenNaturalNumbers());
        System.out.println("The randomized list is: " + randomFirstTenNaturalNumbers());

    }

    public static ArrayList<Integer> firstTenNaturalNumbers() {

        int[] naturalNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ArrayList<Integer> naturalNumbersToArray = new ArrayList<>();

        for (int number : naturalNumbers) {

            naturalNumbersToArray.add(number);

        }
        return naturalNumbersToArray;
    }

    public static ArrayList<Integer> randomFirstTenNaturalNumbers() {

        ArrayList<Integer> list = firstTenNaturalNumbers();
        Collections.shuffle(list);

        return list;
    }
}