package recap.java.basics;

public class Recap5 {

    public static void main(String[] args) {

        /*Boolean Logic: Write a program that prompts
         the user to enter two boolean values.
         Use logical operators (&&, ||, !)
         to perform various operations on the values, such as
         AND, OR, and NOT.*/

        boolean firstBoolean = true;
        boolean secondBoolean = false;

        System.out.println("The result for AND is: " + (firstBoolean && secondBoolean));
        System.out.println("The result for OR is: " + (firstBoolean || secondBoolean));
        System.out.println("The negated values are: " + !firstBoolean + " and " + !secondBoolean);
    }
}