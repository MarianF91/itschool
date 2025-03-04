package course19.homework.treemap;

import java.util.Map;
import java.util.TreeMap;

public class Challenge16 {
    public static void main(String[] args) {
        TreeMap<String, String> colorsMap = new TreeMap<>();
        colorsMap.put("warm color", "red");
        colorsMap.put("cold color", "blue");
        colorsMap.put("neutral", "white");

        System.out.println("The TreeMap is: " + colorsMap);

        String givenEntry = "color";

        System.out.println("Given key: " + givenEntry);

        Map.Entry<String, String> entry = colorsMap.lowerEntry(givenEntry);

        System.out.println("The greatest entry strictly less than the given entry: " + entry);
    }
}
