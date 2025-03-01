package course19.homework.linkedlist;

import java.util.LinkedList;

public class Challenge9 {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");

        System.out.println("Original list: " + colors);

        colors.add(1,"yellow");
        colors.add(3,"pink");

        System.out.println("New list: " + colors);
    }
}
