package course18recap.challenge6;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Animal firstDog =  new Dog(4, "Dog", "Giant", "Chihuahua", 4);
        int dogAge = firstDog.getAge();
        String dogSpecies = firstDog.getSpecies();
        String dogName = firstDog.getName();
        System.out.println(dogName);
        System.out.println(dogAge);
        System.out.println(dogSpecies);
        System.out.println("===================");

        Dog secondDog = new Dog(5, "Dog", "Little guy", "Saint Bernard", 7);
        secondDog.bark();
        secondDog.fetch();
        int secondDogSize = secondDog.getSize();
        System.out.println(secondDogSize);

        List<Animal> animalList = new ArrayList<>();
        animalList.add(firstDog);
        animalList.add(secondDog);

        for (Animal animal : animalList){
            System.out.println(animal.getAge());
        }
    }
}
