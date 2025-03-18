package course20and21.challenge3;

import java.util.Objects;

public class Student {
    private final String name;
    private final int age;
    private final String email;
    private final int studentId;

    public Student(String name, int age, String email, int studentId) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.studentId = studentId;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        Student student = (Student) object;
        return Objects.equals(email, student.email) && Objects.equals(name, student.name) && age == student.age;
    }

    @Override
    public int hashCode(){
        return Objects.hash(name, age, email);
    }
}
