package course18recap.challenge4;

public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee("First Employee", 123);

        employee.setSalary(2000);
        employee.setJobTitle("The only employee in the company.");

        employee.displayEmployeeInfo();
    }
}
