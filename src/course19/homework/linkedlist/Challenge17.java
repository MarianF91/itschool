package course19.homework.linkedlist;

import java.util.LinkedList;

public class Challenge17 {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");

        System.out.println("List 1: " + colors);

        LinkedList<String> colors2 = new LinkedList<>();
        colors2.add("yellow");
        colors2.add("pink");
        colors2.add("orange");

        System.out.println("List 2: " + colors2);

        colors.addAll(colors2);

        System.out.println("Combined lists: " + colors);
    }
}
