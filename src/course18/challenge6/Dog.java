package course18.challenge6;

public class Dog extends Animal {

    private final String breed;
    private final int size;

    public Dog(int age,
               String species,
               String name,
               String breed,
               int size) {
        super(age, species, name);
        this.breed = breed;
        this.size = size;
    }

    void bark() {
        System.out.println("The dog named " + getName() + " barks.");
    }

    void fetch() {
        System.out.println("The dog named " + getName() + " fetches the stick.");
    }

    public String getBreed() {
        return breed;
    }

    public int getSize() {
        return size;
    }
}