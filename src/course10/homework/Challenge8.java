package course10.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Challenge8 {

    public static void main(String[] args) {

        movies();
    }

    public static void movies() {

        Scanner scan = new Scanner(System.in);
        String title;
        String[] movies = {"Titanic", "The Green Book", "The Green Mile", "Terminator", "Rambo", "Coach Carter"};
        ArrayList<String> movieTitles = new ArrayList<>(List.of(movies));
        boolean isTitleOnList = true;

        System.out.println("This is the movie list: " + Arrays.toString(movies));
        System.out.println("Enter a movie title to see if it is on the list.");
        title = scan.nextLine();

        for (String movieName : movieTitles) {

            if (movieName.equalsIgnoreCase(title)) {

                System.out.println("Your movie is in the list, at index=" + movieTitles.indexOf(movieName));
                isTitleOnList = false;
                break;

            }
        }
        if (isTitleOnList) {
            System.out.println("Your movie is not on the list.");
        }
    }
}