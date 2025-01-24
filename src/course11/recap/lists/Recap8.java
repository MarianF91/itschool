package course11.recap.lists;

import java.util.ArrayList;
import java.util.Arrays;

public class Recap8 {

    public static void main(String[] args) {

        System.out.println("The merged list is: " + listsMerge());

    }

    public static ArrayList<String> listsMerge() {

        int[] numbers = {1, 10, 2, 3, 5, 100, 19, 2500, 17, 9};
        String[] letters = {"a", "b", "c", "d", "e", "f", "g", "h", "i"};
        ArrayList<Integer> intList = new ArrayList<>();
        ArrayList<String> mergedList = new ArrayList<>();

        for (int number : numbers) {
            intList.add(number);
        }

        System.out.println("The first list is: " + intList);

        ArrayList<String> charList = new ArrayList<>(Arrays.asList(letters));

        System.out.println("The second list is: " + charList);

        for (int number : intList) {

            mergedList.add(String.valueOf(number));

        }

        for (String letter : charList) {

            mergedList.add(String.valueOf(letter));

        }

        return mergedList;
    }
}