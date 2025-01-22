package recap.lists;

import java.util.ArrayList;
import java.util.Collections;

public class Recap6 {

    public static void main(String[] args) {

        System.out.println("The reversed list is: " + listReversal());

    }

    public static ArrayList<Integer> listReversal() {

        int[] numbers = {1, 10, 2, 3, 5, 100, 19, 2500, 17, 9};
        ArrayList<Integer> intList = new ArrayList<>();

        for (int number : numbers){
            intList.add(number);
        }

        System.out.println("The original list is: " + intList);

        Collections.reverse(intList);

        return intList;
    }
}