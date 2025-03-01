package course19.homework.arraylist;

import java.util.ArrayList;

public class Challenge19 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("red");
        colors.add("green");
        colors.add("blue");

        System.out.println("Size: " + colors.size());

        colors.removeFirst();
        colors.trimToSize();

        System.out.println("Size: " + colors.size());

    }
}
