package course19.homework.treeset;

import java.util.TreeSet;

public class Challenge3 {
    public static void main(String[] args) {
        TreeSet<String> colors = new TreeSet<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");

        TreeSet<String> colors2 = new TreeSet<>(colors);

        System.out.println(colors2);
    }
}
