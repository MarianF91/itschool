package course18recap.challenge5;

public class Animal {

    private final String name;
    private final String type;
    private final String sound;

    public Animal(String name, String type, String sound) {
        this.name = name;
        this.type = type;
        this.sound = sound;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getSound() {
        return sound;
    }

    public String animalInfo(){
        return "Animal name: " + getName() + "\nAnimal type: " + getType();
    }
}
