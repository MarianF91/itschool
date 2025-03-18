package course19.homework.linkedlist;

import java.util.LinkedList;

public class Challenge11 {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");

        for (int i = 0; i < colors.size(); i++) {

            System.out.println("\nColor: " + colors.get(i));
            System.out.println("Index: " + i);
        }
    }
}
