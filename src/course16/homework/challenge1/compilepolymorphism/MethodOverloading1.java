package course16.homework.challenge1.compilepolymorphism;

public class MethodOverloading1 {

    public static void main(String[] args) {

        MethodOverloading1 sum = new MethodOverloading1();

        int intSum = sum.sum(1, 2);
        double doubleSum = sum.sum(1, 2);
        double doubleSum2 = sum.sum(1, 2.1);

        System.out.println(intSum);
        System.out.println(doubleSum);
        System.out.println(doubleSum2);
    }

    public int sum(int a, int b) {
        return a + b;
    }

    public double sum(double a, double b) {
        return a + b;
    }
}