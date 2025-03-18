package course20and21.challenge8;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Cache, String> cachedObjectsHashMap = new HashMap<>();

        Cache firstObject = new Cache("Batman", 1);
        Cache secondObject = new Cache("Robin", 2);
        Cache thirdObject = new Cache("Bruce Wayne", 1);
        Cache fourthObject = new Cache("Alfred", 3);

        cachedObjectsHashMap.put(firstObject, " First Object");
        cachedObjectsHashMap.put(secondObject, " Second Object");
        cachedObjectsHashMap.put(thirdObject, " Third Object");
        cachedObjectsHashMap.put(fourthObject, " Fourth Object");

        System.out.println("Cached objects: " + cachedObjectsHashMap);

    }
}
