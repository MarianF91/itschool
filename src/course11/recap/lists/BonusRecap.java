package course11.recap.lists;

import java.util.ArrayList;

public class BonusRecap {

    public static void main(String[] args) {

        ArrayList<Integer> integerArrayList = new ArrayList<>();

        integerArrayList.add(1);
        integerArrayList.add(2);

        System.out.println(integerArrayList);

        integerArrayList.add(1, 3);
        System.out.println(integerArrayList);
    }
}