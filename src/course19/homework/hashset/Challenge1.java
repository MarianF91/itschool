package course19.homework.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Challenge1 {
    public static void main(String[] args) {
        Set<String> colors = new HashSet<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");

        Iterator<String> setIterator = colors.iterator();
        String lastElement = null;

        while (setIterator.hasNext()) {
            lastElement = setIterator.next();
        }
        if (lastElement != null) {
            System.out.println("Last element: " + lastElement);
        } else {
            System.out.println("Set is empty.");
        }
    }
}
