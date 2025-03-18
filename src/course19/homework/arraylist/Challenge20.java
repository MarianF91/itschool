package course19.homework.arraylist;

import java.util.ArrayList;

public class Challenge20 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("red");
        colors.add("green");
        colors.add("blue");

        System.out.println("Size: " + colors.size());

        colors.ensureCapacity(200);
    }
}
