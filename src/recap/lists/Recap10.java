package recap.lists;

import java.util.ArrayList;
import java.util.Collections;

public class Recap10 {

    public static void main(String[] args) {

        System.out.println("The new scores list is: " + gradesList());

    }

    public static ArrayList<Integer> gradesList() {

        int[] scores = {90, 85, 78, 88, 92};
        ArrayList scoresToArray = new ArrayList<>();

        for (int grade : scores) {
            scoresToArray.add(grade);
        }

        System.out.println("This is the original scores list: " + scoresToArray);

        scoresToArray.set(2, 95);

        return scoresToArray;
    }
}