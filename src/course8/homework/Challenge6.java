package course8.homework;

public class Challenge6 {

    public static void main(String[] args) {

                StringBuilder firstObject = new StringBuilder("You must become a student.");
        StringBuilder secondObject = new StringBuilder("You must become a master.\n");

        System.out.println("The first phrase is: " + firstObject);
        System.out.println("The second phrase is: " + secondObject);

        firstObject.replace(18, 25, "master");
        secondObject.replace(18, 24, "student");

        System.out.println("After replacing <<student>> with <<master>> and vice-versa, we have:");
        System.out.println(firstObject);
        System.out.println(secondObject);

    }
}