package course19.homework.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class Challenge2 {
    public static void main(String[] args) {
        TreeSet<String> colors = new TreeSet<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");

        Iterator<String> colorsIterator = colors.iterator();
        String color;

        while (colorsIterator.hasNext()){
            color = colorsIterator.next();
            System.out.println(color);
        }
    }
}
