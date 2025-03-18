package course19.homework.hashset;

import java.util.HashSet;
import java.util.Set;

public class Challenge12 {
    public static void main(String[] args) {
        Set<String> colors = new HashSet<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");

        System.out.println("Original set: " + colors);
        colors.clear();

        System.out.println("Empty set: " + colors);
    }
}
