package course19.homework.treemap;

import java.util.TreeMap;

public class Challenge8 {
    public static void main(String[] args) {
        TreeMap<String, String> colorsMap = new TreeMap<>();
        colorsMap.put("warm color", "red");
        colorsMap.put("cold color", "blue");
        colorsMap.put("neutral", "white");

        System.out.println("The TreeMap is: " + colorsMap);
        System.out.println("The lowest entry is: " + colorsMap.firstEntry());
        System.out.println("The highest entry is: " + colorsMap.lastEntry());
    }
}
