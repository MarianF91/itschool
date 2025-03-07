package course19.homework.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Challenge5 {
    public static void main(String[] args) {
        Map<String, String> colorsMap = new HashMap<>();
        colorsMap.put("warm color", "red");
        colorsMap.put("cold color", "blue");
        colorsMap.put("neutral", "white");

        System.out.println("Initial map: "  + colorsMap);
        System.out.println("Is map empty? " + colorsMap.isEmpty());

        colorsMap.clear();

        System.out.println("Empty map: " + colorsMap);
        System.out.println("Is map empty?: " + colorsMap.isEmpty());
    }
}
