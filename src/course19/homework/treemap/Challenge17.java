package course19.homework.treemap;

import java.util.TreeMap;

public class Challenge17 {
    public static void main(String[] args) {
        TreeMap<String, String> colorsMap = new TreeMap<>();
        colorsMap.put("warm color", "red");
        colorsMap.put("cold color", "blue");
        colorsMap.put("neutral", "white");

        System.out.println("The TreeMap is: " + colorsMap);

        String givenKey = "warm color";

        System.out.println("Given key: " + givenKey);

        String highestLowestKey = colorsMap.lowerKey(givenKey);

        System.out.println("The greatest key strictly less than the given key: " + highestLowestKey);
    }
}
