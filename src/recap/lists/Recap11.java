package recap.lists;

import java.util.ArrayList;
import java.util.Collections;

public class Recap11 {

    public static void main(String[] args) {

        ArrayList<Integer> list = listTransformation();
        System.out.println("The lowest number is: " + lowestNumber(list));
        System.out.println("The highest number is: " + highestNumber(list));
        System.out.println("The original list is: " + listTransformation());

    }

    public static ArrayList<Integer> listTransformation() {

        int[] randomIntegers = {1, 2, 3, 4, 5, 6, 7};
        ArrayList<Integer> randomIntegersToArray = new ArrayList<>();

        for (int number : randomIntegers) {
            randomIntegersToArray.add(number);
        }

        return randomIntegersToArray;
    }

    public static int lowestNumber(ArrayList<Integer> list) {

        Collections.sort(list);
        return list.getFirst();
    }

    public static int highestNumber(ArrayList<Integer> list) {

        Collections.sort(list);
        return list.getLast();
    }

}