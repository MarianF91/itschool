package course19.homework.arraylist;

import java.util.ArrayList;

public class Challenge7 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");

        final String SEARCH = "red";

        if (colors.contains(SEARCH)){
            int index = colors.indexOf(SEARCH);
            System.out.println("Element " + "<<" + SEARCH + ">>" + " found at index " + index + ".");
        } else {
            System.out.println("Element not found.");
        }
    }
}
