package course19.homework.hashset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Challenge7 {
    public static void main(String[] args) {
        Set<String> colors = new HashSet<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");

        System.out.println("Set: " + colors);
        System.out.println("Array: " + Arrays.toString(colors.toArray()));
    }
}
