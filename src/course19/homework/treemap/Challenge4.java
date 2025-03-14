package course19.homework.treemap;

import java.util.TreeMap;

public class Challenge4 {
    public static void main(String[] args) {
        TreeMap<String, String> colorsMap = new TreeMap<>();
        colorsMap.put("warm color", "red");
        colorsMap.put("cold color", "blue");
        colorsMap.put("neutral", "white");

        System.out.println("Does the code contain the value <white>? " + colorsMap.containsValue("white"));
        System.out.println("Does the code contain the value <color>? " + colorsMap.containsValue("color"));
    }
}
