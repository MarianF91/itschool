package course19.homework.treemap;

import java.util.TreeMap;

public class Challenge15 {
    public static void main(String[] args) {
        TreeMap<String, String> colorsMap = new TreeMap<>();
        colorsMap.put("warm color", "red");
        colorsMap.put("cold color", "blue");
        colorsMap.put("neutral", "white");

        System.out.println("The TreeMap is: " + colorsMap);

        String givenKey = "color";

        System.out.println("Given key: " + givenKey);

        String leastGreaterKey = colorsMap.higherKey(givenKey);

        System.out.println("The least key strictly greater than the given key: " + leastGreaterKey);
    }
}
