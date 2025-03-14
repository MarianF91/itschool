package course19.homework.hashset;

import java.util.HashSet;
import java.util.Set;

public class Challenge6 {
    public static void main(String[] args) {
        Set<String> colors = new HashSet<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");

        Set<String> colors2 = new HashSet<>(colors);
        System.out.println(colors2);
    }
}
