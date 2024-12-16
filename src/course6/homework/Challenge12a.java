package course6.homework;

public class Challenge12a {

    public static void main(String[] args) {

        boolean isRaining = true;
        boolean isSunny = false;

        System.out.println("The original values for our variables are:\n" + "-isRaining: " + isRaining + "\n-isSunny: " + isSunny);
        System.out.println("The negated values for our variables are:\n" + "-isRaining: " + !isRaining + "\n-isSunny: " + !isSunny);

        System.out.println("This can also be done by using 2 different variables to store the negated versions of isRaining and isSunny and print those instead.");
    }
}
