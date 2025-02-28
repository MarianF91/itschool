package course18recap.challenge9;

public class Main {

    public static void main(String[] args) {
        Person person = new Person();
        person.setAddress("Sweet Home Alabama");
        person.setAge(65);
        person.setName("Alabama-Man, the Alabama superhero");

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Address: " + person.getAddress());
    }
}
