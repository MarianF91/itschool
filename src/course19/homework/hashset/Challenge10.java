package course19.homework.hashset;

import java.util.HashSet;
import java.util.Set;

public class Challenge10 {
    public static void main(String[] args) {
        Set<String> colors = new HashSet<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");

        Set<String> colors2 = new HashSet<>();
        colors2.add("pink");
        colors2.add("orange");
        colors2.add("violet");

        System.out.println("Result after comparing the two is: " + colors.equals(colors2));
    }
}
