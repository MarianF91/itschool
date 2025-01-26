package course12.homework.challenge1;

class Course {

    String hours;
    String description;
    String schedule;

    @Override
    public String toString() {
        return "Course{" +
                "hours='" + hours + '\'' +
                ", description='" + description + '\'' +
                ", schedule='" + schedule + '\'' +
                '}';
    }
}