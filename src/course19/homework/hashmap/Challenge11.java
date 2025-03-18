package course19.homework.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Challenge11 {
    public static void main(String[] args) {
        Map<String, String> colorsMap = new HashMap<>();
        colorsMap.put("warm color", "red");
        colorsMap.put("cold color", "blue");
        colorsMap.put("neutral", "white");

        Set<String> colorsSet = colorsMap.keySet();

        System.out.println(colorsSet);
    }
}
