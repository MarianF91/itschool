package course19.homework.linkedlist;

import java.util.Collections;
import java.util.LinkedList;

public class Challenge15 {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");

        System.out.println("Original list: " + colors);

        Collections.swap(colors, 0,1);

        System.out.println("New list: " + colors);
    }
}
