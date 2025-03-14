package course19.homework.linkedlist;

import java.util.Collections;
import java.util.LinkedList;

public class Challenge4 {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");

        Collections.reverse(colors);
        System.out.println(colors);
    }
}
