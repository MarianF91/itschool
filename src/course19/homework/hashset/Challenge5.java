package course19.homework.hashset;

import java.util.HashSet;
import java.util.Set;

public class Challenge5 {
    public static void main(String[] args) {
        Set<String> colors = new HashSet<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");

        System.out.println("Current set: " + colors);
        System.out.println("Is set empty? " + colors.isEmpty());

        colors.clear();

        System.out.println("\nNew set: " + colors);
        System.out.println("Is set empty? " + colors.isEmpty());
    }
}
