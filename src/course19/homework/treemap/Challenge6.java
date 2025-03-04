package course19.homework.treemap;

import java.util.TreeMap;

public class Challenge6 {
    public static void main(String[] args) {
        TreeMap<String, String> colorsMap = new TreeMap<>();
        colorsMap.put("warm color", "red");
        colorsMap.put("cold color", "blue");
        colorsMap.put("neutral", "white");

        System.out.println("The TreeMap is: " + colorsMap);

        colorsMap.clear();

        System.out.println("The empty TreeMap is: " + colorsMap);
    }
}
