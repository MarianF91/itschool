package course20and21.challenge3;

public class Main {
    public static void main(String[] args) {
        Student studentOne = new Student("Student One", 22, "studentmail@email.com", 12345);
        Student studentTwo = new Student("Student One", 22, "studentmail@email.com", 67890);

        System.out.println("Student One hashcode: " + studentOne.hashCode());
        System.out.println("Student Two hashcode: " + studentTwo.hashCode());
        System.out.println("Are objects equal? " + studentOne.equals(studentTwo));
    }
}
