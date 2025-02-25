package course18recap.challenge5;

public class Main {

    public static void main(String[] args) {
        Animal cat = new Animal("Little Beggar", "cat", "Meow");

        System.out.println(cat.animalInfo());
        System.out.println(cat.getSound());
    }
}
