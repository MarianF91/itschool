package course15.homework.challenge3;

public class B extends Marks{
    private final double subject1;
    private final double subject2;
    private final double subject3;
    private final double subject4;

    public B(double subject1, double subject2, double subject3, double subject4) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.subject4 = subject4;
    }
    @Override
    public void getPercentage() {
        System.out.println("Percentage for student B is: " + ((subject1 + subject2 + subject3 + subject4) / 4) + "%");
    }
}
