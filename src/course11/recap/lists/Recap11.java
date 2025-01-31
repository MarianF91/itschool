package course11.recap.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Recap11 {

    public static void main(String[] args) {

        ArrayList<Integer> list = listTransformation();
        System.out.println("The lowest number is: " + lowestNumber(list));
        System.out.println("The highest number is: " + highestNumber(list));
        System.out.println("The original list is: " + listTransformation());

    }

    public static ArrayList<Integer> listTransformation() {

        int size = 7;
        ArrayList<Integer> randomIntegersToArray = new ArrayList<>();
        Random randomIntegers = new Random();

        for (int i = 0; i < size; i++) {

            randomIntegersToArray.add(randomIntegers.nextInt());

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