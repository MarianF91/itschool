package course19.homework.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Challenge7 {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");

        String search = "red";

        if (colors.contains("red")){
            int index = colors.indexOf(search);
            System.out.println("Element " + "<<" + search + ">>" + " found at index " + index + ".");
        } else {
            System.out.println("Element not found.");
        }
    }
}
