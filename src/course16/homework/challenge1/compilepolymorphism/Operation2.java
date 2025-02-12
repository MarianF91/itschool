package course16.homework.challenge1.compilepolymorphism;

public class Operation2 {

    public static void main(String[] args) {

        Operation2 sum = new Operation2();

        int firstSum = sum.sum(1,1);
        int secondSum = sum.sum(1,1,1);

        System.out.println(firstSum);
        System.out.println(secondSum);
    }

    public int sum(int a, int b) {
        return a + b;
    }

    public int sum(int a, int b, int c) {
        return a + b + c;
    }
}