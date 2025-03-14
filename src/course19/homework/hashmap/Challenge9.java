package course19.homework.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Challenge9 {
    public static void main(String[] args) {
        Map<String, String> colorsMap = new HashMap<>();
        colorsMap.put("warm color", "red");
        colorsMap.put("cold color", "blue");
        colorsMap.put("neutral", "white");

        System.out.println("Map: " + colorsMap);

        Set<Map.Entry<String, String>> colorsSet = colorsMap.entrySet();

        System.out.println("Set: " + colorsSet);
    }
}
