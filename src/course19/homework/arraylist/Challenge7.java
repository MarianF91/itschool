package course19.homework.arraylist;

import java.util.ArrayList;

public class Challenge7 {

    private final static String SEARCH = "red";

    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");



        if (colors.contains(SEARCH)){
            int index = colors.indexOf(SEARCH);
            System.out.println("Element " + "<<" + SEARCH + ">>" + " found at index " + index + ".");
        } else {
            System.out.println("Element not found.");
        }
    }
}
