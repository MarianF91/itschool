package course19.homework.arraylist;

import java.util.ArrayList;

public class Challenge2 {

    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");

        for (String color : colors) {
            System.out.println(color);
        }
    }
}
