package course19.homework.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Challenge2 {
    public static void main(String[] args) {
        Set<String> colors = new HashSet<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");

        Iterator<String> setIterator = colors.iterator();
        String color;

        while (setIterator.hasNext()) {
            color = setIterator.next();
            System.out.println(color);
        }
    }
}
