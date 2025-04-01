package course22.homework.challenge5;

public class StringComparatorImpl {
    public static void main(String[] args) {
        StringComparator stringComparator = ((firstString, secondString) ->
                Integer.compare(firstString.length(), secondString.length()));

        String string1 = "I";
        String string2 = "like";
        String string3 = "food";
        String string4 = "and";
        String string5 = "sweets.";

        int firstComparison = stringComparator.compare(string1, string2);
        int secondComparison = stringComparator.compare(string2, string3);
        int thirdComparison = stringComparator.compare(string3, string4);
        int fourthComparison = stringComparator.compare(string4, string5);
        int fifthComparison = stringComparator.compare(string5, string1);

        System.out.println(string1 + " compared to " + string2 + " is: " + firstComparison);
        System.out.println(string2 + " compared to " + string3 + " is: " + secondComparison);
        System.out.println(string3 + " compared to " + string4 + " is: " + thirdComparison);
        System.out.println(string4 + " compared to " + string5 + " is: " + fourthComparison);
        System.out.println(string5 + " compared to " + string1 + " is: " + fifthComparison);
    }
}
