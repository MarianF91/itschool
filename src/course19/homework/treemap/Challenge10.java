package course19.homework.treemap;

import java.util.Comparator;
import java.util.TreeMap;

public class Challenge10 {
    public static void main(String[] args) {
        TreeMap<String, String> colorsMap = new TreeMap<>();
        colorsMap.put("warm color", "red");
        colorsMap.put("cold color", "blue");
        colorsMap.put("neutral", "white");

        System.out.println("The TreeMap is: " + colorsMap);

        Comparator<String> comparatorForColorsMap = Comparator.reverseOrder();
        TreeMap<String, String> comparatorColorsMap = new TreeMap<>(comparatorForColorsMap);
        comparatorColorsMap.putAll(colorsMap);

        System.out.println("The reversed order of the key is: " + comparatorColorsMap.keySet());
    }
}
