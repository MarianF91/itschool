package course18.challenge6;

public class Animal {

    /*Create a class Animal with attributes such as name, age, and species.
     Create a subclass Dog that inherits from the Animal class, and add attributes such as breed and size.
      Implement methods such as bark() and fetch() in the Dog class that use the attributes inherited from the Animal class.*/

    private String name;
    private final String species;
    private final int age;

    public Animal(int age, String species, String name) {
        this.age = age;
        this.species = species;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }
}