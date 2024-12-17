package course6.homework;

public class Challenge12b {

    public static void main(String[] args) {

        boolean isRaining = true;
        boolean isSunny = false;
        boolean negatedIsRaining = !isRaining;
        boolean negatedIsSunny = !isSunny;

        System.out.println("The original values for our variables are:\n" + "-isRaining: " + isRaining + "\n-isSunny: " + isSunny);
        System.out.println("The negated values for our variables are:\n" + "-isRaining: " + negatedIsRaining + "\n-isSunny: " + negatedIsSunny);

        System.out.println("This can also be done by printing directly the negated versions of isRaining and isSunny without creating 2 extra variables.");
    }
}
