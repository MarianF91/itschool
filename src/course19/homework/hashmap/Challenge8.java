package course19.homework.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Challenge8 {
    public static void main(String[] args) {
        Map<String, String> colorsMap = new HashMap<>();
        colorsMap.put("warm color", "red");
        colorsMap.put("cold color", "blue");
        colorsMap.put("neutral", "white");

       System.out.println("Does the map contain the color <red>? " + colorsMap.containsValue("red"));
    }
}
