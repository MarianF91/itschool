package course11.recap.lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Recap3 {

    public static void main(String[] args) {

        String[] list = {"element 1", "element 2", "element 3"};
        ArrayList<String> listOfThings = new ArrayList<>(List.of(list));
        String search;
        Scanner scan = new Scanner(System.in);

        System.out.println("This is the list of elements: " + listOfThings);
        System.out.println("Enter the name of an element you wish to search for.");
        search = scan.nextLine();

        if (listOfThings.contains(search)){
            System.out.println("The element is in the list.");
        } else {
            System.out.println("The element is not in the list.");
        }
    }
}