package course19.homework.hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Challenge9 {
    public static void main(String[] args) {
        Set<String> colors = new HashSet<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");

        System.out.println("Set: " + colors);

        List<String> colorsList = new ArrayList<>(colors);

        System.out.println("List: " + colorsList);

        ArrayList<String> colorsArrayList = new ArrayList<>(colors);

        System.out.println("ArrayList: " + colorsArrayList);
    }
}
