package course19.homework.hashset;

import java.util.HashSet;
import java.util.Set;

public class Challenge11 {
    public static void main(String[] args) {
        Set<String> colors = new HashSet<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");

        Set<String> colors2 = new HashSet<>();
        colors2.add("red");
        colors2.add("light red");
        colors2.add("dark red");

        System.out.println("Set 1: " + colors);
        System.out.println("Set 2: " + colors2);

        colors2.retainAll(colors);

        System.out.println("Common elements: " + colors2);
    }
}
