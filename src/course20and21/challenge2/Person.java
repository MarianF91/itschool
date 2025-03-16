package course20and21.challenge2;

import java.util.Objects;

public class Person {
    private final int age;
    private final String name;
    private final String email;

    public Person(int age, String name, String email) {
        this.age = age;
        this.name = name;
        this.email = email;
    }

    @Override
    public boolean equals(Object object){
        if (this == object){
            return true;
        }
        if(object == null || getClass() != object.getClass()){
            return false;
        }
        Person person = (Person) object;
        return Objects.equals(name, person.name) && age == person.age;
    }

    @Override
    public int hashCode(){
        return Objects.hash(name, age);
    }
}
