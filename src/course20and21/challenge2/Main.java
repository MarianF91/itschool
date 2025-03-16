package course20and21.challenge2;


public class Main {
    public static void main(String[] args) {
        Person firstPerson = new Person(3, "Person one", "email@firstemail.com");
        Person secondPerson = new Person(3, "Person one", "email@secondemail.com");

        System.out.println("Hashcode for firstRectangle: " + firstPerson.hashCode());
        System.out.println("Hashcode for secondRectangle: " + secondPerson.hashCode());
        System.out.println("Are objects equal? " + firstPerson.equals(secondPerson));

    }
}
