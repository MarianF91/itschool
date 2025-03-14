package course19.homework.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Challenge3 {
    public static void main(String[] args) {
        Map<String, String> colorsMap = new HashMap<>();
        colorsMap.put("warm color", "red");
        colorsMap.put("cold color", "blue");
        colorsMap.put("neutral", "white");

        Map<String, String> colorsMap2 = new HashMap<>(colorsMap);

        System.out.println(colorsMap2);
    }
}
