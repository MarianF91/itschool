package course19.homework.treemap;

import java.util.TreeMap;

public class Challenge3 {
    public static void main(String[] args) {
        TreeMap<String, String> colorsMap = new TreeMap<>();
        colorsMap.put("warm color", "red");
        colorsMap.put("cold color", "blue");
        colorsMap.put("neutral", "white");

        System.out.println("Does the code contain the key <neutral>? " + colorsMap.containsKey("neutral"));
        System.out.println("Does the code contain the key <color>? " + colorsMap.containsKey("color"));
    }
}
