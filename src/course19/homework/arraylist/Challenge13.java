package course19.homework.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Challenge13 {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");

        List<String> colors2 = new ArrayList<>();
        colors2.add("pink");
        colors2.add("violet");
        colors2.add("orange");

        System.out.println("First list: " + colors);
        System.out.println("Second list: " + colors2);
        System.out.println("Are lists equal? " + colors.equals(colors2));
    }
}
