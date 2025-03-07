package course19.homework.arraylist;

import java.util.ArrayList;

public class Challenge9 {

    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");

        ArrayList<String> colors2 = new ArrayList<>(colors);

        System.out.println(colors2);
    }
}
