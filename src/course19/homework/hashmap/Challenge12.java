package course19.homework.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Challenge12 {
    public static void main(String[] args) {
        Map<String, String> colorsMap = new HashMap<>();
        colorsMap.put("warm color", "red");
        colorsMap.put("cold color", "blue");
        colorsMap.put("neutral", "white");

        Collection<String> colorsCollection = colorsMap.values();

        System.out.println(colorsCollection);
    }
}
