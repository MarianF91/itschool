package course6.homework;

public class Challenge9 {

    public static void main(String[] args) {

        System.out.println("Step 1: Both variables are called USA.");
        String countryOne = "USA";
        String countryTwo = "USA";

        System.out.println("In this case, equals says countryTwo.equals(countryOne)) = " + countryTwo.equals(countryOne) + ", since " + countryOne
                        + " = " + countryTwo + ".");

        System.out.println("Step 2: countryTwo gets a new value.");

        if (countryTwo.equals("USA")){
            countryTwo = "UK";
        }

        System.out.println("In this case, equals says countryTwo.equals(countryOne)) = " + countryTwo.equals(countryOne) + ", since " + countryOne
                + " is not " + countryTwo + ".");
    }
}
