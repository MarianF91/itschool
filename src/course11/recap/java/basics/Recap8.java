package course11.recap.java.basics;

public class Recap8 {

    public static void main(String[] args) {

        double firstNumber = 3.5;
        int secondNumber;
        System.out.println("This is a double type variable, which will be added to an int type, using <<cast>>: " + firstNumber);

        secondNumber = (int) firstNumber;
        System.out.println("This is an int type variable which took the first variable's value, using cast: " + secondNumber);
    }
}