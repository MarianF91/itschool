package course19.homework.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Challenge16 {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");

        List<String> colors2 = new ArrayList<>(colors);

        System.out.println(colors2);
    }
}
