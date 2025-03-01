package course19.homework.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Challenge18 {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");

        System.out.println("Original list: " + colors);
        System.out.println("Is list empty?" + colors.isEmpty());

        colors.clear();

        System.out.println("Empty list: " + colors);
        System.out.println("Is list empty?" + colors.isEmpty());
    }
}
