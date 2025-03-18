package course19.homework.treemap;

import java.util.Map;
import java.util.TreeMap;

public class Challenge11 {
    public static void main(String[] args) {
        TreeMap<String, String> colorsMap = new TreeMap<>();
        colorsMap.put("warm color", "red");
        colorsMap.put("cold color", "blue");
        colorsMap.put("neutral", "white");

        System.out.println("The TreeMap is: " + colorsMap);

        Map.Entry<String, String> searchEntry = colorsMap.floorEntry("neutral");

        System.out.println("Floor entry for <neutral> is: " + searchEntry);
    }
}
