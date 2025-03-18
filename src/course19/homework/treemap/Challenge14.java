package course19.homework.treemap;

import java.util.NavigableMap;
import java.util.TreeMap;

public class Challenge14 {
    public static void main(String[] args) {
        TreeMap<String, String> colorsMap = new TreeMap<>();
        colorsMap.put("warm color", "red");
        colorsMap.put("cold color", "blue");
        colorsMap.put("neutral", "white");

        System.out.println("The TreeMap is: " + colorsMap);

        String givenKey = "neutral";

        System.out.println("Given key: " + givenKey);

        NavigableMap<String, String> mapPortion = colorsMap.headMap(givenKey, true);

        System.out.println("The portion of a map whose keys are less than or equal to the given key: " + mapPortion);
    }
}
