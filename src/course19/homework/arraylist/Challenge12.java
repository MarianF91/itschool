package course19.homework.arraylist;

import java.util.ArrayList;

public class Challenge12 {

    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");

        System.out.println("Original list: " + colors);
        System.out.println("Sublist: " + colors.subList(1,2));
    }
}
