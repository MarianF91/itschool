package recap.lists;

import java.util.ArrayList;
import java.util.List;

public class Recap1 {

    public static void main(String[] args) {

        String[] list = {"element 1", "element 2", "element 3"};
        ArrayList<String> listOfThings = new ArrayList<>(List.of(list));

        for (String element : listOfThings) {

            System.out.println("This is an element of the list: " + element);
        }
    }
}