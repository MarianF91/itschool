package course19.homework.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Challenge2 {

    public static void main(String[] args) {

        List<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");

        for (String color : colors) {
            System.out.println(color);
        }
    }
}
