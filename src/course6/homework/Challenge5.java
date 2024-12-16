package course6.homework;

public class Challenge5 {

    public static void main(String[] args) {

        int i = 1;
        int j = 1;

        System.out.println("First step: counting from 1 to 10 and printing each number.");

        for (i = 1; i <= 10; i++){
            System.out.println(i);
        }

        System.out.println("\n");

        System.out.println("Second step: counting from 1 to 10 and printing only even numbers.");
        for (j = 1; j <=10; j++) {
            if (j % 2 == 0){
                System.out.println(j);
            }
        }
    }
}