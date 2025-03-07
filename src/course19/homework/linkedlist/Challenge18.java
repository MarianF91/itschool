package course19.homework.linkedlist;

import java.util.LinkedList;

public class Challenge18 {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");

        LinkedList<String> colors2 = new LinkedList<>(colors);

        System.out.println(colors2);
    }
}
