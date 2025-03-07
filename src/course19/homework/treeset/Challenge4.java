package course19.homework.treeset;

import java.util.TreeSet;

public class Challenge4 {
    public static void main(String[] args) {
        TreeSet<String> colors = new TreeSet<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");

        System.out.println("Original TreeSet: " + colors);
        System.out.println("Reversed TreeSet: " + colors.reversed());
    }
}
