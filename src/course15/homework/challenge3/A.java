package course15.homework.challenge3;

public class A extends Marks {

    private final double subject1;
    private final double subject2;
    private final double subject3;

    public A(double subject1, double subject2, double subject3) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    @Override
    public void getPercentage() {
        System.out.println("Percentage for student A is: " + ((subject1 + subject2 + subject3) / 3) + "%");
    }

}