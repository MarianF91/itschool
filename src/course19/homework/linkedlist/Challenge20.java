package course19.homework.linkedlist;

import java.util.LinkedList;

public class Challenge20 {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");

        System.out.println("Original list: " + colors);

        System.out.println("First element: " + colors.getFirst());

    }
}
