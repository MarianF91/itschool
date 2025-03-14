package course19.homework.treeset;

import java.util.TreeSet;

public class Challenge2 {
    public static void main(String[] args) {
        TreeSet<String> colors = new TreeSet<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");

        for (String color : colors) {
            System.out.println(color);
        }
    }
}
