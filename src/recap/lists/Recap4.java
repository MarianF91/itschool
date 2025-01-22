package recap.lists;

import java.util.ArrayList;
import java.util.Collections;

public class Recap4 {

    public static void main(String[] args) {

        System.out.println("The sorted list is: " + listSorting());

    }

    public static ArrayList<Integer> listSorting() {

        int[] numbers = {1, 10, 2, 3, 5, 100, 19, 2500, 17, 9};
        ArrayList<Integer> intList = new ArrayList<>();

        for (int number : numbers){
            intList.add(number);
        }

        System.out.println("The original list is: " + intList);

        Collections.sort(intList);

        return intList;
    }
}