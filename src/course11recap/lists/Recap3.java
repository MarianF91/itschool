package course11recap.lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Recap3 {

    public static void main(String[] args) {

        ArrayList<String> listOfThings = new ArrayList<>(List.of("element 1", "element 2", "element 3"));
        Scanner scan = new Scanner(System.in);

        System.out.println("This is the list of elements: " + listOfThings);
        System.out.println("Enter the name of an element you wish to search for.");
        String search = scan.nextLine();

        if (listOfThings.contains(search)){
            System.out.println("The element is in the list.");
        } else {
            System.out.println("The element is not in the list.");
        }
    }
}