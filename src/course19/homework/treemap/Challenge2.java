package course19.homework.treemap;

import java.util.TreeMap;

public class Challenge2 {
    public static void main(String[] args) {
        TreeMap<String, String> colorsMap = new TreeMap<>();
        colorsMap.put("warm color", "red");
        colorsMap.put("cold color", "blue");
        colorsMap.put("neutral", "white");

        TreeMap<String, String> colorsMap2 = new TreeMap<>(colorsMap);

        System.out.println(colorsMap2);
    }
}
