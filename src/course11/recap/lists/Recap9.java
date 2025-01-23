package course11.recap.lists;

import java.util.ArrayList;
import java.util.List;

public class Recap9 {

    public static void main(String[] args) {

        System.out.println("This is the new list of cities: " + citiesList());

    }

    public static ArrayList<String> citiesList() {

        String[] cityNames = {"New York", "Los Angeles", "Chicago", "Houston", "Phoenix"};
        ArrayList<String> cityNamesToArray = new ArrayList<>(List.of(cityNames));
        System.out.println("This is the original list of cities: " + cityNamesToArray);

        ArrayList<String> newCitiesList = new ArrayList<>();

        for (int i = 1; i < cityNamesToArray.size() - 1; i++) {

            newCitiesList.add(cityNamesToArray.get(i));

        }
        return newCitiesList;
    }
}