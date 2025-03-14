package course19.homework.treemap;

import java.util.TreeMap;

public class Challenge12 {
    public static void main(String[] args) {
        TreeMap<String, String> colorsMap = new TreeMap<>();
        colorsMap.put("warm color", "red");
        colorsMap.put("cold color", "blue");
        colorsMap.put("neutral", "white");

        System.out.println("The TreeMap is: " + colorsMap);

        String givenKey = "color";
        String greatestKey = colorsMap.floorKey(givenKey);

        System.out.println("Given key: " + givenKey);
        System.out.println("The greatest key less than or equal to the given key: " + greatestKey);
    }
}
