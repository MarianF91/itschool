package course19.homework.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Challenge4 {
    public static void main(String[] args) {
        Map<String, String> colorsMap = new HashMap<>();
        colorsMap.put("warm color", "red");
        colorsMap.put("cold color", "blue");
        colorsMap.put("neutral", "white");

        System.out.println("Original map: " + colorsMap);

        colorsMap.clear();

        System.out.println("Empty map: " + colorsMap);
    }
}
