package course19.homework.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Challenge3 {

    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");

        System.out.println("Original list: " + colors);

        colors.addFirst("yellow");

        System.out.println("New list: " + colors);
    }
}
