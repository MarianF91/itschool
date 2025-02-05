package course15.homework.challenge3;

public class Main {

    public static void main(String[] args) {

        Marks studentA = new A(75.1, 67.2, 99.5);
        Marks studentB = new B(100.00, 55.5, 70.2, 84.7);

        studentA.getPercentage();
        studentB.getPercentage();
    }
}