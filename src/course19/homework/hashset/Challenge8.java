package course19.homework.hashset;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Challenge8 {
    public static void main(String[] args) {
        Set<String> colors = new HashSet<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");

        TreeSet<String> colors2 = new TreeSet<>(colors);

        System.out.println("HashSet: " + colors);
        System.out.println("TreeSet: " + colors2);
    }
}
