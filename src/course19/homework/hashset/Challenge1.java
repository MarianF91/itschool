package course19.homework.hashset;

import java.util.LinkedHashSet;
import java.util.Set;

public class Challenge1 {
    public static void main(String[] args) {
        Set<String> colors = new LinkedHashSet<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");

        System.out.println("Original set: " + colors);

        colors.add("orange");

        System.out.println("New set: " + colors);
    }
}
