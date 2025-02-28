package course18recap.challenge5;

public record Animal(String name, String type, String sound) {

    public String animalInfo() {
        return "Animal name: " + name() + "\nAnimal type: " + type();
    }
}
