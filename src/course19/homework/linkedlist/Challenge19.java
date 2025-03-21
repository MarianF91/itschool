package course19.homework.linkedlist;

import java.util.LinkedList;

public class Challenge19 {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");

        System.out.println("Original list: " + colors);
        String removedElement =  colors.removeFirst(); //saved the removed element inside a String variable

        System.out.println("First element: " + removedElement);

        System.out.println("New list: " + colors);
    }
}
