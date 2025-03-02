package course19.homework.treeset;

import java.util.TreeSet;

public class Challenge5 {
    public static void main(String[] args) {
        TreeSet<String> colors = new TreeSet<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");

        System.out.println("TreeSet: " + colors);
        System.out.println("First element: " + colors.getFirst());
        System.out.println("Last element: " + colors.getLast());
    }
}
