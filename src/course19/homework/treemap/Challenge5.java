package course19.homework.treemap;

import java.util.TreeMap;

public class Challenge5 {
    public static void main(String[] args) {
        TreeMap<String, String> colorsMap = new TreeMap<>();
        colorsMap.put("warm color", "red");
        colorsMap.put("cold color", "blue");
        colorsMap.put("neutral", "white");

        System.out.println("The TreeMap is: " + colorsMap);
        System.out.println("The keys for this TreeMap are: " + colorsMap.keySet());
    }
}
