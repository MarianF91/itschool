package course19.homework.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Challenge8 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");

        System.out.println("Original list: " + colors);

        Collections.sort(colors);

        System.out.println("Sorted list: " + colors);
    }
}
