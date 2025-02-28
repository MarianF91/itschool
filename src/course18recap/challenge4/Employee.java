package course18recap.challenge4;

public class Employee {

    private final String name;
    private final int id;
    private double salary;
    private String jobTitle;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double annualIncome() {
        return getSalary() * 12;
    }

    public double salaryRaise() {
        return 0.1 * this.salary;
    }

    public void displayEmployeeInfo() {
        System.out.println("The employee's name is: " + name);
        System.out.println("The employee's id is: " + id);
        System.out.println("The employee's job title is: " + getJobTitle());
        System.out.println("The employee has a salary of: " + getSalary() + " euro.");
        System.out.println("The employee has an annual income of: " + annualIncome());
        System.out.println("The employee might get a raise of 10% (" + salaryRaise() + ") if he works hard enough.");
    }
}
